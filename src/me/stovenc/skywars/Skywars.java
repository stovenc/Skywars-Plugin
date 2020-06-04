package me.stovenc.skywars;

import org.bukkit.plugin.java.JavaPlugin;

public final class Skywars extends JavaPlugin {
	private static Skywars instance;
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		instance = null;
	}
	
	public static Skywars getInstance() { return instance; }

}
