package com.byfx.bedgoboom.event;

import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.EnumFacing;

public class PlayerSleepInBedEvent {


    @SubscribeEvent(priority = EventPriority.HIGH)
    public void bedClicked(PlayerInteractEvent.RightClickBlock event) {
        EntityPlayer player = event.getEntityPlayer();
        IBlockState bs = event.getWorld().getBlockState(event.getPos());
        if (bs.getBlock() instanceof BlockBed){
//            BlockBed bb = (BlockBed) bs;
            if (player.dimension != 0) {
                event.setCanceled(true);
                
                World worldIn = event.getWorld();
                BlockPos pos = event.getPos();
                
                worldIn.destroyBlock(pos, false);
                event.getEntityPlayer().sendMessage(new TextComponentString("You are only allowed to spawn in dimension 0 (overworld)."));
                
                worldIn.newExplosion((Entity)null, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 5.0F, true, true);
                
            }
        }
    }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public void onSetSpawn(net.minecraftforge.event.entity.player.PlayerSetSpawnEvent e) {
       if (e.getEntityPlayer() != null){
           if (e.getEntityPlayer().dimension != 0){
           	e.setCanceled(true);
               e.getEntityPlayer().sendMessage(new TextComponentString("You are only allowed to set your spawn in dimension 0 (overworld)."));
               e.setResult(Event.Result.DENY);
           }
       }
   }
	
}


