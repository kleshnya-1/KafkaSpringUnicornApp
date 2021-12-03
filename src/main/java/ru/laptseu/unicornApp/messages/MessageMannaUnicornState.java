package ru.laptseu.unicornApp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageMannaUnicornState extends MessageUnicornState{

    public MessageMannaUnicornState(int id, String name, int age,  int manna) {
        super(id, name, age);
        this.manna = manna;
    }



    @JsonProperty
    private final int manna;

}
