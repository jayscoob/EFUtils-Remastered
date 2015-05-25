package com.efdevelopment.efutils.commands;

import com.efdevelopment.efutil.EFUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;



@CommandPermissions(source = SourceType.ANY)
public class Command_groupmanager extends BukkitCommand<EFUtils> {

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.RED + "I'm sorry, this server does not run PEX/GroupManager, our custom rank system is ran through TotalFreedomMod, thank you!");        
        return true;
    }
    
}


