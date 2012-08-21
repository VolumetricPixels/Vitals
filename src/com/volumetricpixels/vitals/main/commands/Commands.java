package com.volumetricpixels.vitals.main.commands;

import java.util.List;

import org.spout.api.chat.ChatSection;
import org.spout.api.chat.style.ChatStyle;
import org.spout.api.command.Command;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandExecutor;
import org.spout.api.command.CommandSource;
import org.spout.api.exception.CommandException;

public class Commands implements CommandExecutor {

	@Override
	public void processCommand(CommandSource source, Command cmd, CommandContext context) throws CommandException {
		String name = cmd.getPreferredName().toLowerCase();
		
		List<ChatSection> csl = context.getRawArgs();
		
		if(name.equals("time")) {
			if(csl.size() < 1) {
				source.sendMessage(ChatStyle.CYAN, "Usage: /time <day/night>");
			} else if(csl.get(0).getPlainString().equalsIgnoreCase("day"));
			//TODO: Get the Vanilla player, get the world, set the time to day.
			return;
		} else if(csl.get(0).getPlainString().equalsIgnoreCase("night")) {
			//TODO: Get the Vanilla player, get the world, set the time to night.
			return;
		} else if(name.equals("nick")) {
			if(csl.size() < 1) {
				source.sendMessage(ChatStyle.CYAN, "Usage: /nick [player] <nickname>");
			} else if(csl.size() == 1) {
				ChatSection newname = csl.get(0);
				//TODO: Set the Vanilla player's display name to 'newname' (arg 0)
			}
		}
	}
}
