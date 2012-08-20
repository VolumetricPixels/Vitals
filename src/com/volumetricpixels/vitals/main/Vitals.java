package com.volumetricpixels.vitals.main;

import org.spout.api.UnsafeMethod;
import org.spout.api.plugin.CommonPlugin;

public class Vitals extends CommonPlugin {
	private VitalsConfiguration config; //TODO: Make a class VitalsConfiguration in vitals.configuration

	@Override
	@UnsafeMethod
	public void onDisable() {
		
		getLogger().info("disabled");
		
	}

	@Override
	@UnsafeMethod
	public void onEnable() {

		getLogger().info("v" + getDescription().getVersion() + " enabled.");
		
	}

}
