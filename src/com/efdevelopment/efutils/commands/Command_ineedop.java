package com.efdevelopment.efutils.commands;

import com.efdevelopment.efutil.EFUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY)
public class Command_ineedop extends BukkitCommand<EFUtils> {

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Bukkit.broadcastMessage(ChatColor.AQUA + "Giving " + sender.getName() + " OP.");
        LoggerUtils.info(sender.getName() + " requested op.");
        return true;
    }
    
}
