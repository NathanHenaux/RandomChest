package fr.nathan.randomchest;

import fr.nathan.randomchest.commands.CommandRandomChest;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import fr.nathan.randomchest.listeners.InteractEvent;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    public static void main(String[] args) {

    }

    Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onLoad() {

        logger.info("[RandomChest] Le plugin est en cour de chargement");
    }

    @Override
    public void onEnable() {

        logger.info("[RandomChest] Le plugin est activer avec succes !");

        getCommand("randomchest").setExecutor(new CommandRandomChest());

        PluginManager pm = Bukkit.getPluginManager();
		    pm.registerEvents(new InteractEvent(), this);
    }

    @Override
    public void onDisable() {

        logger.info("[RandomChest] Le plugin est desactiver avec succes !");
    }
}
