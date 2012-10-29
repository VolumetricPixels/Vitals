package com.volumetricpixels.vitals.commands;

import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.exception.CommandException;

public class ChatCommands {
	
	//TODO: Add chat commands (mute, PM, etc.)
	
	@Command(aliases = { "mute" }, usage = "<target>", desc = "Mute a person from chatting.", min = 1, max = 1)
    @CommandPermissions("vitals.command.chat.mute")
    public void mute(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish mute command
    }

}
