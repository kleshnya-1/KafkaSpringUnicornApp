package ru.laptseu.unicornApp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageHungerUnicornState extends MessageUnicornState{

    public MessageHungerUnicornState(int id, String name, int age, int hunger) {
        super(id, name, age);
        this.hunger = hunger;
    }


    @JsonProperty
    private final int hunger;

}
