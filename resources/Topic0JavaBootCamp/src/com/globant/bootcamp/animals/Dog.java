package com.globant.bootcamp.animals;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.interfaces.Terrestrial;

public class Dog extends Animal<Dog> implements Terrestrial {

    public Dog(Gender gender) {
        super(gender);
    }

    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public Dog gaveBirth() {
        return null;
    }

    @Override
    public void walk() {

    }

    @Override
    public void makeSound() {
        System.out.println("Guauuu Guauuuu...");
    }
}
