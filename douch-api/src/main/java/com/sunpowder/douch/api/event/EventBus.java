package com.sunpowder.douch.api.event;

/**
 * EventBus is responsible for registering listeners and dispatching events in the Douch Proxy API.
 */
public interface EventBus {
    <T extends Event> void register(Class<T> eventClass, EventListener<T> listener);
    <T extends Event> void unregister(Class<T> eventClass, EventListener<T> listener);
    void fire(Event event);
}
