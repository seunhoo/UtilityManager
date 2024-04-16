package org.utilitymanager.BaseModule;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;
import org.utilitymanager.UtilityManager;

public class TaskModule {

    public BukkitTask runBukkitTaskLater(Runnable task, Long delay){
       return Bukkit.getScheduler().runTaskLater(UtilityManager.getPlugin(), task, delay);
    }
    public BukkitTask runBukkitTaskLater(Runnable task, double delay){
        return Bukkit.getScheduler().runTaskLater(UtilityManager.getPlugin(), task, (long)delay);
    }
    public BukkitTask runBukkitTaskLater(Runnable task, float delay){
        return Bukkit.getScheduler().runTaskLater(UtilityManager.getPlugin(), task, (long)delay);
    }

    public BukkitTask runBukkitTaskTimer(Runnable task, Long delay, Long tick){
        return Bukkit.getScheduler().runTaskTimer(UtilityManager.getPlugin(), task, delay,tick);
    }
    public void cancelBukkitTask(BukkitTask bukkitTask){
        Bukkit.getScheduler().cancelTask(bukkitTask.getTaskId());
    }
}
