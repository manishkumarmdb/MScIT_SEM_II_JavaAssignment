package com.subodh.msc.it.java;

// Parent interface
interface Animal {
    void eat();
}

// Child interface extending another interface
interface Dog extends Animal {
    void bark();
}

// Class implementing the child interface
class PetDog implements Dog {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class InterfaceInheritanceExample {
    public static void main(String[] args) {
        PetDog myDog = new PetDog();
        myDog.eat();
        myDog.bark();
    }
}

