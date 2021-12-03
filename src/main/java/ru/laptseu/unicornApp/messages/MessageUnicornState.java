package ru.laptseu.unicornApp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public abstract class MessageUnicornState {
    @JsonProperty
    private final int id;

    @JsonProperty
    private final String name;

    @JsonProperty
    private final int age;
}
