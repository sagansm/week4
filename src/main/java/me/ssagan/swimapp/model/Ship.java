package me.ssagan.swimapp.model;

public class Ship implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm a ship. I'm swimming.");
    }
}
