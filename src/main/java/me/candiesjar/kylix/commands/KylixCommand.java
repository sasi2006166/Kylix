package me.candiesjar.kylix.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.HelpCommand;
import co.aikar.commands.annotation.Subcommand;
import me.candiesjar.kylix.Kylix;
import me.candiesjar.kylix.enums.ConfigEnum;
import org.bukkit.command.CommandSender;

@CommandAlias("kylix")
public class KylixCommand extends BaseCommand {

    private final Kylix instance = Kylix.getInstance();

    private final String HYLIX_PERMISSION = ConfigEnum.KYLIX_HELP_PERMISSION.getString();


    @HelpCommand
    @Subcommand("help")
    @CommandPermission("test")
    public void onHelp(CommandSender sender) {


    }

    @Subcommand("reload")
    public void onReload(CommandSender sender) {

        instance.reloadConfig();


    }

}
