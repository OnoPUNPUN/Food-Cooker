import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        ArrayList<String> ingredients1 = new ArrayList<>();
        ingredients1.add("Cheese");
        ingredients1.add("Tomato");
        ingredients1.add("Bread");

        ArrayList<String> ingredients2 = new ArrayList<>();
        ingredients2.add("Chicken");
        ingredients2.add("Lettuce");
        ingredients2.add("Mayo");

        Food food1 = new Food("Sandwich", ingredients1, 5.99, 300) {
            @Override
            public void showDetails() {
                System.out.println("Food Name: " + getName());
                System.out.println("Ingredients: " + getIngredients());
                System.out.println("Price $: " + getPrice());
                System.out.println("Calories: " + getCalories());
            }
        };

        Food food2 = new Food("Chicken fry", ingredients2, 7.49, 400) {
            @Override
            public void showDetails() {
                System.out.println("Food Name: " + getName());
                System.out.println("Ingredients: " + getIngredients());
                System.out.println("Price $: " + getPrice());
                System.out.println("Calories: " + getCalories());
            }
        };

        System.out.println("Details of Food 1: ");
        food1.showDetails();

        System.out.println("\nDetails of Food 2: ");
        food2.showDetails();

        food1.removeIngredients("Tomato");
        food1.addIngredients("Butter");
        food1.setPrice(6.49);

        System.out.println("\nUpdated Details of Food 1:");
        food1.showDetails();
    }
}
