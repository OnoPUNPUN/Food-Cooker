import java.util.ArrayList;

abstract class Food {

    private String name;
    private ArrayList<String> ingredients;
    private double price;
    private float calories;

    public Food() {
        name = "Unknown";
        ingredients = new ArrayList<>();
        price = 0.00;
        calories = 0.0f;
    }

    public Food(
        String name,
        ArrayList<String> ingredients,
        double price,
        float calories
    ) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public float getCalories() {
        return calories;
    }

    public void removeIngredients(String ingredient) {
        ingredients.remove(ingredient);
    }

    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    public abstract void showDetails();
}
