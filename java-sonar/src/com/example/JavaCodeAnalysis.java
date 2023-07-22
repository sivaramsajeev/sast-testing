import java.util.Scanner;

public class JavaCodeAnalysis {

    // Intentional code smell: Unused variable
    public static void unusedVariable() {
        String unusedVariable = "This variable is unused.";
    }

    // Intentional vulnerability: Use of hard-coded password
    public static void hardcodedPassword() {
        String password = "123456";
    }

    // Intentional reliability issue: Division by zero
    public static void divisionByZero() {
        int numerator = 10;
        int denominator = 0;
        int result = numerator / denominator;
        System.out.println("The result of the division is: " + result);
    }

    // Intentional vulnerability: Command injection
    public static void commandInjection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a command: ");
        String cmd = scanner.nextLine();
        System.out.println("Executing command: " + cmd);
        scanner.close();
    }

    // Intentional reliability issue: Infinite loop
    public static void infiniteLoop() {
        while (true) {
            System.out.println("This loop will run forever!");
        }
    }

    public static void main(String[] args) {
        unusedVariable();
        hardcodedPassword();
        divisionByZero();
        commandInjection();
        infiniteLoop();
    }
}
