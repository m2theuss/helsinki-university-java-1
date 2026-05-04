
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
            System.out.println("");
            System.out.print("Commands:\n" 
                            + "list - lists the recipes\n"
                            + "stop - stops the program\n"
                            + "find name - searches recipes by name\n\n");
            while(scFile.hasNextLine()){
                Recipe recipe = new Recipe();
                recipe.setName(scFile.nextLine());
                recipe.setCookingTime(Integer.valueOf(scFile.nextLine()));
                //System.out.println(recipe.getCookingTime() + " and " + recipe.getName());
                while(scFile.hasNextLine()){
                    String value = scFile.nextLine();
                    if(value.isEmpty()){
                        break;
                    }
                    recipe.addIngredient(value);
                }
                rm.addRecipe(recipe);
            }

            while(true){
                System.out.print("Enter command: ");
                String command = scanner.nextLine();
                if(command.equals("list")){
                    System.out.println("");
                    rm.printRecipes();
                } else if (command.equals("find name")){
                    System.out.print("Searched word: ");
                    rm.findName(scanner.nextLine());
                } else if (command.equals("find cooking time")){
                    System.out.print("Max cooking time: ");
                    rm.findCookingTime(Integer.valueOf(scanner.nextLine()));
                } else if (command.equals("find ingredient")){
                    System.out.print("Ingredient: ");
                    rm.findIngredient(scanner.nextLine());
                }
                else if(command.equals("stop")){
                    break;
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }

    }

}
