package me.ssagan.swimapp.model;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm a fish. I'm swimming.");
    }
}
