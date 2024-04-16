package org.utilitymanager.BaseModule;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerModule {
    public List<Player> getOnlinePlayers(){
        return new ArrayList<>(Bukkit.getOnlinePlayers());
    }
}
