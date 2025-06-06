package com.sunpowder.douch.api.player;

import java.util.UUID;

public interface APIPlayer {
    String getUsername();
    UUID getUuid();
    void sendMessage(String message);
    void kick(String reason);
    boolean hasPermission(String permission);
}
