
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        while(true){
            System.out.prinln("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty){
                return;
            }
            System.out.prinln("Name? (empty will stop)");
            String name = scanner.nextLine();


        }
    }
}
