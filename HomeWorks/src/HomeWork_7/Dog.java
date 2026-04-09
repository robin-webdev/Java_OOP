package HomeWork_7;

public class Dog extends Pet {

    public Dog(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        energy += 20;
        System.out.println(petName + " wags its tail while eating!");
    }

    @Override
    public void play() {
        energy -= 30;
        System.out.println(petName + " runs around happily!");
    }

    @Override
    public void sleep() {
        energy = 100;
        System.out.println(petName + " is sleeping...");
    }
}