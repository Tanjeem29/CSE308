package Back.MealBuilder;

import Back.Appetizers.AppetizerFactory;
import Back.Burger.BurgerFactory;
import Back.Drinks.DrinksFactory;
import Back.FoodComponent;
import Back.Garnish.GarnishFactory;
import Back.MakeCombo;

public class MealBuilder {
    private AppetizerFactory AF = new AppetizerFactory();
    private BurgerFactory BF = new BurgerFactory();
    private DrinksFactory DF =  new DrinksFactory();
    private GarnishFactory GF = new GarnishFactory();

    public FoodComponent makeMeal(int i){
        FoodComponent order;
        if(i==1){
            order = BF.getBase("Beef");
            order = GF.addCheese(order);
            order = AF.addAppetizer("FrenchFries", order);
        }
        else if(i==2){
            order = BF.getBase("Veggie");
            order = AF.addAppetizer("OnionRings", order);
            order = DF.addDrinks("Water", order);
        }
        else if(i==3){
            order = BF.getBase("Veggie");
            order = AF.addAppetizer("FrenchFries", order);
            order = DF.addDrinks("Coke", order);
            order = new MakeCombo(order);
        }
        else if(i==4){
            order = BF.getBase("Veggie");
            order = AF.addAppetizer("OnionRings", order);
            order = DF.addDrinks("Coffee", order);
            order = DF.addDrinks("Water", order);
            order = new MakeCombo(order);
        }
        else if(i==5){
            order = BF.getBase("Beef");
            }
        else{
            order = null;
        }
        return order;
    }
    public void displayMenu(){
        System.out.println("Pick a Meal (Enter 1 to 5):");
        System.out.println("1. Beef burger with French fry and cheese");
        System.out.println("2. Veggie Burger with onion rings and Bottle of Water");
        System.out.println("3. A Combo Meal with Veggi burger, French Fry and Coke");
        System.out.println("4. A Combo Meal with Veggi burger, Onion Rings, Coffee and Water");
        System.out.println("5. A Beef Burger only");
    }
}
