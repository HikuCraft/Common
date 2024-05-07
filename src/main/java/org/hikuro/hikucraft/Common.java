package org.hikuro.hikucraft;

import org.bukkit.plugin.java.JavaPlugin;

public class Common extends JavaPlugin {
	@Override
	public void onEnable() {
		// Supposed to do nothing
		getLogger().info("Common plugin enabled");
	}

	@Override
	public void onDisable() {
		// Supposed to do nothing
		getLogger().info("Common plugin disabled");
	}
}
