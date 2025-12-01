
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String words = scanner.nextLine();
            String[] splittedWords = words.split(" ");
            if(words.isEmpty()){
                break;
            }
            for(int i = 0; i < splittedWords.length; i++){
                String selectedString = splittedWords[i];
                if(selectedString.contains("av")){
                    System.out.println(splittedWords[i]);
                }
            }
        }

    }
}
