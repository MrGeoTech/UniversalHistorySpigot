package me.mrgeotech.main;

import java.io.IOException;
import java.net.ServerSocket;

import org.bukkit.plugin.java.JavaPlugin;

import me.mrgeotech.commands.UniversalHistoryCommand;

public class UniversalHistory extends JavaPlugin {
	
	@SuppressWarnings("unused")
	private UniversalHistoryCommand uhc;
	
	@Override
	public void onEnable() {
		uhc = new UniversalHistoryCommand(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean available(int port) {
		  boolean portFree;
		  try (ServerSocket ignored = new ServerSocket(port)) {
		      portFree = true;
		  } catch (IOException e) {
		      portFree = false;
		  }
		  return portFree;
	}
	
}
