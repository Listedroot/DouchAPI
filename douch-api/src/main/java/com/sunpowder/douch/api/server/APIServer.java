package com.sunpowder.douch.api.server;

public interface APIServer {
    String getName();
    String getAddress();
    int getPort();
    boolean isOnline();
    int getOnlinePlayers();
}
