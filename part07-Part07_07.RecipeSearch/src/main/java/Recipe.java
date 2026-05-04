import java.util.ArrayList;
public class Recipe{
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(){
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }
    public void addIngredient(String ingredient){
        ingredients.add(ingredient);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCookingTime(int cookingTime){
        this.cookingTime = cookingTime;
    }
    public int getCookingTime(){
        return this.cookingTime;
    }
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
}