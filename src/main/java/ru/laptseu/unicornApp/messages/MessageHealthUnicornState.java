package ru.laptseu.unicornApp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageHealthUnicornState  extends MessageUnicornState {

    public MessageHealthUnicornState(int id, String name, int age, int health) {
        super(id, name, age);
        this.health = health;
    }
    @JsonProperty
    private final int health;
}
