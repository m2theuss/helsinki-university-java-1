import java.util.ArrayList;

public class RecipeManager{
    private ArrayList<Recipe> recipes;

    public RecipeManager(){
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }
    public void findName(String itemSearched){
        System.out.println("Recipes:");
        for(Recipe item : recipes){
            if(item.getName().contains(itemSearched)){
                System.out.println(item.getName() + ", " + "cooking time: " + item.getCookingTime());
            }
        }
    }
    public void findCookingTime(int maxCooking){
        System.out.println("Recipes:");
        for(Recipe item : recipes){
            if(item.getCookingTime() <= maxCooking){
                System.out.println(item.getName() + ", " + "cooking time: " + item.getCookingTime());
            }
        }
    }
    public void findIngredient(String ingredientSearched){
        System.out.println("Recipes:");
        for(Recipe item : recipes){
            for(String itemTmp : item.getIngredients()){
                if(itemTmp.equals(ingredientSearched)){
                    System.out.println(item.getName() + ", " + "cooking time: " + item.getCookingTime());
                }
            }
        }
    }
    public void printRecipes(){
        System.out.println("Recipes:");
        for(Recipe item : recipes){
            System.out.println(item.getName() + ", " + "cooking time: " + item.getCookingTime());
        }
        System.out.println("");
    }

}