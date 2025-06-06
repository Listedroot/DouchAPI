package com.sunpowder.douch.api.util;

public class TextComponent {
    private final String text;
    public TextComponent(String text) { this.text = text; }
    public String getText() { return text; }
    @Override public String toString() { return text; }
}
