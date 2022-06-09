package me.candiesjar.kylix;

import co.aikar.commands.PaperCommandManager;
import me.candiesjar.kylix.commands.KylixCommand;
import me.candiesjar.kylix.utils.config.ConfigUtil;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kylix extends JavaPlugin {

    private static Kylix instance;

    private PaperCommandManager manager;

    private ConfigUtil configuration;
    private ConfigUtil messages;


    public static Kylix getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        instance = this;
        manager = new PaperCommandManager(this);


        configuration = new ConfigUtil(this, "config.yml");
        messages = new ConfigUtil(this, "messages.yml");


        manager.registerCommand(new KylixCommand());

    }

    @Override
    public void onDisable() {


    }

    public FileConfiguration getConfiguration() {
        return configuration.getFileConfiguration();
    }

    public FileConfiguration getMessages() {
        return messages.getFileConfiguration();
    }


}
