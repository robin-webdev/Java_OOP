import java.util.Scanner;

public final class InputUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputUtils() {
    }

    public static String getTextInput(String message) {
        while (true) {
            System.out.println(message);
            String value = SCANNER.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Input cannot be empty.");
        }
    }

    public static double getDoubleInput(String message) {
        while (true) {
            System.out.println(message);
            if (SCANNER.hasNextDouble()) {
                double value = SCANNER.nextDouble();
                SCANNER.nextLine();
                return value;
            }

            System.out.println("Invalid number. Please enter a valid decimal value.");
            SCANNER.nextLine();
        }
    }

    public static int getNumberInputWithinRange(String message, int lower, int upper) {
        while (true) {
            System.out.println(message);
            if (SCANNER.hasNextInt()) {
                int value = SCANNER.nextInt();
                SCANNER.nextLine();
                if (value >= lower && value <= upper) {
                    return value;
                }
            } else {
                SCANNER.nextLine();
            }

            System.out.println("Invalid choice. Enter a number between " + lower + " and " + upper + ".");
        }
    }
}
