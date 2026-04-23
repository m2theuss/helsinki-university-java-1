import java.util.ArrayList;
public class ExerciseManagement {
    private ArrayList<String> list;

    public ExerciseManagement(){
        this.list = new ArrayList<>();
    }

    public ArrayList<String> exerciseList(){
        return this.list;
    }
    public void add(String value){
        this.list.add(value);
    }
    public void markAsCompleted(String exercice){

    }
    public boolean isCompleted(String exercice){
        return true;
    }
}