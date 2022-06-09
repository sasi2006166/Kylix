package me.candiesjar.kylix.enums;

import me.candiesjar.kylix.Kylix;

public enum ConfigEnum {


    KYLIX_HELP_PERMISSION("settings.admin_permission")

    ;


    private final String path;
    private final Kylix instance = Kylix.getInstance();

    ConfigEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String getString() {
        return instance.getConfiguration().getString(path);
    }

    public int getInt() {
        return instance.getConfiguration().getInt(path);
    }

}
