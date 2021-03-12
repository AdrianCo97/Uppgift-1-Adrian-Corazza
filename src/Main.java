import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	
	public static void menu(String choice) {
		Scanner input = new Scanner(System.in);
		switch (choice) {
		case "Add":
			System.out.println("What is the name of the dish?:");
			String name = input.nextLine();
			
			System.out.println("What are the ingredients?:");
			ArrayList<String> ingredients = new ArrayList<String>();
			
		}
	}

	public static void main(String[] args) {

	}
}