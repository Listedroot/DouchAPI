package com.sunpowder.douch.api.event;

/**
 * Represents a generic event in the Douch Proxy API.
 * All events must provide a timestamp and a name for identification.
 */
public interface Event {
    /**
     * Returns the timestamp when the event was created.
     */
    long getTimestamp();
    /**
     * Returns the name of the event (e.g., PlayerJoinEvent).
     */
    String getName();
}
