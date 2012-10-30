/* 
 * This file is part of ${project_name}.
 * 
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * ${project_name} is licensed under the AGPLv3 License with a classpath exception and an additional provision that after 180 days, 
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
        
        if (VitalsConfiguration.ENABLE_VOLUMETRICBANS_HOOK.getBoolean(true)) { //For future spam detection
        	//TODO: Hook into VolumetricBans
        }
        
        if (VitalsConfiguration.ENABLE_HOMES_COMPONENTS.getBoolean(true)) {
        	//TODO: Register the homes
        }
        
        if (VitalsConfiguration.ENABLE_WARPS_COMPONENTS.getBoolean(true)) {
        	//TODO: Register the warps
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