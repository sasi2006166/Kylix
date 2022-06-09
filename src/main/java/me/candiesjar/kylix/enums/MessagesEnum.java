package me.candiesjar.kylix.enums;

import me.candiesjar.kylix.utils.chat.ChatUtil;
import org.bukkit.command.CommandSender;

public enum MessagesEnum {


    ;


    private final String path;

    MessagesEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }


    public void send(CommandSender sender) {

        if (ChatUtil.getString(this).equals("")) {
            return;
        }

        sender.sendMessage(ChatUtil.asComponent(ChatUtil.getFormattedString(this)));

    }

}
