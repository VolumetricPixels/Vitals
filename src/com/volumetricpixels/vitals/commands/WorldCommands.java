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

public class WorldCommands {

    @Command(aliases = { "vcreate" }, usage = "<world name> <world type[normal, nether, end]>", desc = "Create a new world.", min = 2, max = 2)
    @CommandPermissions("vitals.worlds.create")
    public void vcreate(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish command to make a new Vanilla world.
    }

    @Command(aliases = { "vdelete" }, usage = "<world name>", desc = "Delete a world", min = 1, max = 1)
    @CommandPermissions("vitals.worlds.delete")
    public void vdelete(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish command to delete a Vanilla world.
    }

}
