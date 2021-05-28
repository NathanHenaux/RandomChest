package fr.nathan.randomchest.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InteractEvent implements Listener{
	@EventHandler
		public void onClick(InventoryClickEvent e) {

		if(e.getCurrentItem() == null) return;
		Player player = (Player) e.getWhoClicked();
		switch(e.getCurrentItem().getType()) {

			case RED_STAINED_GLASS_PANE:
				if(e.getInventory() Bukkit.getName() == "§8[§aRandomChest§8]")  {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§e")) {
						e.setCancelled(true);
					}
				}
			case TRAPPED_CHEST:
				if(e.getInventory() Bukkit.getName() == "§8[§aRandomChest§8]") {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3Tier I")) {
						e.setCancelled(true);
						/* Spawn un RandomChest Tier I */
					}
				}
			case CHEST:
				if(e.getInventory() Bukkit.getName() == "§8[§aRandomChest§8]") {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3Tier II")) {
						e.setCancelled(true);
						/* Spawn un RandomChest Tier II */
					}
				}
			case ENDER_CHEST:
				if(e.getInventory() Bukkit.getName() == "§8[§aRandomChest§8]") {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3Tier III")) {
						e.setCancelled(true);
						/* Spawn un RandomChest Tier III */
					}
				}
			default:
				break;
		}
	}
}

