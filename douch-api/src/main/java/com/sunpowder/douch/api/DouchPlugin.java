package com.sunpowder.douch.api;

public interface DouchPlugin {
    /**
     * Called when the plugin is enabled.
     */
    void onEnable(DouchAPI api);
    /**
     * Called when the plugin is disabled.
     */
    void onDisable();
}
