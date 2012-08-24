package com.volumetricpixels.vitals.main;

import org.spout.api.UnsafeMethod;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

import com.volumetricpixels.vitals.main.commands.AdminCommands;
import com.volumetricpixels.vitals.main.commands.GeneralCommands;
import com.volumetricpixels.vitals.main.configuration.VitalsConfiguration;

public class Vitals extends CommonPlugin {
	@SuppressWarnings("unused")
	private VitalsConfiguration config;

	private final AnnotatedCommandRegistrationFactory commandRegistration =
            new AnnotatedCommandRegistrationFactory(new SimpleInjector(this));
	
	@Override
	@UnsafeMethod
	public void onDisable() {
		
		getLogger().info("disabled.");
		
	}

	@Override
	@UnsafeMethod
	public void onEnable() {

		getLogger().info("v" + getDescription().getVersion() + " enabled.");
		
		// Register commands.
		getEngine().getRootCommand().addSubCommands(this, AdminCommands.class, commandRegistration);
		getEngine().getRootCommand().addSubCommands(this, GeneralCommands.class, commandRegistration);
	}
	
	public void onLoad() {
		config = new VitalsConfiguration(getDataFolder());
	}

}