package fr.nathan.randomchest.GuiRandomChest;

import fr.nathan.randomchest.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GuiRandomChest {
  public static Inventory RandomChest() {
    Inventory rc = Bukkit.createInventory( null, 27, "§8[§aRandomChest§8]" );

      rc.setItem( 0, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 1, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 2, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 3, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 4, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 5, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 6, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 7, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 8, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());

      rc.setItem( 9, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 10, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());

      rc.setItem( 11, new ItemBuilder( Material.TRAPPED_CHEST).setName("§3Tier I").toItemStack());

      rc.setItem( 12, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());

      rc.setItem( 13, new ItemBuilder( Material.CHEST).setName("§3Tier II").toItemStack());

      rc.setItem( 14, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());

      rc.setItem( 15, new ItemBuilder( Material.ENDER_CHEST).setName("§3Tier III").toItemStack());

      rc.setItem( 16, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 17, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());

      rc.setItem( 18, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 19, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 20, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 21, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 22, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 23, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 24, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 25, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());
      rc.setItem( 26, new ItemBuilder( Material.RED_STAINED_GLASS_PANE).setName("§e").toItemStack());

      return rc;

  }
}