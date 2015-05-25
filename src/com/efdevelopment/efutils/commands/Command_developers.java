package com.efdevelopment.efutils.commands;

import com.efdevelopment.efutil.EFUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY)
public class Command_developers extends BukkitCommand<EFUtils> {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.DARK_PURPLE + "The developers are Madgeek1450, Prozza, Wild1145 and AcidicCyanide! :D");
        return true;
    }
    
}
