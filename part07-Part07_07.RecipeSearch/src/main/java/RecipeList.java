/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

/**
 *
 * @author Ste-PC
 */
public class RecipeList {

    private ArrayList<Recipe> list;

    public RecipeList() {
        this.list = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        list.add(recipe);
    }

    public void populateFromFile(String file) {
        try (Scanner scannerFileInput = new Scanner(Paths.get(file))) {
            while (scannerFileInput.hasNextLine()) {
                String name = scannerFileInput.nextLine();
                int time = Integer.valueOf(scannerFileInput.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scannerFileInput.hasNextLine()) {
                    String nextIngredient = scannerFileInput.nextLine();
                    if (nextIngredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(nextIngredient);
                }
                this.list.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Recipe> list() {
        return this.list;
    }

    public void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : list) {
            System.out.println(recipe);
        }
    }

    public void printNameSearchedRecipes(String search) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.list) {
            if (recipe.getName().contains(search)) {
                System.out.println(recipe);
            }
        }
    }

    public void printTimeSearchedRecipes(int time) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.list) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void printIngredientSearchedRecipes(String searchedIngredient) {
        System.out.println("Recipes");
        for (Recipe recipe : this.list) {
            for(String ingredient : recipe.getIngredients()){
                if(searchedIngredient.equals(ingredient)){
                    System.out.println(recipe);
                }
            }
        }
    }

}
