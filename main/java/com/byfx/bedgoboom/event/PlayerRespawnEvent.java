package com.byfx.bedgoboom.event;


import com.byfx.bedgoboom.TeleporterRecall;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;



public class PlayerRespawnEvent {

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event)
	{
		if ((event.player).dimension != 0){
			event.player.changeDimension(0, new TeleporterRecall());
			
			
//			event.setCanceled(true);
			
//			event.player.respawnPlayer();
			
//			event.player.isDead = false;
//			event.player.readFromNBT(NBTTagCompound nbt);
			
//			BlockPos spawnpoint0 = event.player.getBedLocation(0);
			
//			event.player.dimension = 0;
			
//			event.player.setPosition(spawnpoint0.getX() + 0.5, spawnpoint0.getY() + 1, spawnpoint0.getZ() + 0.5);
			
			//event.player.dimension = 0; // change this value so other mods will see it as part of overworld?
			
//			World world0 = DimensionManager.getWorld(0);
//			WorldServer worldserver1 = event.player.world.getMinecraftServer().getServer().getWorld(0);
//			BlockPos spawnpoint0 = worldserver1.getSpawnPoint();
//		
//			event.player.setSpawnChunk(spawnpoint0, true, 0);
		}
	}

}
	
//	@SubscribeEvent(priority = EventPriority.HIGHEST)
//	public void onLivingDeathEvent(LivingDeathEvent event) //whenever the server sees you dying
//	{
//		if (event.getEntity() instanceof EntityPlayerMP) {
//			if (event.getEntity().dimension != 0){
//				event.getEntity().dimension = 0;
//			}
//	}