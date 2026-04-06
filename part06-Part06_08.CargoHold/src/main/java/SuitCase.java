import java.util.ArrayList;
public class SuitCase{
    private ArrayList<Item> items;
    private int maxWeight;

    public SuitCase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addItem(Item newItem){
        items.add(newItem);
    }

    @Override
    public String toString(){
        int totalWeight = 0;
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        return items.size() + " items " + "(" + totalWeight + ")";
    }
}