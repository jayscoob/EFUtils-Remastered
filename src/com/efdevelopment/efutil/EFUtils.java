package com.efdevelopment.efutil;

import com.efdevelopment.efutils.commands.Command_adminrules;
import com.efdevelopment.efutils.commands.Command_requestop;
import com.efdevelopment.efutils.commands.Command_developers;
import com.efdevelopment.efutils.commands.Command_efutils;
import com.efdevelopment.efutils.commands.Command_griefreport;
import com.efdevelopment.efutils.commands.Command_groupmanager;
import com.efdevelopment.efutils.commands.Command_ineedhelp;
import com.efdevelopment.efutils.commands.Command_newbie;
import com.efdevelopment.efutils.commands.Command_requesthelp;
import com.efdevelopment.efutils.commands.Command_welcomenewb;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class EFUtils extends BukkitPlugin {
    
    public EFUtils plugin;
    public YamlConfig config;
    public BukkitCommandHandler handler;
    
    @Override
    public void onLoad() {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);
    }
    
    @Override
    public void onEnable() {
        BukkitLib.init(plugin);
        config = new YamlConfig(plugin, "config.yml", true);
        config.load();
        
        handler.setCommandLocation(Command_efutils.class.getPackage());
        handler.setCommandLocation(Command_requestop.class.getPackage());
        handler.setCommandLocation(Command_welcomenewb.class.getPackage());
        handler.setCommandLocation(Command_groupmanager.class.getPackage());
        handler.setCommandLocation(Command_adminrules.class.getPackage());
        handler.setCommandLocation(Command_ineedhelp.class.getPackage());
        handler.setCommandLocation(Command_newbie.class.getPackage());
        handler.setCommandLocation(Command_griefreport.class.getPackage());
        handler.setCommandLocation(Command_requesthelp.class.getPackage());
        handler.setCommandLocation(Command_developers.class.getPackage());
        
        LoggerUtils.info(plugin, "for " + config.getString("server-name") + " Version: " + plugin.getVersion() + " by " + plugin.getAuthor() + " is enabled.");
  }
    
  @Override
  public void onDisable() {
     LoggerUtils.info(plugin, "for " + config.getString("server-name") + " Version: " + plugin.getVersion() + " by " + plugin.getAuthor() + " was disabled."); 
      
  }
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
      return handler.handleCommand(sender, cmd, commandLabel, args); 
  }
  
}
