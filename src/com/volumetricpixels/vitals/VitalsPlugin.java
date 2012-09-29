package com.volumetricpixels.vitals;

import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.exception.ConfigurationException;
import org.spout.api.plugin.CommonPlugin;

import com.volumetricpixels.vitals.commands.AdminCommands;
import com.volumetricpixels.vitals.commands.ChatCommands;
import com.volumetricpixels.vitals.commands.FunCommands;
import com.volumetricpixels.vitals.commands.GeneralCommands;
import com.volumetricpixels.vitals.commands.ProtectionCommands;
import com.volumetricpixels.vitals.commands.WorldCommands;
import com.volumetricpixels.vitals.configuration.VitalsConfiguration;

public class VitalsPlugin extends CommonPlugin {

    private VitalsConfiguration config;

    @Override
    public void onEnable() {
        config = new VitalsConfiguration(getDataFolder());
        config.setWritesDefaults(true);

        try {
            config.load();
        } catch (ConfigurationException ex) {
            ex.printStackTrace();
        }

        //Register commands
        AnnotatedCommandRegistrationFactory commandRegistration = new AnnotatedCommandRegistrationFactory(new SimpleInjector(this));

        if (VitalsConfiguration.ENABLE_PROTECTIONS.getBoolean(true)) {
            getEngine().getRootCommand().addSubCommands(this, ProtectionCommands.class, commandRegistration);
        }

        if (VitalsConfiguration.ENABLE_WORLD_MANAGEMENT.getBoolean(true)) {
            getEngine().getRootCommand().addSubCommands(this, WorldCommands.class, commandRegistration);
        }

        if (VitalsConfiguration.ENABLE_FUN_COMMANDS.getBoolean(true)) {
            getEngine().getRootCommand().addSubCommands(this, FunCommands.class, commandRegistration);
        }

        if (VitalsConfiguration.ENABLE_CHAT_COMMANDS.getBoolean(true)) {
        	getEngine().getRootCommand().addSubCommands(this, ChatCommands.class, commandRegistration);
        }

        if (VitalsConfiguration.ENABLE_ADMIN_COMMANDS.getBoolean(true)) {
        	getEngine().getRootCommand().addSubCommands(this, AdminCommands.class, commandRegistration);
        }

        if (VitalsConfiguration.ENABLE_GENERAL_COMMANDS.getBoolean(true)) {
        	getEngine().getRootCommand().addSubCommands(this, GeneralCommands.class, commandRegistration);
        }

        //Log the plugin enabling
        getLogger().info("[Vitals] v" + getDescription().getVersion() + " enabled!");
    }

    @Override
    public void onDisable() {
        //Log the plugin disabling
        getLogger().info("[Vitals] v" + getDescription().getVersion() + " disabled!");

        try {
            config.save();
        } catch (ConfigurationException ex) {
            ex.printStackTrace();
        }
    }

    public VitalsConfiguration getConfig() {
        return config;
    }

}