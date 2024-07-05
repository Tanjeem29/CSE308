package Front;

import Back.Appetizers.AppetizerFactory;
import Back.Burger.BurgerFactory;
import Back.Drinks.DrinksFactory;
import Back.FoodComponent;
import Back.Garnish.GarnishFactory;
import Back.MakeCombo;

public class Main2 {

    public static void main(String[] args) {
        BurgerFactory BF = new BurgerFactory();
        DrinksFactory DF = new DrinksFactory();
        GarnishFactory GF = new GarnishFactory();
        AppetizerFactory AF = new AppetizerFactory();
        FoodComponent order1;
        FoodComponent order2;
        FoodComponent order3;
        FoodComponent order4;
        FoodComponent order5;

        order1 = BF.getBase("Beef");
        order1 = GF.addCheese(order1);
        order1 = AF.addAppetizer("FrenchFries", order1);

        order2 = BF.getBase("Veggie");
        order2 = AF.addAppetizer("OnionRings", order2);
        order2 = DF.addDrinks("Water", order2);

        order3 = BF.getBase("Veggie");
        order3 = AF.addAppetizer("FrenchFries", order3);
        order3 = DF.addDrinks("Coke", order3);
        order3 = new MakeCombo(order3);

        order4 = BF.getBase("Veggie");
        order4 = AF.addAppetizer("OnionRings", order4);
        order4 = DF.addDrinks("Coffee", order4);
        order4 = DF.addDrinks("Water", order4);
        order4 = new MakeCombo(order4);

        order5 = BF.getBase("Beef");


        System.out.println("------------------------------");
        System.out.println("Order 1: " + order1.describe());
        System.out.println("Total Price: " + order1.getPrice());
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println("------------------------------");
        System.out.println("Order 2: " + order2.describe());
        System.out.println("Total Price: " + order2.getPrice());
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println("------------------------------");
        System.out.println("Order 3: " + order3.describe());
        System.out.println("Total Price: " + order3.getPrice());
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println("------------------------------");
        System.out.println("Order 4: " + order4.describe());
        System.out.println("Total Price: " + order4.getPrice());
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println("------------------------------");
        System.out.println("Order 5: " + order5.describe());
        System.out.println("Total Price: " + order5.getPrice());
        System.out.println("++++++++++++++++++++++++++++++");

    }



}
