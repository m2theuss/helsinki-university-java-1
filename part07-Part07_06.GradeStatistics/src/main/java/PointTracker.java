import java.util.ArrayList;
public class PointTracker{
    private ArrayList<Integer> pointList;

    public PointTracker(){
        this.pointList = new ArrayList<>();
    }
    public void add(int value) {
        if (value >= 0 && value <= 100) {
            this.pointList.add(value);
        }
    }
    public double average() {
        if (this.pointList.isEmpty()) {
            return 0.0;
        }

        int soma = 0;
        for (int point : this.pointList) {
            soma += point;
        }

        return 1.0 * soma / this.pointList.size(); 
    }
    public double averagePassing() {
        if (this.pointList.isEmpty()) {
            return 0.0;
        }

        int soma = 0;
        int amount = 0;
        for (int point : this.pointList) {
            if(point >= 50){
                soma += point;
                amount++;
            }
        }
        return 1.0 * soma / amount; 
    }
    public double passPercentage(){
        if (this.pointList.isEmpty()) {
            return 0.0;
        }
        double amount = 0.0;
        for (int point : this.pointList) {
            if(point >= 50){
                amount++;
            }
        }
        return 100.0 * (amount / (double)pointList.size());
    }
    public void gradeDistribuition(){
        System.out.println("Grade distribution");
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for(Integer item : pointList){
                if (getGrade(item) == i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }   
    }
    public int getGrade(int point){
        if (point < 50) return 0;
        if (point < 60) return 1;
        if (point < 70) return 2;
        if (point < 80) return 3;
        if (point < 90) return 4;
        return 5;
    }
}