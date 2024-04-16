package org.utilitymanager.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.utilitymanager.BaseModule.MainModule;
import org.utilitymanager.BaseModule.MessageModule;
import org.utilitymanager.Message.Message;
import org.utilitymanager.UtilityManager;

import java.util.EnumSet;
import java.util.Objects;

// 커맨드 를 할 수 있게 해줍니다!
public class CommandManager implements CommandExecutor {
    private final MainModule mainModule = new MainModule();
    private final MessageModule messageModule =new MessageModule();
    public CommandManager(UtilityManager UtilityManager) {
        for (Message message : EnumSet.range(Message.COMMAND_BROADCAST, Message.COMMAND_SUICIDE)) {
            Objects.requireNonNull(UtilityManager.getCommand(message.getMessage())).setExecutor(this);
        }
    }

    @Override
    public boolean onCommand( CommandSender sender, Command command, String label, String[] data) {
        Message message = Message.getByMessage(label);
        switch (message){
            case COMMAND_BROADCAST -> mainModule.broadcastMessage(sender, data);
            case COMMAND_SELF -> mainModule.selfMessage(sender,data);
            case COMMAND_SUICIDE -> mainModule.selfSuicide(sender,data);
            default -> help(sender,data);
        }
        return true;
    }
    private void help(CommandSender sender, String[] data){
        messageModule.sendPlayer(sender,Message.INFO_HELP.getMessage());
    }
}
