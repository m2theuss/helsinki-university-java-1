import java.util.ArrayList;
public class TodoList{
    private ArrayList<String> listOfTasks;
    
    public TodoList(){
        this.listOfTasks = new ArrayList<>();
    }
    public void add(String task){
        listOfTasks.add(task);
    }
    public void print(){
        int index = 1;
        for(String items : listOfTasks){
            System.out.println(index + ": " + items);
            index++;
        }
    }
    public void remove(int number){
        listOfTasks.remove(number - 1);
    }
}