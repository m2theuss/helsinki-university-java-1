
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfNumbers = 0;
        double avg = 0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }else if(number > 0){
                avg = avg + number;
                amountOfNumbers++;  
            }
        }
        if(avg <= 0){
            System.out.println("Cannot calculae the average");

        }else{
            double finalAverage = avg / amountOfNumbers;
            System.out.println(finalAverage);
        }
    }
}
