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

package com.volumetricpixels.vitals.commands;

import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.exception.CommandException;

public class GeneralCommands {

    @Command(aliases = { "whereami" }, usage = "[player]", desc = "Information on your location or [player].", min = 0, max = 1)
    @CommandPermissions("vitals.general.whereami")
    public void whereami(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish whereami
    }
    
    @Command(aliases = { "rules" }, desc = "View the rules", min = 0, max = 0)
    @CommandPermissions("vitals.command.rules")
    public void rules(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: View the rules
    }
    
    @Command(aliases = { "kit" }, desc = "Get a kit", min = 0, max = 1)
    @CommandPermissions("vitals.command.kit")
    public void kit(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Get a kit
    }
    
    @Command(aliases = { "who", "online", "list", "players" }, desc = "View online players", min = 0, max = 0)
    @CommandPermissions("vitals.command.who")
    public void who(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: View online players
    }
    
    @Command(aliases = { "biome" }, desc = "Show what biome a player is in", min = 0, max = 1)
    @CommandPermissions("vitals.command.biome")
    public void biome(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: View what biome
    }
    
    @Command(aliases = { "message", "pm", "msg", "tell" }, desc = "Send a player a message", min = 0, max = 2)
    @CommandPermissions("vitals.command.message")
    public void msg(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Send a player a message
    }
    
    @Command(aliases = { "afk" }, desc = "Go AFK", min = 0, max = 0)
    @CommandPermissions("vitals.command.afks")
    public void afk(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Go AFK
    }

}
