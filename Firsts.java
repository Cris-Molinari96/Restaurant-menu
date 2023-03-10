package pack._1.pojectRistorante;

import java.util.HashSet;
import java.util.Set;

public class Firsts {
    private String name;
    private Set<String>ingredients;
    private  String description;
    private double price;
    private double weight;

    public Firsts(String name,Set<String>ingredients, String description, double price, double weight) {
        this.name = name;
        this.ingredients = new HashSet<>(ingredients);
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {return name;}
    public Set<String> getIngredients() {return ingredients;}
    public String getDescription() {return description;}
    public double getPrice() {return price;}
    public double getWeight() {return weight;}

    public void setName(String name) {this.name = name;}
    public void setIngredients(Set<String> ingredients) {this.ingredients = ingredients;}
    public void setDescription(String description) {this.description = description;}
    public void setPrice(double price) {this.price = price;}
    public void setWeight(double weight) {this.weight = weight;}

    public void printInfoFirts(){
        System.out.println(this.name + " " + this.weight + "g" + this.price + "€");
    }
}
