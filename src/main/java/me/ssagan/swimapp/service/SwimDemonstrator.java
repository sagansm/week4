package me.ssagan.swimapp.service;

import me.ssagan.swimapp.model.Fish;
import me.ssagan.swimapp.model.Ship;

public class SwimDemonstrator {
    public static void demonstrate(){
        Fish fish = new Fish();
        Ship ship = new Ship();
        SwimExecutor.makeSwim(fish);
        SwimExecutor.makeSwim(ship);
    }
}
