package OOP1;

public class MySingleton {
    public static MySingleton instance;
    public int value = 10;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
