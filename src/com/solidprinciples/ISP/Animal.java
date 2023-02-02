package com.solidprinciples.ISP;

/**
 * This interface says that all animals should be able to EAT, FLY and SWIM... THIS CAN't BE RIGHT
 * In the Below examples you can see that because we have the Animal Interface implemented in Bird and Fish
 * we have to have some implementation for all the methods in the interface.
 *
 * When we go to the FISH class we run into an issue. FISH CAN'T FLY.
 * Check out the other interfaces created in this package FLYABLE, EATABLE, SWIMMABLE
 * */
public interface Animal {
    void eat();
    void fly();
    void swim();
}

class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("I cant eat");
    }

    @Override
    public void fly() {
        System.out.println("I love to fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim if I feel like it");
    }
}


// WHY IS THE FISH FLYING? Something is wrong here. Fish is an ANIMAL, but they SHOULD NOT be able to fly high in the sky.
// HOW DO WE FIX THIS ISSUE??
class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("I cant eat");
    }

    @Override
    public void fly() {
        System.out.println("I CAN'T FLY!! Why is this happening to me.");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}

