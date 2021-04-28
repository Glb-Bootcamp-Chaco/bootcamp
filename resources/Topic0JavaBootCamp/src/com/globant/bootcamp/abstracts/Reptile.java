package com.globant.bootcamp.abstracts;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.animals.Egg;
import com.globant.bootcamp.interfaces.Terrestrial;

public abstract class Reptile extends Animal<Egg> {

    public Reptile(Gender gender) {
        super(gender);
    }
}
