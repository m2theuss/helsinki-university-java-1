
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        while(true){
            String stringNumber = scanner.nextLine();
            if(stringNumber.equals("end")){
                break;
            }
            int cube = Integer.valueOf(stringNumber);
            System.out.println(cube * cube * cube);
        }
    }
}
