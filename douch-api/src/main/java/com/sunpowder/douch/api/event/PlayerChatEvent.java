package com.sunpowder.douch.api.event;

public class PlayerChatEvent implements Event {
    private final String username;
    private final String message;
    private final long timestamp;
    public PlayerChatEvent(String username, String message) {
        this.username = username;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }
    public String getUsername() { return username; }
    public String getMessage() { return message; }
    @Override public long getTimestamp() { return timestamp; }
}
