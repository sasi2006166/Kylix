package me.candiesjar.kylix.utils.chat;

import lombok.experimental.UtilityClass;
import me.candiesjar.kylix.Kylix;
import me.candiesjar.kylix.enums.MessagesEnum;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;

@UtilityClass
public class ChatUtil {

    private final Kylix instance = Kylix.getInstance();


    public String getString(MessagesEnum messagesEnum) {

        return instance.getConfig().getString(messagesEnum.getPath());

    }


    public Component asComponent(String s) {
        return Component.text(s);
    }


    public String getFormattedString(MessagesEnum messagesEnum) {

        return color(getString(messagesEnum));

    }

    public String color(String s) {

        return ChatColor.translateAlternateColorCodes('&', s);
    }


}
