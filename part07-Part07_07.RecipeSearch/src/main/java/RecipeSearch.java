//import java.io.File;

import java.util.Scanner;

public class RecipeSearch {
    
    public static void main(String[] args) {
        
        
        RecipeList recipeList = new RecipeList();
        Scanner scannerUserInput = new Scanner(System.in);
        
        System.out.println("File to read:");
        String file = scannerUserInput.nextLine();
        
        recipeList.populateFromFile(file);
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("Enter command:");
            String command = scannerUserInput.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipeList.printRecipes();
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchTerm = scannerUserInput.nextLine();
                recipeList.printNameSearchedRecipes(searchTerm);
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scannerUserInput.nextLine());
                recipeList.printTimeSearchedRecipes(time);
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String searchIngredient = scannerUserInput.nextLine();
                recipeList.printIngredientSearchedRecipes(searchIngredient);
            }
        }
        
    }
}
