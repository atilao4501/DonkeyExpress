package me.atilao45.burrinhoExpress;

import me.atilao45.burrinhoExpress.listeners.HeadquartersListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HeadquartersListener(), this);
        getLogger().info("Donkey Express Plugin Ativado!");

    }

    @Override
    public void onDisable() {
        getLogger().info("Donkey Express Plugin Desativado!");
    }
}
