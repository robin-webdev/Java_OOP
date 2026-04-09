package HomeWork_7;

public class SimulationManager {

    public static void startSimulation() {
        System.out.println("Simulation Started!");

        Dog  max  = new Dog("Max");
        Cat  luna = new Cat("Luna");
        Bird sky  = new Bird("Sky");

        Pet.displaySimulationStats();
        System.out.println();

        // Eating
        max.eat();
        luna.eat();
        sky.eat();
        System.out.println();

        // Playing
        max.play();
        luna.play();
        sky.play();
        System.out.println();

        // Sleeping
        max.sleep();
        System.out.println();

        // Environment update
        Pet.updateEnvironment("Rainy");
        System.out.println();

        Pet.displaySimulationStats();
    }
}