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
