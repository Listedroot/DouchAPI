package com.sunpowder.douch.api.event;

public interface EventListener<T extends Event> {
    void onEvent(T event);
}
