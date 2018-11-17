package terrapin47.terraworld.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.Packet;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketThreadUtil;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import terrapin47.terraworld.Terraworld;

@Mod.EventBusSubscriber(modid = Terraworld.MODID)
public class ItemTPEffect {

    public ItemTPEffect(EntityPlayer player) {
        doTPEffect(player);
    }

    //Number of ticks until the TP effect is executed.
    static private int ticksUntilTP = 0;

    //World time during the last tick.
    private long lastTick = 0;

    //Number of ticks that have passed since the item was used.
    private long ticksPassed = 0;

    //Is this TP effect ticking?
    private boolean isTicking = false;

    private void doTPEffect(EntityPlayer player) {
        if(!player.world.isRemote) { //Only execute server side
            if(ticksUntilTP == 0)
                executeTPEffect(player);
            else
                isTicking = true;
        }
    }

    private void executeTPEffect(EntityPlayer player)
    {
        BlockPos currentPosition = player.getPosition();
        if(!player.world.isRemote) { //Only teleport server side
            player.fallDistance = 0; //Set fall distance to 0 in case TP effect is performed mid air.)
            sendSoundPacket(player); //Send packet to play sound for the player teleporting.
            int spawnDimension = player.getSpawnDimension();
            BlockPos saveLocation = player.getBedLocation(spawnDimension);
            float bedOrientation = player.getBedOrientationInDegrees();
            if (saveLocation != null) {

                if (player.dimension != spawnDimension)
                    player.changeDimension(spawnDimension);

                player.setRotationYawHead(bedOrientation);
                player.setPositionAndUpdate(saveLocation.getX(), saveLocation.getY(), saveLocation.getZ());

            } else {
                BlockPos spawnPoint = player.world.getSpawnPoint();
                if (spawnPoint != null) {

                    if (player.dimension != spawnDimension)
                        player.changeDimension(spawnDimension);

                    int adjustY = player.world.getChunkFromBlockCoords(spawnPoint).getHeight(spawnPoint); //Get the height value, otherwise player will spawn in the ground
                    player.setPositionAndUpdate(spawnPoint.getX() + 0.5d, (double) adjustY, spawnPoint.getZ() + 0.5d);
                }
            }
        }
    }

    private void sendSoundPacket(EntityPlayer player) {
        player.getServer().addScheduledTask(() -> {
            player.fallDistance = 0; //Set fall distance to 0 on the client so there's no broken bones sound in case the player was falling wihle teleporting.
            player.playSound(SoundEvents.BLOCK_PORTAL_TRAVEL, 1.0f, 0.5f);
        });
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent evt)
    {
        if(isTicking) {
            EntityPlayer player = evt.player;
            if (!player.world.isRemote) { //Only execute server side
                if(evt.phase == TickEvent.Phase.START) {
                    lastTick = player.getEntityWorld().getTotalWorldTime(); //Initialize last tick so we can calculate delta.
                    return;
                }
                else {
                        ticksPassed += (player.getEntityWorld().getTotalWorldTime() - lastTick); //Increment by tick delta.
                        if(ticksPassed >= ticksUntilTP) {
                            executeTPEffect(player);
                            isTicking = false;
                        }
                }
            }
        }
    }

}
