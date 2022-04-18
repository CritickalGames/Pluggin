package me.Zg.AutoElements.notas;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {


    @EventHandler
    public void blockBreak(BlockBreakEvent event){
        System.out.print("Adiós mundo");
    
        Block block = event.getBlock();

        if(block.getType()==Material.STONE){
            block.setType(Material.DIRT);
            event.setCancelled(true);
        }else{
            Player player = event.getPlayer();
            String name = player.getName();
            player.sendMessage("Hola mundo, " + name);
            //player.get
        }
    }


}
