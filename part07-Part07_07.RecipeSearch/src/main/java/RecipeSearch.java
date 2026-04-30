
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("File to read: ");
            File file = new File(scanner.nextLine());
            Scanner scFile = new Scanner(file);
            System.out.print("File to read: ");
            System.out.print("Commands\n" + "list - lists the recipes\n" + "stop - stops the program\n");

            while(true){
                System.out.print("Enter command:");
                
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }

    }

}
