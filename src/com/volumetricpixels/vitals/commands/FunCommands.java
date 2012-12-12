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

public class FunCommands {

    @Command(aliases = { "slap" }, usage = "<target>", desc = "Slap a person!", min = 1, max = 1)
    @CommandPermissions("vitals.command.fun.slap")
    public void slap(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish slap command
    }

    @Command(aliases = { "rocket" }, usage = "<target>", desc = "Rocket a person!", min = 1, max = 1)
    @CommandPermissions("vitals.command.fun.rocket")
    public void rocket(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish command
    }

    @Command(aliases = { "barrage" }, usage = "<target>", desc = "Rain down arrows on someone!", min = 1, max = 1)
    @CommandPermissions("vitals.command.fun.barrage")
    public void barrage(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish command
    }

}
