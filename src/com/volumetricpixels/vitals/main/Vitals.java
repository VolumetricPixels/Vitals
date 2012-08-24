package com.volumetricpixels.vitals.main;

import org.spout.api.UnsafeMethod;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

import com.volumetricpixels.vitals.main.commands.AdminCommands;
import com.volumetricpixels.vitals.main.commands.GeneralCommands;
import com.volumetricpixels.vitals.main.configuration.VitalsConfiguration;

public class Vitals extends CommonPlugin {

	private VitalsConfiguration config;

	@Override
	public void onDisable() {
		getLogger().info("disabled.");
	}

	@Override
	public void onEnable() {
		config = new VitalsConfiguration(getDataFolder());

		// Register commands.
		AnnotatedCommandRegistrationFactory commandRegistration =
				new AnnotatedCommandRegistrationFactory(new SimpleInjector(this));
		getEngine().getRootCommand().addSubCommands(this, AdminCommands.class, commandRegistration);
		getEngine().getRootCommand().addSubCommands(this, GeneralCommands.class, commandRegistration);

		getLogger().info("v" + getDescription().getVersion() + " enabled.");
	}

	public VitalsConfiguration getConfig() {
		return config;
	}
}