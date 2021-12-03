package ru.laptseu.unicornApp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageHappinessUnicornState extends MessageUnicornState{

    public MessageHappinessUnicornState(int id, String name, int age, int happiness) {
        super(id, name, age);
        this.happiness = happiness;
    }

    @JsonProperty
    private final int happiness;
}
