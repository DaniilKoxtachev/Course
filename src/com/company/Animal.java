package com.company;

public class Animal {
    void voice() {
        System.out.println("Голос");
    }
}

class Cat extends Animal {
    @Override
    void voice() {
        System.out.println("Мяу");
    }
}

class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Гав");
    }
}

class Cow extends Animal {
    @Override
    void voice() {
        System.out.println("Муу");
    }
}

class Pig extends Animal {
    @Override
    void voice() {
        System.out.println("Хрю");
    }
}