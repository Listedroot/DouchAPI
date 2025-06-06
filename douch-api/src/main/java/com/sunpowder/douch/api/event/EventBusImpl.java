package com.sunpowder.douch.api.event;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventBusImpl implements EventBus {
    private final Map<Class<?>, CopyOnWriteArrayList<EventListener<?>>> listeners = new ConcurrentHashMap<>();

    @Override
    public <T extends Event> void register(Class<T> type, EventListener<T> listener) {
        listeners.computeIfAbsent(type, k -> new CopyOnWriteArrayList<>()).add(listener);
    }

    @Override
    public <T extends Event> void unregister(Class<T> type, EventListener<T> listener) {
        CopyOnWriteArrayList<EventListener<?>> ls = listeners.get(type);
        if (ls != null) {
            ls.remove(listener);
        }
    }

    @Override
    public void fire(Event event) {
        CopyOnWriteArrayList<EventListener<?>> ls = listeners.get(event.getClass());
        if (ls != null) {
            for (EventListener<?> l : ls) {
                @SuppressWarnings("unchecked")
                EventListener<Event> listener = (EventListener<Event>) l;
                listener.onEvent(event);
            }
        }
    }
} 