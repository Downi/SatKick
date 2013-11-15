package de.dauni.bbsat.Listeners;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerJoinEvent implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(player.getName().contains("satgav")) {
			player.kickPlayer("Not allowed, lol.");
		}
	}
}
