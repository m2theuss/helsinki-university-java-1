import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        PointTracker pt = new PointTracker();

        System.out.println("Enter point totals, -1 stops:");
        while(true){
            String strValue = scanner.nextLine();
            int value = Integer.valueOf(strValue);
            if(value == -1){
                break;
            }
            pt.add(value);
            
        }

        System.out.printf("Point average (all): %.1f\n", pt.average());
        if(pt.averagePassing() == 0){
            System.out.println("Point average (passing):-");
        }else{
            System.out.printf("Point average (passing): %.1f\n", pt.averagePassing());
        }
        System.out.printf("Pass percentage: %s\n", pt.passPercentage());
        pt.gradeDistribuition();
    }
}


