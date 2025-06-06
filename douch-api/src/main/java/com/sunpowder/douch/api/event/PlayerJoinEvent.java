package com.sunpowder.douch.api.event;

/**
 * Event fired when a player joins the proxy.
 */
public class PlayerJoinEvent implements Event {
    private final String username;
    private final long timestamp;
    public PlayerJoinEvent(String username) {
        this.username = username;
        this.timestamp = System.currentTimeMillis();
    }
    public String getUsername() { return username; }
    @Override public long getTimestamp() { return timestamp; }
    @Override public String getName() { return "PlayerJoinEvent"; }
}
