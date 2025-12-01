
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String words = scanner.nextLine();
            String[] splittedWords = words.split(" ");
            if(words.isEmpty()){
                break;
            }
            for(int i = 0; i < splittedWords.length; i++){
                System.out.println(splittedWords[i]);
            }
        }
    }
}
