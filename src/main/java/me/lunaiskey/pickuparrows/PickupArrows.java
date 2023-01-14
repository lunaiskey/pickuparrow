package me.lunaiskey.pickuparrows;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PickupArrows extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PickupArrowListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
