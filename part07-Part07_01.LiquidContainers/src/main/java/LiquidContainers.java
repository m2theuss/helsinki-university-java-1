
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: "+ first + "/" + 100);
            System.out.println("Second: "+ second + "/" + 100);


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
            if(amount < 0){
                continue;
            }
            if(command.equals("add")){
                if(amount + first > 100){
                    first = 100;
                    continue;
                }
                first += amount;
            } else if(command.equals("move")){
                if(first < amount){
                    if(first > 0){
                        int tmp = first;
                        first = 0;
                        second = tmp;
                    }
                    continue;
                }
                int tmp = 0;
                tmp = first; 
                first -= amount;
                if(tmp - first == second || (tmp - first)+second > 100){
                    second = 100;
                    continue;
                }
                
                second = tmp - first; 
            } else if(command.equals("remove")){
                if(second < amount){
                    continue;
                }
                second -= amount;
            }

        }
    }

}
