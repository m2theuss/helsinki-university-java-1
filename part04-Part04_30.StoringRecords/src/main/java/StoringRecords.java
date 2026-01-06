
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String filePath) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try(Scanner file = new Scanner(Paths.get(filePath))){
            while(file.hasNextLine()){
                String tmpValues = file.nextLine();
                String[] values = tmpValues.split(",");
                
                int convertedValue = Integer.valueOf(values[1]);
                persons.add(new Person(values[0],convertedValue));
                System.out.println(values[0] + ", " + values[1]);
            }
        }catch(Exception e){
            System.out.println("A error ocorred: " + e.getMessage());
        }
        // and printing the read records
        return persons;

    }
}
