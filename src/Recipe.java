import java.util.ArrayList;
import java.util.Arrays;

public class Recipe{
    private String name;
    private String[] ingredients;
    private int time;

    public Recipe(String name, String[] ingredients, int time){
        this.name = name;
        this.ingredients = ingredients;
        this.time = time;
    }

    public String getName() {
    	return this.name;
    }
    
    public void getIngredients() {
    	for(int i = 0; i < this.ingredients.length; i++) {
    		System.out.println(this.ingredients[i]);
    	}
    }
    
    @Override
    public String toString() {
    	return "Name: " + this.name + "\nTime: " + this.time;
    }

}