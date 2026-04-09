package HomeWork_7;
public class Cat extends Pet {

    public Cat(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        energy += 15;
        System.out.println(petName + " eats quietly.");
    }

    @Override
    public void play() {
        energy -= 10;
        System.out.println(petName + " lazily swats at a toy.");
    }

    @Override
    public void sleep() {
        energy += 50;
        System.out.println(petName + " is sleeping...");
    }
}