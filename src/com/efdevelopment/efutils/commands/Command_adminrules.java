package com.efdevelopment.efutils.commands;

import com.efdevelopment.efutil.EFUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import net.pravian.bukkitlib.config.YamlConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY)
public class Command_adminrules extends BukkitCommand<EFUtils> {
public YamlConfig config;
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        playerMsg(ChatColor.RED + "§4§lEXPLODINGFreedom §1§lAdmin §e§lRules: ");
        playerMsg(ChatColor.RED + "§4§l[1]§7 Respect players and admins");
        playerMsg(ChatColor.RED + "§4§l[2]§7 Don't smite admin just for the lulz or because you feel like it.");
        playerMsg(ChatColor.RED + "§4§l[3]§7 Admins can TP to any player they wish.");
        playerMsg(ChatColor.RED + "§4§l[4]§7 Dont brag about your rank or your perks. It makes the lower admins feel bad.");
        playerMsg(ChatColor.RED + "§4§l[5]§7 Be nice to fellow admins and players!");
        playerMsg(ChatColor.RED + "§4§l[6]§7 Don't say negative or mean things to other admins or players.");
        playerMsg(ChatColor.RED + "§4§l[7]§7 Don't try to act like the leader to higher ranked staff.");
        playerMsg(ChatColor.RED + "§4§l[8]§4 Don't grief or troll. It just feeds the trolls more encouragement.");
        playerMsg(ChatColor.DARK_RED + "§4§l[9]§4 Don't try and attempt to threat or DDoS any other admins or players. The law can get involved. ");
        playerMsg(ChatColor.RED + "§4§l[10]§7 A senior admin cannot boss anyone higher than them.");
        playerMsg(ChatColor.DARK_RED + "§4§l[11]§7 The Owner does not have to follow the rules. He owns the server.");
        playerMsg(ChatColor.DARK_RED + "§4§l[12]§c If someone makes a build dont try and copy it and call it your own.");
        playerMsg(ChatColor.DARK_RED + "§c§lNot following these rules can result in suspension or a hardcore punishment.");
            return true;
        
    }

    private void playerMsg(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
