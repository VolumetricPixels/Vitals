package com.volumetricpixels.vitals.main.commands;

import java.util.List;

import org.spout.api.chat.ChatSection;
import org.spout.api.command.Command;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandExecutor;
import org.spout.api.command.CommandSource;
import org.spout.api.entity.Entity;
import org.spout.api.exception.CommandException;
import org.spout.api.geo.World;
import org.spout.vanilla.entity.VanillaController;
import org.spout.vanilla.entity.VanillaPlayerController;
import org.spout.vanilla.entity.world.VanillaSky;

public class AdminCommands implements CommandExecutor {

	@Override
	public void processCommand(CommandSource source, Command cmd, CommandContext context) throws CommandException {
		
		//Setting the Vanilla player.
		VanillaController vplayer = (VanillaController) source;
		Entity player = vplayer.getParent();
		
		//Setting the world
		World world = player.getWorld();
		
		//Getting the VanillaSky
		VanillaSky sky = VanillaSky.getSky(world);
		
		//Setting the varible for a command.
		String name = cmd.getPreferredName().toLowerCase();
		
		//Get all the args from a command
		List<ChatSection> csl = context.getRawArgs();
		
		//If the command is the weather command
		//TODO: Finish setting up the weather command.
		//sky.setWeather(Weather.typeHere); - sets the weather.
		
	}
	
}
