
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfNumbers = 0;
        double avg = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            avg = avg + number;
            amountOfNumbers++;  
        }
        double finalAverage = avg / amountOfNumbers;
        System.out.println("Average of the numbers: " + finalAverage);
    }
}
