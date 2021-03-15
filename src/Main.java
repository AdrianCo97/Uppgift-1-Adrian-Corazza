import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	
	
	ArrayList<String> pancakesRecipe = new ArrayList<String>();
	pancakesRecipe.add("Flour");
	pancakesRecipe.add("Eggs");
	pancakesRecipe.add("Milk");
	Recipe pancakes = new Recipe("Pancakes", pancakesRecipe, 45);	
	
	recipes.add(pancakes);

    //-------------------------------------------------------------
    
	ArrayList<String> pastaRecipe = new ArrayList<String>();
	pastaRecipe.add("Spaghetti");
	pastaRecipe.add("Oregano");
	pastaRecipe.add("Ground beef");
	Recipe pasta = new Recipe("Pasta", pastaRecipe , 30);	
	
	recipes.add(pasta);
    
    //-------------------------------------------------------------
	
	ArrayList<String> potatoGratinRecipe = new ArrayList<String>();
	potatoGratinRecipe.add("Potatoes");
	potatoGratinRecipe.add("Cooking cream");
	potatoGratinRecipe.add("Cheese");
    
	Recipe potatoGratin = new Recipe("Potato gratin", potatoGratinRecipe , 60);	
	
	recipes.add(potatoGratin);
    
    //-------------------------------------------------------------
	
	ArrayList<String> carbonaraRecipe = new ArrayList<String>();
	carbonaraRecipe.add("Spaghetti");
	carbonaraRecipe.add("Bacon");
	carbonaraRecipe.add("Eggs");
	carbonaraRecipe.add("Flour");
   
	Recipe carbonara = new Recipe("Spaghetti Carbonara", carbonaraRecipe, 28);	
	
	recipes.add(carbonara);
    
    //-------------------------------------------------------------
    
    ForLoop forLoop = new ForLoop();
    
    forLoop.getNamesIfEgg(recipes);
    
    System.out.println("-------------------------------------------------------------");
    
    forLoop.getNamesIfEggAndSugar(recipes);
    
    System.out.println("-------------------------------------------------------------");
    
    forLoop.checkAmountOfIngredients(recipes);
    
    System.out.println("-------------------------------------------------------------");
    
    forLoop.getNamesIfFlour(recipes);
    
    System.out.println("-------------------------------------------------------------");
    
    forLoop.getNamesOfFirstChar(recipes);

	}
	
	
	
}