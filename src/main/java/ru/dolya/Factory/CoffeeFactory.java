package ru.dolya.Factory;

public class CoffeeFactory {

    public static Coffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
        };
    }

}
