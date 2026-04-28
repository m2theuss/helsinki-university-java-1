
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: "+ c1);
            System.out.println("Second: "+ c2);


            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputSplited = input.split(" ");
            if(inputSplited.length < 2){
                continue;
            }
            String command = inputSplited[0];
            int amount = Integer.valueOf(inputSplited[1]);
            if(command.equals("add")){
                c1.add(amount);
            }else if(command.equals("move")){
                if(amount > 0){
                    if(c1.contains() >= amount){
                        c2.add(amount);
                        c1.remove(amount);
                    }else{
                        c2.add(c1.contains());
                        c1.remove(c1.contains());
                    }
                }

            }else if(command.equals("remove")){
                c2.remove(amount);
            }
        }
    }
}
