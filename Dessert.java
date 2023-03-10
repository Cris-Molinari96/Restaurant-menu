package pack._1.pojectRistorante;

import java.util.HashSet;
import java.util.Set;

public class Dessert {
    private String name;
    private Set<String>Ingredients;
    private String description;
    private double weight;
    private double price;

    /**
     * @param name
     * @param ingredients
     * @param description
     * @param weight
     * @param price
     */

    public Dessert(String name,Set<String> ingredients, String description, double weight, double price) {
        this.name = name;
        this.Ingredients =new HashSet<>(ingredients);
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {return name;}
    public Set<String> getIngredients() {return Ingredients;}
    public String getDescription() {return description;}
    public double getWeight() {return weight;}
    public double getPrice() {return price;}

    public void setName(String name) {this.name = name;}
    public void setIngredients(HashSet<String> ingredients) {Ingredients = ingredients;}
    public void setDescription(String description) {this.description = description;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setPrice(double price) {this.price = price;}


    public void printInfoDesserts(){ // --> questo metodo già ti stampa le informazioni del menu
        System.out.println(this.name + " " +this.weight + "g" + this.price + "€" );
    }

}
