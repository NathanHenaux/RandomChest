package fr.nathan.randomchest.commands;

import fr.nathan.randomchest.GuiRandomChest.GuiRandomChest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class CommandRandomChest implements CommandExecutor {
    Inventory Un = GuiRandomChest.RandomChest();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Seul un joueur peut executer cette commande");
            return false;
        }
        Player player = (Player) sender;
        if(label.equalsIgnoreCase("randomchest")) {
            player.openInventory(Un);
        }
        return false;
    }
}
