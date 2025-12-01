
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double counter = 0;
        String biggestName = null;
        boolean firstTime = true;

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] splittedInput = input.split(",");
            String name = splittedInput[0];
            int yearBirth = Integer.valueOf(splittedInput[1]);

            if(firstTime){
                firstTime = false;
                biggestName = name;
            }
            if(biggestName.length() < name.length()){
                biggestName = name;
            }
            sum += yearBirth;
            counter++;

        }
        System.out.println("Longest name: " + biggestName);
        System.out.println("Average of the birth years: " + sum/counter);
    }
}
