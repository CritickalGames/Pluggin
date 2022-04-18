package me.Zg.AutoElements;

import org.bukkit.plugin.java.JavaPlugin;

import me.Zg.AutoElements.notas.BlockBreak;
import me.Zg.AutoElements.notas.BlockPlace;

public class Main extends JavaPlugin{
    public void onEnable(){
        System.out.println("Hola mundo");
    
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        getServer().getPluginManager().registerEvents(new BlockPlace(), this);
   }
}