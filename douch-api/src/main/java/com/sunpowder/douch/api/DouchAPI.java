package com.sunpowder.douch.api;

import com.sunpowder.douch.api.event.EventBus;
import com.sunpowder.douch.api.player.APIPlayer;
import com.sunpowder.douch.api.server.APIServer;

public interface DouchAPI {
    /**
     * Gets the global event bus for registering and firing events.
     */
    EventBus getEventBus();

    /**
     * Gets the player API for querying and interacting with players.
     */
    APIPlayer getPlayer(String username);

    /**
     * Gets the server API for backend server queries.
     */
    APIServer getServer(String name);
}
