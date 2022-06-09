package me.candiesjar.kylix.utils.config;

import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

@Getter
public class ConfigUtil {

    private final File file;
    private FileConfiguration fileConfiguration;

    public ConfigUtil(JavaPlugin plugin, String configuration) {

        this.file = new File(plugin.getDataFolder(), configuration);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            plugin.saveResource(configuration, false);
        }

        fileConfiguration = YamlConfiguration.loadConfiguration(file);

    }

    public void reload() {
        fileConfiguration = YamlConfiguration.loadConfiguration(file);
    }

}
