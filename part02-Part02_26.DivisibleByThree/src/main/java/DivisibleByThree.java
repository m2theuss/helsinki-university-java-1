
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public static void divisibleByThreeInRange(int start, int second){
        for(;start <= second; start++){
            if(start % 3 == 0 ){
                System.out.println(start);
            }
        }
    }

}
