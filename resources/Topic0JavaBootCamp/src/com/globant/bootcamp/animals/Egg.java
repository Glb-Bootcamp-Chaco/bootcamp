package com.globant.bootcamp.animals;

import com.globant.bootcamp.abstracts.Animal;

public class Egg {
    public boolean isFertilze = false;

    private Animal baby;

    public Egg(Animal animal){
        this.baby = animal;
    }

}
