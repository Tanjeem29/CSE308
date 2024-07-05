package Back.Appetizers;

import Back.FoodComponent;

public class OnionRingsDecor extends AppetizerDecor{

    private FoodComponent newFood;

    public OnionRingsDecor(FoodComponent newFC){
        this.newFood = newFC;
        super.setPrice(55);
    }

    @Override
    public String describe() {
        return newFood.describe() + " + OnionRings";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() + super.getPrice();
    }
}
