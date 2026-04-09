package HomeWork_7;

import java.util.Random;

public class Bird extends Pet {

    public Bird(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        energy += 10;
        System.out.println(petName + " pecks at its food quickly.");
    }

    @Override
    public void play() {
        int loss = new Random().nextInt(21) + 10; // 10 to 30
        energy -= loss;
        System.out.println(petName + " soars through the sky!");
    }

    @Override
    public void sleep() {
        energy += 30;
        System.out.println(petName + " is sleeping...");
    }
}