package org.hikuro.hikucraft;

import org.bukkit.event.Listener;
import org.hikuro.hikucraft.api.HikuCraftAPI;
import org.hikuro.hikucraft.provider.HikuCraftProvider;

public abstract class EventListener implements Listener {

	private static final HikuCraftAPI api = HikuCraftProvider.get();
}
