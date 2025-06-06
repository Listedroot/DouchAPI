package com.sunpowder.douch.api.event;

/**
 * Event fired when a player switches servers within the proxy.
 */
public class ServerSwitchEvent implements Event {
    private final String username;
    private final String fromServer;
    private final String toServer;
    private final long timestamp;
    public ServerSwitchEvent(String username, String fromServer, String toServer) {
        this.username = username;
        this.fromServer = fromServer;
        this.toServer = toServer;
        this.timestamp = System.currentTimeMillis();
    }
    public String getUsername() { return username; }
    public String getFromServer() { return fromServer; }
    public String getToServer() { return toServer; }
    @Override public long getTimestamp() { return timestamp; }
    @Override public String getName() { return "ServerSwitchEvent"; }
}
