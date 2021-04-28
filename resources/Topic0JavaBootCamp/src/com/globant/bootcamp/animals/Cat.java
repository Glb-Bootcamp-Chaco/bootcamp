package com.globant.bootcamp.animals;

import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.enums.Gender;

public class Cat extends Animal<Cat> {

    public Cat(Gender gender) {
        super(gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Miauuuuu");
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
    public Cat gaveBirth() {
        return null;
    }
}
