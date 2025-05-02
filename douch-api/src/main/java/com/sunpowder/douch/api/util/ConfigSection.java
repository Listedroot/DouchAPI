package com.sunpowder.douch.api.util;

import java.util.Map;

public interface ConfigSection {
    String getString(String key);
    int getInt(String key, int def);
    boolean getBoolean(String key, boolean def);
    Map<String, Object> getAll();
}
