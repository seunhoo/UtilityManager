package org.utilitymanager.BaseModule;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerModule {
    public List<Player> getOnlinePlayers(){
        return new ArrayList<>(Bukkit.getOnlinePlayers());
    }

    public Boolean suicidePlayer(Player player){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(randomNumber == 0) {
            player.damage(Integer.MAX_VALUE);
            return true;
        }
        return false;
    }
}
