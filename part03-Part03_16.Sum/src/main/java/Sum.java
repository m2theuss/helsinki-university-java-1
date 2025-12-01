
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(sum(list));

    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int number : list){
            sum += number;
        }
        return sum;
    }

}
