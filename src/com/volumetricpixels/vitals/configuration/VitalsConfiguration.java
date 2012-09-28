package com.volumetricpixels.vitals.configuration;

import java.io.File;

import org.spout.api.util.config.ConfigurationHolder;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;

public class VitalsConfiguration extends ConfigurationHolderConfiguration {

    public static final ConfigurationHolder ENABLE_FUN_COMMANDS = new ConfigurationHolder(true, "Enable", "Commands", "Fun");
    public static final ConfigurationHolder ENABLE_PROTECTIONS = new ConfigurationHolder(false, "Enable", "Protections");
    public static final ConfigurationHolder ENABLE_WORLD_MANAGEMENT = new ConfigurationHolder(false, "Enable", "WorldManagement");
    public static final ConfigurationHolder ENABLE_CHAT_COMMANDS = new ConfigurationHolder(true, "Enable", "Commands", "Chat");

    public VitalsConfiguration(File dataFolder) {
        super(new YamlConfiguration(new File(dataFolder, "config.yml")));
    }

}
