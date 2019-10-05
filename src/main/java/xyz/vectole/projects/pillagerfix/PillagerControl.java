package xyz.vectole.projects.pillagerfix;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pillager;
import org.bukkit.event.EventHandler;

public class PillagerControl implements Listener {
    @EventHandler
    public void onPillagerSpawn(CreatureSpawnEvent event) {
        if(event.getSpawnReason() == SpawnReason.PATROL) {
            Location location = event.getLocation();
            for(Entity entity : location.getWorld().getEntities()) {
                if(entity instanceof Pillager) {
                    if(((Pillager)entity).isPatrolLeader()) {
                        if(entity.getLocation().distance(location) <= location.getWorld().getViewDistance()*2) {
                            System.out.println("A pillager spawn has been cancelled!");
                            event.setCancelled(true);
                        }
                    }
                }
            }
        }
    }
}