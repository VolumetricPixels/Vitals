package com.volumetricpixels.vitals.main.configuration;

import java.io.File;

import org.spout.api.util.config.ConfigurationHolder;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;

public class VitalsConfiguration extends ConfigurationHolderConfiguration {
	public static final ConfigurationHolder NameOfValueHere = new ConfigurationHolder("Value", "path", "to");

	public VitalsConfiguration(File dataFolder) {
		super(new YamlConfiguration(new File(dataFolder, "config.yml")));
		// TODO Auto-generated constructor stub
	}

}
