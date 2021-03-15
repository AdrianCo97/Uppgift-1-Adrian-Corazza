import java.util.ArrayList;

public class ForLoop {

	public void getNamesIfEgg(ArrayList<Recipe> recipes) {
		for(Recipe recipe : recipes) {
			if(recipe.ingredients.contains("Eggs")) {
				System.out.println(recipe.name + ", Contains eggs");
			}
		}
	}
	
	public void getNamesOfFirstChar(ArrayList<Recipe> recipes) {
		for(Recipe recipe : recipes) {
			if(recipe.name.charAt(0) == 'P') {
				System.out.println(recipe.name);
			}
		}
	}
	
	public void getNamesIfEggAndSugar(ArrayList<Recipe> recipes) {
		for(Recipe recipe : recipes) {
			if(recipe.ingredients.contains("Eggs") && recipe.ingredients.contains("Sugar")) {
				System.out.println(recipe.name + ", contains eggs and sugar.");
			}
		}
	}
	
	public void checkAmountOfIngredients(ArrayList<Recipe> recipes) {
		for(Recipe recipe : recipes) {
			if(recipe.ingredients.size() < 5) {
				System.out.println(recipe.name + ", contains less than 5 ingredients.");
			}
		}
	}
	
	public void getNamesIfFlour(ArrayList<Recipe> recipes) {

		for(Recipe recipe : recipes) {
			if(!recipe.ingredients.contains("Flour")) {
				System.out.println(recipe.name + ", does not contain flour.");
			}
		}
	}


}
