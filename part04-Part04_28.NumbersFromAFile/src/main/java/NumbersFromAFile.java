
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String filePath = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
            
        try(Scanner file = new Scanner(Paths.get(filePath))){
            int amount = 0;
            while(file.hasNext()){
                int number = Integer.valueOf(file.nextLine());
                if(number >= lowerBound && number <= upperBound){
                    amount++;
                }
            }
            System.out.println("Numbers: " + amount);
        }catch(Exception e){
            System.out.println("A error ocorred: "+ e.getMessage());
        }

    }

}
