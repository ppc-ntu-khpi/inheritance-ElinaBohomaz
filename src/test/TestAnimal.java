package test;

import domain.Squirrel;

public class TestAnimal {
    public static void main(String[] args) {
        Squirrel bilochka = new Squirrel("Горішок", 300, "Рудий");

        bilochka.eat();
        bilochka.speak();

        bilochka.gnaw();

        bilochka.climb();
        bilochka.collectNuts();

        System.out.println(bilochka.toString());
    }
}