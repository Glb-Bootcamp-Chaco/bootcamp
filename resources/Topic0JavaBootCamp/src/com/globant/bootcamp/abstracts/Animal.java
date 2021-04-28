package com.globant.bootcamp.abstracts;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.interfaces.Being;

public abstract class Animal<T> implements Being<T> {
    protected Gender gender;

    public Animal(Gender gender){
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public abstract void makeSound();

    protected static Gender randomGender()
    {
        return (Math.random() < 0.5) ? Gender.FEMALE : Gender.MALE;
    }
}
