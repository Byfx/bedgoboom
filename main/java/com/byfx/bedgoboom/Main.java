package com.byfx.bedgoboom;

import com.byfx.bedgoboom.event.PlayerRespawnEvent;
import com.byfx.bedgoboom.event.PlayerSleepInBedEvent;
import com.byfx.bedgoboom.util.Reference;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid= Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptableRemoteVersions = "*") // minecraft will know what to display in the mod options with this
public class Main {
	
	
	@Instance
	public static Main instance;
	// this mod exists
		
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new PlayerRespawnEvent());
		MinecraftForge.EVENT_BUS.register(new PlayerSleepInBedEvent());
	}

}
