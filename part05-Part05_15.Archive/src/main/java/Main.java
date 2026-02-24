
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            list.add(new Archive(name,identifier));
        }
       
        for(int i = list.size() - 1; i >= 0; i--){
            int amount = 0;
            for(int j = i; j >= 0; j--){
                if(list.get(i).equals(list.get(j))){
                    amount++;
                }
            }
            if(amount <= 1){
                System.out.println(list.get(i).getIdentifier() + ": " + list.get(i).getName());
                continue;
            }
        }
        
    }
}
