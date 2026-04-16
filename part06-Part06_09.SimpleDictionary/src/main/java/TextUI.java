import java.util.Scanner;
public class TextUI{
    private SimpleDictionary sd;
    private Scanner scan;

    public TextUI(Scanner scan, SimpleDictionary sd){
        this.sd = sd;
        this.scan = scan;
    }

    public void start(){
        System.out.println("Command: ");
        String command = scan.nextLine();
        if(command.equals("end")){
            System.out.println("Bye bye!");
            return;
        }
        else if(command.equals("add")){
            System.out.print("Word: ");
            String word = scan.nextLine();
            System.out.print("Translation: ");
            String translation = scan.nextLine();
            sd.add(word, translation);
            start();
        }
        else if(command.equals("search")){
            System.out.print("To be translated: ");
            String wordToTranslate = scan.nextLine();
            if(sd.translate(wordToTranslate) != null){
                System.out.println("Translation: " + sd.translate(wordToTranslate));
                start();
            }else{
                System.out.println("Word "+ wordToTranslate +" was not found");
                start();
            }
        }else{
            System.out.println("Unknow command");
        }
    }
}