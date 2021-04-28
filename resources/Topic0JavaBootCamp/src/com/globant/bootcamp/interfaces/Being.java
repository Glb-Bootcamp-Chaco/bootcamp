package com.globant.bootcamp.interfaces;

public interface Being<T> {
    void breathe();
    void eat();
    void sleep();
    T gaveBirth();
}
