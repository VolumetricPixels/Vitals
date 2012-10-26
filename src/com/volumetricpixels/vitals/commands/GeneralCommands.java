package com.volumetricpixels.vitals.commands;

import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.exception.CommandException;

public class GeneralCommands {
	
	@Command(aliases = { "whereami" }, usage = "[player]", desc = "Information on your location or [player].", min = 0, max = 1)
    @CommandPermissions("vitals.general.whereami")
    public void mute(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish whereami
    }
	
}
