package com.volumetricpixels.vitals.main;

import org.spout.api.UnsafeMethod;
import org.spout.api.plugin.CommonPlugin;

import com.volumetricpixels.vitals.main.configuration.VitalsConfiguration;

public class Vitals extends CommonPlugin {
	@SuppressWarnings("unused")
	private VitalsConfiguration config;

	@Override
	@UnsafeMethod
	public void onDisable() {
		
		getLogger().info("disabled.");
		
	}

	@Override
	@UnsafeMethod
	public void onEnable() {

		getLogger().info("v" + getDescription().getVersion() + " enabled.");
		
		//TODO: Register the commands from AdminCommands and GeneralCommands.
		
	}
	
	public void onLoad() {
		config = new VitalsConfiguration(getDataFolder());
	}

}