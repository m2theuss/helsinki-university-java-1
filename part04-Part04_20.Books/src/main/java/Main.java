import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()){
                System.out.println();
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(sc.nextLine());

            books.add(new Book(title, year, pages));
        }
        System.out.print("What information will be printed? ");
        String typeOfInformation = sc.nextLine();
        if(typeOfInformation.equals("everything")){
            for(Book item : books){
                System.out.println(item);
            }
        }else if(typeOfInformation.equals("name")){
            for(Book item : books){
                System.out.println(item.getTitle());
            }
        }
    }
}
