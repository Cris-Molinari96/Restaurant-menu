package pack._1.pojectRistorante;

import java.util.HashSet;
import java.util.Set;

public class Starters {
    private String name;
    private Set<String> ingredients;
    private  String description;
    private double calories;
    private double price;

    public Starters(String name, Set<String> ingredients, String description, double calories, double price) {
        this.name = name;
        this.ingredients = new HashSet<>(ingredients);
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {return name;}
    public Set<String> getIngredients() {return ingredients;}
    public String getDescription() {return description;}
    public double getCalories() {return calories;}
    public double getPrice() {return price;}

    public void setName(String name) {this.name = name;}
    public void setIngredients(Set<String> ingredients) {this.ingredients = ingredients;}
    public void setDescription(String description) {this.description = description;}
    public void setCalories(double calories) {this.calories = calories;}
    public void setPrice(double price) {this.price = price;}

public void printInfoStarters(){
    System.out.println(this.name+ " " + this.calories + "kcal" + this.price + "€");
}
}
