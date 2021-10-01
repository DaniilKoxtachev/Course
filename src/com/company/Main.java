package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();
        Animal animals[] = {cat, dog, cow, pig};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
