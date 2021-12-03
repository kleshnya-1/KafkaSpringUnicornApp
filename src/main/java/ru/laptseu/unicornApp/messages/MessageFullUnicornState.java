package ru.laptseu.unicornApp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageFullUnicornState extends MessageUnicornState{

    public MessageFullUnicornState(int id, String name, int age, int health, int happiness, int manna, int hunger) {
        super(id, name, age);
        this.health = health;
        this.happiness = happiness;
        this.manna = manna;
        this.hunger = hunger;
    }

    @JsonProperty
    private final int health;

    @JsonProperty
    private final int happiness;

    @JsonProperty
    private final int manna;

    @JsonProperty
    private final int hunger;

}
