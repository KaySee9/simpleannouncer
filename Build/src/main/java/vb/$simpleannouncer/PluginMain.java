package vb.$simpleannouncer;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("announce10")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.10")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce9")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.9")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce8")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.8")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce7")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.7")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce6")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.6")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce5")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.5")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce4")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.4")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce3")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.3")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce2")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.2")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce1")) {
			try {
				org.bukkit.Bukkit
						.broadcastMessage(String.valueOf(PluginMain.getInstance().getConfig().get("messages.1")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("announce")) {
			try {
				commandSender.sendMessage("Usage: /announce1 to /announce10");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}
}
