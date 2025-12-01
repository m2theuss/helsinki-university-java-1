
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        boolean firstTime = true;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] splitted = input.split(",");
            int ageInput = Integer.valueOf(splitted[1]);
            if(firstTime){
                oldest = ageInput;
                firstTime = false;
            }
            if(oldest < ageInput){
                oldest = ageInput;
            }

        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
