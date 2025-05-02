package com.sunpowder.douch.api;

public class PluginDescription {
    private final String name;
    private final String version;
    private final String mainClass;
    public PluginDescription(String name, String version, String mainClass) {
        this.name = name;
        this.version = version;
        this.mainClass = mainClass;
    }
    public String getName() { return name; }
    public String getVersion() { return version; }
    public String getMainClass() { return mainClass; }
}
