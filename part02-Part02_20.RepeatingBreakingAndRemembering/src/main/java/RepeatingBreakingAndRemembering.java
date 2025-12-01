
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Give numbers:");
        double sum = 0;
        double amount = 0;
        double even = 0;
        double odd = 0;
        while(true){
            double number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            if((number % 2) == 0){
                even++;
            }else{
                odd++;
            }
            amount++;
            sum += number;
            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + (int)sum);
        System.out.println("Numbers: " + (int)amount);
        System.out.println("Average: " + (sum/amount));
        System.out.println("Even: " + (int)even);
        System.out.println("Odd: " + (int)odd);
    }
}
