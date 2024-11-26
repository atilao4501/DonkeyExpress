package me.atilao45.burrinhoExpress.listeners;

import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;

public class HeadquartersListener implements Listener {
    @EventHandler
    public void onSignChange(SignChangeEvent event) {
        Player player = event.getPlayer();

        if(event.getLine(0).equalsIgnoreCase("[DonkeyExpress]") && event.getLine(1).equalsIgnoreCase("Build")) {
            player.sendMessage(
                    "DonkeyExpress Headquarters has been built."
            );
        }
    }
}
