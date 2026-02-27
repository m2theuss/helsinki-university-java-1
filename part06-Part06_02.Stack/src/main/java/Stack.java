import java.util.ArrayList;
public class Stack{
    private ArrayList<String> stack;

    public Stack(){
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void add(String value){
        stack.add(value);
    }
    public ArrayList<String> values(){
        ArrayList<String> list = stack;
        return list;
    }
    public String take(){
        for(int i = 0; i < stack.size(); i++){
            if(i == (stack.size() - 1)){
                String topMost = stack.get(i);
                stack.remove(stack.get(i));
                return topMost;
            }
        }
        return "error";
    }
}