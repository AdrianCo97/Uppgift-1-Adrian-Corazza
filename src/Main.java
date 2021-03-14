import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	
	
	String[] pancakesRecipe = {"flour", "salt", "egg"};
	Recipe pancakes = new Recipe("pancakes", pancakesRecipe , 45);	
	
	recipes.add(pancakes);
    
    System.out.println(pancakes);
    
    pancakes.getIngredients();
    
    //-------------------------------------------------------------
    
    String[] pastaRecipe = {"spaghetti", "Oregano", "Mozarella"};
	Recipe pasta = new Recipe("pasta", pastaRecipe , 30);	
	
	recipes.add(pasta);
    
    System.out.println(pasta);
    
    pasta.getIngredients();
    
    //-------------------------------------------------------------
    
    String[] potatoGratinRecipe= {"potatoes", "cooking cream", "Cheese"};
	Recipe potatoGratin = new Recipe("pasta", potatoGratinRecipe , 60);	
	
	recipes.add(potatoGratin);
    
    System.out.println(potatoGratin);
    
    potatoGratin.getIngredients();
    
    //-------------------------------------------------------------
    
    String[] carbonaraRecipe = {"spaghetti", "Bacon", "Egg"};
	Recipe carbonara = new Recipe("Spaghetti Carbonare", carbonaraRecipe , 28);	
	
	recipes.add(carbonara);
    
    System.out.println(carbonara);
    
    carbonara.getIngredients();

	}
}