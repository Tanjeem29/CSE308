package Back.Garnish;

import Back.FoodComponent;

public class CheeseDecor implements FoodComponent {
    private FoodComponent newFood;

    public CheeseDecor(FoodComponent newFC){
        this.newFood = newFC;
    }

    @Override
    public String describe() {
        return newFood.describe() + " with Cheese";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() + 20;
    }
}
