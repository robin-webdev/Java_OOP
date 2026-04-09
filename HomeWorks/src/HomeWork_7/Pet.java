package HomeWork_7;

public class Pet {
    protected String petName;
    protected int energy;

    static int totalPets = 0;
    static String environmentCondition = "Sunny";

    public Pet(String petName) {
        this.petName = petName;
        this.energy = 100;
        totalPets++;
    }

    public void eat()   { System.out.println(petName + " is eating!"); }
    public void play()  { System.out.println(petName + " is playing!"); }
    public void sleep() {
        energy = 100;
        System.out.println(petName + " is sleeping!");
    }

    public static void displaySimulationStats() {
        System.out.println("Total Pets Created: " + totalPets);
        System.out.println("Current Environment: " + environmentCondition);
    }

    public static void updateEnvironment(String newCondition) {
        environmentCondition = newCondition;
        System.out.println("Environment updated to: " + newCondition);
    }
}