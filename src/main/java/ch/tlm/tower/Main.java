package ch.tlm.tower;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void helloNewPlayer(PlayerJoinEvent e)
    {
        e.getPlayer().sendMessage("Welcome. The Tower Plugin is in function.");
    }
}