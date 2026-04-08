import java.util.ArrayList;
public class Suitcase{
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addItem(Item newItem){
        int total = 0;
        for(Item item : items){
            total += item.getWeight();
        }
        if((total + newItem.getWeight()) > maxWeight){
            return;
        }
        items.add(newItem);
    }

    @Override
    public String toString(){
        int totalWeight = 0;
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        if(items.size() == 0){
            return "no items (0 kg)";
        }
        if(items.size() == 1){
            return "1 item " + "(" + totalWeight + "kg)";
        }
        return items.size() + " items " + "(" + totalWeight + "kg)";
    }
    public void printItems(){
        for(Item item : items){
            System.out.println(item.getName() + "(" + item.getWeight() + "kg)");
        }
    }
    public int totalWeight(){
        int total = 0;
        for(Item item : items){
            total += item.getWeight();
        }
        return total;
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviestTmp = items.get(0);
        for(Item item : items){
            if(item.getWeight() > heaviestTmp.getWeight()){
                heaviestTmp = item;
            }
        }
        return heaviestTmp;
    }
}