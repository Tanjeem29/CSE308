package Back.Appetizers;

import Back.FoodComponent;

public class FrenchFriesDecor extends AppetizerDecor{

    private FoodComponent newFood;// newfood == base


    public FrenchFriesDecor(FoodComponent newFC){
        this.newFood = newFC;
        super.setPrice(50);
    }

    @Override
    public String describe() {
        return newFood.describe() + " + FrenchFries";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() + super.getPrice();
    }
}