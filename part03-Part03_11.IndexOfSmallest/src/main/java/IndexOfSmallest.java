
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = -1;
        int smallest = 9999;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            position++;
            int actualNumber = Integer.valueOf(sc.nextLine());
            if(actualNumber == 9999){
                break;
            }
            if(actualNumber <= smallest){
                if(actualNumber != smallest){
                    list.clear();
                }
                smallest = actualNumber;
                list.add(position);
            }
        }
        System.out.println("Smallest number: "+smallest);
        for(int i = 0; i < list.size(); i++){
            System.out.println("Found at index: " + list.get(i));
        }
    }
}
