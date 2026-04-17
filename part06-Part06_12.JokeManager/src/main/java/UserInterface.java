import java.util.Scanner;
public class UserInterface{
    private JokeManager jm;
    private Scanner scan;

    public UserInterface(JokeManager jm, Scanner scan){
        this.jm = jm;
        this.scan = scan;
    }
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = scan.nextLine();
            if (command.equals("X")){
                return;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                jm.addJoke(scan.nextLine());
            } else if (command.equals("2")) {
                System.out.println(jm.drawJoke());
            } else if (command.equals("3")) {
                jm.printJokes();
            }
        }
    }
}