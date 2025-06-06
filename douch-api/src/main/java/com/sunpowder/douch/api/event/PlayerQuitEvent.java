package com.sunpowder.douch.api.event;

/**
 * Event fired when a player quits the proxy.
 */
public class PlayerQuitEvent implements Event {
    private final String username;
    private final long timestamp;
    public PlayerQuitEvent(String username) {
        this.username = username;
        this.timestamp = System.currentTimeMillis();
    }
    public String getUsername() { return username; }
    @Override public long getTimestamp() { return timestamp; }
    @Override public String getName() { return "PlayerQuitEvent"; }
}
