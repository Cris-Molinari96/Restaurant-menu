package pack._1.pojectRistorante;

public class Beverage {
    private String name;
    private String description;
    private double milliliters;
    private double price;

    public Beverage(String name, String description, double milliliters, double price) {
        this.name = name;
        this.description = description;
        this.milliliters = milliliters;
        this.price = price;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public double getMilliliters() {return milliliters;}
    public double getPrice() {return price;}

    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setMilliliters(double milliliters) {this.milliliters = milliliters;}
    public void setPrice(double price) {this.price = price;}

public void printInfoBeverage(){
    System.out.println(this.name + " " + this.milliliters + "ml" + this.price +"€");
}
}
