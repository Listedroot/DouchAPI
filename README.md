# Douch Proxy API

This module provides the public API for the Douch Minecraft Proxy. Use this as a Maven dependency to interact with Douch via events, commands, and player/server interfaces.

## Usage

Add the following to your Maven `pom.xml`:

```xml
<dependency>
  <groupId>com.sunpowder.douch</groupId>
  <artifactId>douch-api</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Event System (v1.1+)

The API now provides a modern event system fully compatible with Douch Proxy:
- All events implement the `Event` interface, which provides `getTimestamp()` and `getName()`.
- Core events: `PlayerJoinEvent`, `PlayerQuitEvent`, `ServerSwitchEvent`, `PlayerChatEvent`, `ProxyPingEvent`, `CommandRegisterEvent`.
- Event priorities: `EventPriority` (LOW, NORMAL, HIGH).
- Event bus: Use `EventBus` or `EventBusImpl` to register/unregister listeners and fire events.

### Example: Listening for Player Join

```java
import com.sunpowder.douch.api.event.*;

public class MyPlugin {
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("Player joined: " + event.getUsername());
    }
}
```

### Example: Registering an Event Listener

```java
EventBus eventBus = new EventBusImpl();
eventBus.register(PlayerJoinEvent.class, event -> {
    System.out.println("Player joined: " + event.getUsername());
});
```

## API Contents
- Event system (PlayerJoinEvent, ServerSwitchEvent, ProxyPingEvent, CommandRegisterEvent, etc.)
- Event priorities (`EventPriority`)
- Event bus implementation (`EventBusImpl`)
- Player/server interfaces
- Utility classes

See JavaDocs for full details.
