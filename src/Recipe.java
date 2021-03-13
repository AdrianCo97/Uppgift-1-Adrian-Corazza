import java.util.ArrayList;

public class Recipe{
    private String name;
    private ArrayList<String> ingredients;
    private int time;

    public Recipe(String name, int time){
        this.name = name;
        this.time = time;
    }
    
    public String getNamn() {
    	return this.name;
    }
    
    public void setIngredienser(String ingredient) {
    	ingredients.add(ingredient);
    }
    
    public void getIngredienser() {
    	for(int i = 0; i < this.ingredients.size(); i++) {
    		System.out.println(this.ingredients.get(i));
    	}
    }
}