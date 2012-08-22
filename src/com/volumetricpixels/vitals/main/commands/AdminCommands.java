package com.volumetricpixels.vitals.main.commands;

import java.util.List;

import org.spout.api.chat.ChatSection;
import org.spout.api.chat.style.ChatStyle;
import org.spout.api.command.Command;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandExecutor;
import org.spout.api.command.CommandSource;
import org.spout.api.entity.Entity;
import org.spout.api.exception.CommandException;
import org.spout.api.geo.World;
import org.spout.vanilla.data.Weather;
import org.spout.vanilla.entity.VanillaController;
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
		if(name.equals("weather")) {
			if(csl.size() > 1) {
				source.sendMessage(ChatStyle.GRAY, "Usage: /weather <sunny/rainy/storm/check>");
			} else if(csl.size() == 1) {
				if(csl.get(0).equals("sunny") && source.hasPermission("vitals.weather.set")) {
					sky.setWeather(Weather.CLEAR);
					source.sendMessage(ChatStyle.GRAY, "Weather set to sunny!");
				} else if(csl.get(0).equals("rainy") && source.hasPermission("vitals.weather.set")) {
					sky.setWeather(Weather.RAIN);
					source.sendMessage(ChatStyle.GRAY, "Weather set to rainy!");
				} else if(csl.get(0).equals("storm") && source.hasPermission("vitals.weather.set")) {
					sky.setWeather(Weather.THUNDERSTORM);
					source.sendMessage(ChatStyle.GRAY, "Weather set to storm!");
				} else if(csl.get(0).equals("check") && source.hasPermission("vitals.weather.check")) {
					Weather weather = sky.getWeather();
					source.sendMessage(ChatStyle.GRAY, "The current weather is " + weather + ".");
				} else {
					source.sendMessage(ChatStyle.GRAY, "Incorrect syntax! Usage: /weather <sunny/rainy/storm/check>");
				}			
			}
		} else if(name.equals("time")) {
			if(csl.size() > 1) {
				source.sendMessage(ChatStyle.GRAY, "Usage: /time <day/night/dawn/dusk/check>");
			} else if(csl.size() == 1) {
				if(csl.get(0).equals("day") && source.hasPermission("vitals.time.change")) {
					sky.setTime(8000);
				} else if(csl.get(0).equals("night")) {
					sky.setTime(16000);
				}
			}
		}
		
	}
	
}