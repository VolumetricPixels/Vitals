package com.volumetricpixels.vitals.main.commands;

import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.exception.CommandException;
import org.spout.vanilla.entity.VanillaController;

public class GeneralCommands {
	
	@Command(aliases = {"slap"}, usage = "<target>", desc = "Slap a person!", min = 1, max = 1)
	@CommandPermissions("vitals.slap")
	public void slap(CommandContext args, CommandSource source) throws CommandException {
		//TODO: Finish slap command
	}
	
	@Command(aliases = {"rocket"}, usage = "<target>", desc = "Rocket a person!", min = 1, max = 1)
	@CommandPermissions("vitals.rocket")
	public void rocket(CommandContext args, CommandSource source) throws CommandException {
		//TODO: Finish command
	}
	
	@Command(aliases = {"barrage"}, usage = "<target>", desc = "Shoot arrows down on a person!", min = 1, max = 1)
	@CommandPermissions("vitals.barrage")
	public void barrage(CommandContext args, CommandSource source) throws CommandException {
		//TODO: Finish command
	}
	
}
