package org.utilitymanager.Message;

import org.bukkit.ChatColor;

import java.util.HashMap;
import java.util.Map;

public enum Message {

    // 기본
    DEFAULT("기본"),
    PREFIX(ChatColor.GOLD + "" + ChatColor.BOLD + "[UtilityManager]"),

    // Command
    COMMAND_BROADCAST("공지"),
    COMMAND_SELF("본인"),
    COMMAND_HELP("도움말"),
    COMMAND_SUICIDE("확률즉사"),

    // BroadCast
    BROADCAST_PREFIX(ChatColor.RED + "" + ChatColor.BOLD +  "[공지] "),

    // Info
    INFO_HELP(ChatColor.YELLOW + "./도움말 을 입력하여 명령어 확인"),

    // Error
    ERROR("에러"),


    ;

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    private static final Map<String, Message> messageInfoMap = new HashMap<>();

    static {
        for (Message message : Message.values()) {
            messageInfoMap.put(message.message, message);
        }
    }

    public static Message getByMessage(String message) {
        return messageInfoMap.getOrDefault(message,ERROR);
    }

}
