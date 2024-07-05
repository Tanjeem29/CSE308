package Back.Drinks;

import Back.FoodComponent;

public class CokeDrinksDecor extends DrinksDecor{

    private FoodComponent newFood;

    public CokeDrinksDecor(FoodComponent newFC){
        this.newFood = newFC;
        super.setPrice(40);
    }

    @Override
    public String describe() {
        return newFood.describe() + " + Coke";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() + super.getPrice();
    }
}