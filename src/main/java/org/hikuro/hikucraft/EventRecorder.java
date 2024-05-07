package org.hikuro.hikucraft;

import org.bukkit.plugin.java.JavaPlugin;

public class EventRecorder {

	private final JavaPlugin plugin;

	public EventRecorder(JavaPlugin plugin) {
		this.plugin = plugin;
	}

	public void register(EventListener listener) {
		this.plugin.getServer().getPluginManager().registerEvents(listener, plugin);
	}
}
