import java.util.ArrayList;
import java.util.Arrays;

public class Recipe{
    public String name;
    public ArrayList<String> ingredients = new ArrayList<String>();
    public int time;

    public Recipe(String name, ArrayList<String> ingredients, int time){
        this.name = name;
        this.ingredients = ingredients;
        this.time = time;
    }

    @Override
    public String toString() {
    	return "Name: " + this.name + "\nTime: " + this.time;
    }

}