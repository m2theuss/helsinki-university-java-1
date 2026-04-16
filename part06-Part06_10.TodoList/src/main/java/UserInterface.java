import java.util.Scanner;
public class UserInterface{
    private TodoList todo;
    private Scanner scan;

    public UserInterface(TodoList todo, Scanner scan){
        this.todo = todo;
        this.scan = scan;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.print("To add: ");
                todo.add(scan.nextLine());
            }else if(command.equals("list")){
                todo.print();
            }else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                todo.remove(Integer.valueOf(scan.nextLine()));
            }
        }
    }
}