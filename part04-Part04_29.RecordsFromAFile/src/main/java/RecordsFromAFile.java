
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try(Scanner file = new Scanner(Paths.get(fileName))){
            while(file.hasNextLine()){
                String line = file.nextLine();

                String[] values = line.split(",");
                int number = Integer.valueOf(values[values.length - 1]);

                System.out.print(values[0] + ", ");
                if(number > 1){
                    System.out.println("age: " + values[values.length - 1] + " years");
                }else{
                    System.out.println("age: " + values[values.length - 1] + " year");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
