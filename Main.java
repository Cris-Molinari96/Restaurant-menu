package pack._1.pojectRistorante;

import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Starters ffc = new Starters("Forever Fried Chicken Calamari", Set.of("Chicken", "Calamari"), "Enjoy a classic fried chicken dish with a twist, featuring calamari in a light batter for a unique flavor combination. Perfect for sharing or as an individual meal.", 500, 69.69);
        Starters calamari = new Starters("Forever Fried Chicken Calamari", Set.of("Chicken", "Calamari"), "Enjoy a classic fried chicken dish with a twist, featuring calamari in a light batter for a unique flavor combination. Perfect for sharing or as an individual meal.", 500, 69.69);

        Firsts genovese = new Firsts("Genovese", Set.of("Cipolla,carote,sale,carne macinata"), "Traditional Ligurian dish made with slow-cooked onions, served with a fragrant basil pesto sauce and freshly grated Parmesan cheese.", 8.50, 160);
        Firsts ragu = new Firsts("Ragu", Set.of("Cipolla,carote,sale,carne macinata"), "Traditional Ligurian dish made with slow-cooked onions, served with a fragrant basil pesto sauce and freshly grated Parmesan cheese.", 8.50, 160);

        Seconds fiorentina = new Seconds("Fiorentina al sangue", Set.of("Burro, carne rossa di manzo"), "Bistecca di carne rossa", 2, 50);
        Seconds pollo = new Seconds("Pollo", Set.of("Burro, carne rossa di manzo"), "Bistecca di carne rossa", 2, 50);

        Dessert tiramisu = new Dessert("Tiramisu", Set.of("Eggs,milk,coffee,cacao"), "coffee cake", 1, 25);
        Dessert appleCake = new Dessert("Apple Cake", Set.of("apple,milk,panna"), "coffee cake", 1, 25);
        Dessert mimosa = new Dessert("Mimosa", Set.of("apple,milk,panna"), "coffee cake", 1, 25);

        Beverage cocoCola = new Beverage("Coca Cola", "Bevanda classica coca cola", 250, 2.50);
        Beverage pepsi = new Beverage("Pepsi", "Bevanda classica pepsi cola", 250, 2.50);

        Menu menu = new Menu();

        menu.addStartersToList(Arrays.asList(ffc, calamari));
        menu.addFirstsToList(Arrays.asList(genovese, ragu));
        menu.addSecondsToList(Arrays.asList(fiorentina, pollo));
        menu.addDessertsToList(Arrays.asList(tiramisu, appleCake, mimosa));
        menu.addBeveragesToList(Arrays.asList(cocoCola, pepsi));

        System.out.println("\n----- STARTERS -----");
        menu.printMenuStarters();
        System.out.println("\n----- FIRSTS ----- ");
        menu.printMenuFirsts();
        System.out.println("\n----- SECONDS -----" );
        menu.printMenuSeconds();
        System.out.println("\n----- DESSERT -----");
        menu.printMenuDessert();
        System.out.println("\n----- BEVERAGE -----");
        menu.printMenuBeverage();

    }
}

