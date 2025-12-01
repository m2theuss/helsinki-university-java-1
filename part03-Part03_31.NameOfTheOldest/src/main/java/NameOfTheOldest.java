
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOldest = 0;
        String nameOldest = null;
        boolean firstTime = true;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] splitted = input.split(",");
            int ageInput = Integer.valueOf(splitted[1]);
            if(firstTime){
                ageOldest = ageInput;
                nameOldest = splitted[0];
                firstTime = false;

            }
            if(ageOldest < ageInput){
                ageOldest = ageInput;
                nameOldest = splitted[0];
            }

        }
        System.out.println("Name of the oldest: " + nameOldest);

    }
}
