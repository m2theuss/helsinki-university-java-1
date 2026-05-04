
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager rm = new RecipeManager();
        try{
            System.out.print("File to read: ");
            File file = new File(scanner.nextLine());
            Scanner scFile = new Scanner(file);

            System.out.print("Commands\n" + "list - lists the recipes\n" + "stop - stops the program\n");
            while(scFile.hasNextLine()){
                Recipe recipe = new Recipe();
                recipe.setName(scFile.nextLine());
                recipe.setCookingTime(Integer.valueOf(scFile.nextLine()));
                while(true){
                    String value = scFile.nextLine();
                    if(value.isEmpty()){
                        break;
                    }
                    recipe.addIngredient(value);
                }
                rm.addRecipe(recipe);
            }

            while(true){
                System.out.print("Enter command:");
                String command = scanner.nextLine();
                if(command.equals("list")){
                    System.out.println("Recipes:");
                    for(Recipe item : rm.getRecipes()){
                        System.out.println(item.getName() + "," + "cooking time: " + item.getCookingTime());
                    }
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }

    }

}
