import java.util.ArrayList;
public class ExerciseManagement {
    private ArrayList<Exercise> exercisesList;

    public ExerciseManagement(){
        this.exercisesList = new ArrayList<>();
    }

    public ArrayList<String> exercisesList(){
        ArrayList<String> list = new ArrayList<>();
        for(Exercise item : exercisesList){
            list.add(item.getName());
        }
        return list;
    }
    public void add(String value){
        this.exercisesList.add(new Exercise(value));
    }
    public void markAsCompleted(String exercise){
        for(Exercise item : exercisesList){
            if(item.getName().equals(exercise)){
                item.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise){
        for(Exercise item : exercisesList){
            if(item.getName().equals(exercise)){
                return item.isCompleted();
            }
        }
        return false;
    }
}