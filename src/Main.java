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

	}
}