package Back.Drinks;

import Back.FoodComponent;

public class WaterDrinksDecor extends DrinksDecor{

    private FoodComponent newFood;

    public WaterDrinksDecor(FoodComponent newFC){
        this.newFood = newFC;
        super.setPrice(15);
    }

    @Override
    public String describe() {
        return newFood.describe() + " + Water";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() + super.getPrice();
    }
}
