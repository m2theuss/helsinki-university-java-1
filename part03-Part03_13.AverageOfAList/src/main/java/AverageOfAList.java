
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();
        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        double sum = 0;
        for(double listSum : list){
            sum += listSum;
        }
        System.out.println("Sum: " + sum/list.size());
    }
}
