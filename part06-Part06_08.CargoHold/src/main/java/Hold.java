import java.util.ArrayList;
public class Hold{
    private int maxHoldWeight;
    private ArrayList<Suitcase> holdList;

    public Hold(int maxHoldWeight){
        this.maxHoldWeight = maxHoldWeight;
        holdList = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        int totalSuitcaseWeight = 0;
        for(Suitcase suitcaseItem : holdList){
            totalSuitcaseWeight += suitcaseItem.totalWeight();
        }
        if(suitcase.totalWeight() + totalSuitcaseWeight > maxHoldWeight){
            return;
        }
        holdList.add(suitcase);
    }
    @Override
    public String toString(){
        int totalSuitcaseWeight = 0;
        int amount = 0;
        for(Suitcase suitcaseItem : holdList){
            totalSuitcaseWeight += suitcaseItem.totalWeight();
            amount++;
        }
        return amount + " suitcases (" + totalSuitcaseWeight +" kg)";
    }
    public void printItems(){
        for(Suitcase suitcaseItem : holdList){
            suitcaseItem.printItems();
        }
    }
}