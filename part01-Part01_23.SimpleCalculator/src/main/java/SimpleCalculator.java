
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine()); 

        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine()); 

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        int subtraction = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

        int multiplication = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);

        double division = 1.0*(firstNumber / secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}
