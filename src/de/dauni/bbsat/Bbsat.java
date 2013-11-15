package de.dauni.bbsat;

import de.dauni.bbsat.Listeners.OnPlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Bbsat extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new OnPlayerJoinEvent(),
				this);

	}

	public void onDisable() {
	}

}
