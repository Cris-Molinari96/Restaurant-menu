package pack._1.pojectRistorante;

import java.util.HashSet;
import java.util.Set;

public class Seconds {
    private String name;
    private Set<String>Ingredients;
    private String description;
    private double price;
    private double weight;

    public Seconds(String name, Set<String> ingredients, String description, int weight, double price) {
        this.name = name;
        this.Ingredients = new HashSet<>(ingredients);
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {return name;}
    public Set<String> getIngredients() {return Ingredients;}
    public String getDescription() {return description;}
    public double getWeight() {return weight;}
    public double getPrice() {return price;}

    public void setName(String name) {this.name = name;}
    public void setIngredients(Set<String> ingredients) {Ingredients = ingredients;}
    public void setDescription(String description) {this.description = description;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setPrice(double price) {this.price = price;}

    public void printInfoSeconds(){
        System.out.println(this.name +" " + this.weight + "g" + this.price + "€");
    }
}
