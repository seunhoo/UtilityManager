package org.utilitymanager.BaseModule;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.utilitymanager.Message.Message;

public class MainModule {
    private final MessageModule messageModule = new MessageModule();
    private final PlayerModule playerModule = new PlayerModule();
    public void broadcastMessage(CommandSender sender, String[] data){
        messageModule.broadcastMessageNoPrefix(Message.BROADCAST_PREFIX.getMessage(), String.join(" ",data));
    }

    public void selfMessage(CommandSender sender, String[] data){
        messageModule.sendPlayerNoPrefix(sender, String.join(" ",data));
    }
    public void selfSuicide(CommandSender sender, String[] data){
        Player player = (Player) sender;
        if(data.length != 1){
            messageModule.sendPlayer(sender,Message.ERROR_COMMAND.getMessage());
            return;
        }
        if(playerModule.suicidePlayer(player)){
           messageModule.sendPlayerNoPrefix(player,Message.INFO_YOUR_ARE_SUICIDE.getMessage());
        }else{
            messageModule.sendPlayerNoPrefix(player,Message.INFO_YOUR_ARE_NOT_SUICIDE.getMessage());
        }
    }
}
