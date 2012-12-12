/* 
 * This file is part of Vitals.
 * 
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Vitals is licensed under the AGPLv3 License with a classpath exception and an additional provision that after 180 days, 
 * the license becomes MIT.
 * 
 * The VolumetricPixels License is a triple license combined out of the AGPL v3
 * License, the MIT License and the Classpath Exception License. 
 * 
 * You should have received a copy of the GNU Affero General Public License,
 * the MIT license and the VolumetricPixels License v1 along with this program.
 * If not, see <http://github.com/VolumetricPixels/Vitals/blob/master/License.txt>
 * for the full license.
*/

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
    public static final ConfigurationHolder ENABLE_ADMIN_COMMANDS = new ConfigurationHolder(true, "Enable", "Commands", "Admin");
    public static final ConfigurationHolder ENABLE_GENERAL_COMMANDS = new ConfigurationHolder(true, "Enable", "Commands", "General");
    public static final ConfigurationHolder ENABLE_VOLUMETRICBANS_HOOK = new ConfigurationHolder(false, "Enable", "Hooks", "VolumetricBans");
    public static final ConfigurationHolder ENABLE_HOMES_COMPONENTS = new ConfigurationHolder(true, "Enable", "Components", "Homes");
    public static final ConfigurationHolder ENABLE_WARPS_COMPONENTS = new ConfigurationHolder(true, "Enable", "Components", "Warps");

    public VitalsConfiguration(File dataFolder) {
        super(new YamlConfiguration(new File(dataFolder, "config.yml")));
    }

}