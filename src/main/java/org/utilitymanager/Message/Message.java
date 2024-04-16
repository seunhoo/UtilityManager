package org.utilitymanager.Message;

import org.bukkit.ChatColor;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Message {

    // 기본
    DEFAULT("기본"),
    PREFIX(ChatColor.GOLD + "" + ChatColor.BOLD + "[UtilityManager] "),

    // Command
    COMMAND_BROADCAST("공지"),
    COMMAND_SELF("본인"),
    COMMAND_HELP("도움말"),
    COMMAND_SUICIDE("확률즉사"),

    // BroadCast
    BROADCAST_PREFIX(ChatColor.RED + "" + ChatColor.BOLD + "[공지] " + ChatColor.RESET),

    // Info
    INFO_HELP(ChatColor.YELLOW + "./도움말 을 입력하여 명령어 확인"),

    INFO_YOUR_ARE_SUICIDE("당신은 50% 확률로" + ChatColor.RED + "즉사" + ChatColor.WHITE + "하였습니다." ),
    INFO_YOUR_ARE_NOT_SUICIDE("당신은 50% 확률로" + ChatColor.RED + "즉사" + ChatColor.WHITE + "하지 않았습니다." ),

    // Error
    ERROR("에러"),
    ERROR_COMMAND(ChatColor.DARK_RED + "잘못된 명령어입니다.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    private static final Map<String, Message> commandInfo = new HashMap<>();

    static {
        for (Message message : EnumSet.range(COMMAND_BROADCAST, COMMAND_SUICIDE)) {
            commandInfo.put(message.message, message);
        }
    }

    public static Message getByMessage(String message) {
        return commandInfo.getOrDefault(message, ERROR);
    }

}
