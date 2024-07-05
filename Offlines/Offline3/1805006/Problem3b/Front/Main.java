package Front;

import Back.FoodComponent;
import Back.MealBuilder.MealBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BurgerFactory BF = new BurgerFactory();
//        DrinksFactory DF = new DrinksFactory();
//        GarnishFactory GF = new GarnishFactory();
//        AppetizerFactory AF = new AppetizerFactory();
//        FoodComponent order;
//        order = BF.getChickenBase();
//        order = GF.addCheese(order);
//        order = AF.addOnionRings(order);
//        order = AF.addFrenchFries(order);
//        order = DF.addWater(order);
        FoodComponent order;
        MealBuilder MB = new MealBuilder();
        int num;

        MB.displayMenu();

        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        order = MB.makeMeal(num);

        System.out.println("Your Order: "+order.describe());
        System.out.println("Total Price: " + order.getPrice());
    }
}
