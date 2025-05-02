package com.sunpowder.douch.api.event;

public class PlayerJoinEvent implements Event {
    private final String username;
    private final long timestamp;
    public PlayerJoinEvent(String username) {
        this.username = username;
        this.timestamp = System.currentTimeMillis();
    }
    public String getUsername() { return username; }
    @Override public long getTimestamp() { return timestamp; }
}
