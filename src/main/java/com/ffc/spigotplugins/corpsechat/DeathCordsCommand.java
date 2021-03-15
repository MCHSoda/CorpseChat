package com.ffc.spigotplugins.corpsechat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeathCordsCommand implements CommandExecutor {
    private final Main main;
    public DeathCordsCommand(Main main){
        this.main = main;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            Player player = (Player) sender;
            if (player.isOp() || player.hasPermission("Cordinates")){


            }


            }

            main.getLogger().info("You have to be a player to get cords");
            return true;
        }

    }
