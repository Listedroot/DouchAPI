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

## Example

```java
import com.sunpowder.douch.api.event.PlayerJoinEvent;

public class MyPlugin {
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("Player joined: " + event.getUsername());
    }
}
```

## API Contents
- Event system (PlayerJoinEvent, ServerSwitchEvent, etc.)
- Player/server interfaces
- Utility classes

See JavaDocs for full details.
