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
