package ru.laptseu.unicornApp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Unicorn {

    private int id;
    private String name;
    private int age;
    private int health;
    private int happiness;
    private int manna;
    private int hunger;

    public void live(){

    }
}
