import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	
	public void getNamesIfEgg(ArrayList<Recipe> recipes) {
		
		List<Recipe> recipeWithEggs = recipes.stream()
		         .filter(recipe -> recipe.ingredients.contains("Eggs"))
		         .collect(Collectors.toList());
		         
		recipeWithEggs.forEach(System.out::println);
		
	}
	
	public void getNamesOfFirstChar(ArrayList<Recipe> recipes) {
		
		List<Recipe> namesWithP = recipes.stream()
				.filter(recipe -> recipe.name.charAt(0) == 'P')
				.collect(Collectors.toList());
		
		namesWithP.forEach(System.out::println);
	}

}
