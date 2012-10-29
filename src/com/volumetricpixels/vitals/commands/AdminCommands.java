package com.volumetricpixels.vitals.commands;

import com.google.common.base.Joiner;

import org.apache.commons.lang3.StringUtils;

import org.spout.api.chat.style.ChatStyle;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.entity.Controller;
import org.spout.api.entity.Player;
import org.spout.api.exception.CommandException;

import org.spout.vanilla.data.Weather;
import org.spout.vanilla.entity.VanillaController;
import org.spout.vanilla.entity.world.VanillaSky;

/**
 * Commands for admins.
 */
public class AdminCommands {

    @Command(aliases = { "weather" }, usage = "<weather type>", desc = "Change the weather.", min = 1, max = 1)
    @CommandPermissions("vitals.command.weather")
    public void weather(CommandContext args, CommandSource source) throws CommandException {
        if (source instanceof Player) {
            // Getting the sky
            VanillaSky sky = VanillaSky.getSky(((Player) source).getWorld());

            // Get the weather
            String wName = args.getString(0);
            Weather w = Weather.valueOf(wName.toUpperCase());

            if (w == null) {
                source.sendMessage(ChatStyle.GRAY, "Unknown weather type '" + wName + "'. Available weather types: " + ChatStyle.RED, Joiner.on(' ')
                        .join(Weather.values()));
                return;
            }

            sky.setWeather(w);
            source.sendMessage(ChatStyle.GRAY, "Weather set to '" + ChatStyle.RED, StringUtils.capitalize(w.toString()) + "'.");
        }
    }

    @Command(aliases = { "time" }, usage = "<time>", desc = "Change the time.", min = 1, max = 1)
    @CommandPermissions("vitals.command.time")
    public void time(CommandContext args, CommandSource source) throws CommandException {
        // TODO: Finish the time command.
    }
    
    @Command(aliases = { "more" }, desc = "Set the item stack you are holding to 64.", min = 0, max = 0)
    @CommandPermissions("vitals.command.more")
    public void more(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Get the player, get inventory, and set stack size to 64
    }
    
    @Command(aliases = { "give", "i", "item" }, desc = "Give you or a player an item.", min = 1, max = 3)
    @CommandPermissions("vitals.command.give")
    public void give(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Finish give command
    }
    
    @Command(aliases = { "setspawn" }, desc = "Set the world spawn", min = 0, max = 0)
    @CommandPermissions("vitals.command.spawn.set")
    public void setspawn(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Set the spawn
    }
    
    @Command(aliases = { "spawn" }, desc = "Teleport yourself or another to the world spawn.", min = 0, max = 2)
    @CommandPermissions("vitals.command.spawn")
    public void spawn(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: Go to spawn
    }
    
    @Command(aliases = { "spawnmob" }, desc = "Spawn a mob.", min = 0, max = 2)
    @CommandPermissions("vitals.command.spawnmob")
    public void spawnmob(CommandContext args, CommandSource source) throws CommandException {
    	//TODO: View the rules
    }

}