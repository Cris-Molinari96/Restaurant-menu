package pack._1.pojectRistorante;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO inseriamo tutte le liste,  e stampa del menù unico
    private List<Starters> startList;
    private List<Firsts> firstsList;
    private List<Seconds> secondsList;
    private List<Dessert> dessertsList;
    private List<Beverage>beveragesList;

    public Menu() {
        startList = new ArrayList<>();
        firstsList = new ArrayList<>();
        secondsList = new ArrayList<>();
        dessertsList = new ArrayList<>();
        beveragesList = new ArrayList<>();
    }

    public List<Starters> getStart(){return startList;}
    public List<Firsts> getFirsts(){return firstsList;}
    public List<Seconds> getSeconds(){return secondsList;}
    public List<Dessert> getDessertsList(){return dessertsList;}
    public List<Beverage> getBeverages(){return beveragesList;}

    public void setStart(List<Starters> startList) {this.startList = startList;}
    public void setFirsts(List<Firsts> firstsList) {this.firstsList = firstsList;}
    public void setSeconds(List<Seconds> secondsList) {this.secondsList = secondsList;}
    public void setDessertsList(List<Dessert> dessertsList) {this.dessertsList = dessertsList;}
    public void setBeverages(List<Beverage> beveragesList) {this.beveragesList = beveragesList;}

    /** TODO creiamo i metodi add e remove,
     * ! Methods
     */
    public void addStarterToList(Starters s){startList.add(s);}
    public void addStartersToList(List<Starters> s){startList.addAll(s);}
    public  void removeStarterToList(Starters s){startList.remove(s);}
    public  void removeStartersToList(List<Starters> s){startList.removeAll(s);}

    public void addDessertToList(Dessert d){dessertsList.add(d);}
    public void addDessertsToList(List<Dessert> d){dessertsList.addAll(d);}
    public  void removeDessertToList(Dessert d){dessertsList.remove(d);}
    public  void removeDessertToList(List<Dessert> d){dessertsList.removeAll(d);}

    public void addFirstToList(Firsts f){firstsList.add(f);}
    public void addFirstsToList(List<Firsts> f){firstsList.addAll(f);}
    public void removeFirstToList(Firsts f){firstsList.remove(f);}
    public void removeFirstsToList(List<Firsts> f){firstsList.removeAll(f);}

    public void addSecondToList(Seconds second){secondsList.add(second);}
    public void addSecondsToList(List<Seconds> second){secondsList.addAll(second);}
    public void removeSecondToList(Seconds second){secondsList.remove(second);}
    public void removeSecondsToList(List<Seconds> second){secondsList.removeAll(second);}

    public void addBeverageToList(Beverage b){beveragesList.add(b);}
    public void addBeveragesToList(List<Beverage> b){beveragesList.addAll(b);}
    public void removeBeverageToList(Beverage b){beveragesList.remove(b);}
    public void removeBeveragesToList(List<Beverage> b){beveragesList.removeAll(b);}

//! stampa dei singoli sotto menù

    public void printMenuStarters(){
        for (Starters s : startList) {
            s.printInfoStarters();
        }
    }

    public void printMenuFirsts(){
        for (Firsts f : firstsList) {
            f.printInfoFirts();
        }
    }

    public void printMenuSeconds(){
        for (Seconds s : secondsList) {
            s.printInfoSeconds();
        }
    }

    public void printMenuDessert(){
        for (Dessert dessert : dessertsList) {
            dessert.printInfoDesserts();
        }
    }

    public void printMenuBeverage(){
        for (Beverage b : beveragesList) {
            b.printInfoBeverage();
        }
    }

}
