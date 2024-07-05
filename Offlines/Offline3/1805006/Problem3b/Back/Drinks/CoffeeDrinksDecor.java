package Back.Drinks;

import Back.FoodComponent;

public class CoffeeDrinksDecor extends DrinksDecor{

    private FoodComponent newFood;

    public CoffeeDrinksDecor(FoodComponent newFC){
        this.newFood = newFC;
        super.setPrice(30);
    }

    @Override
    public String describe() {
        return newFood.describe() + " + Coffee";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() + super.getPrice();
    }
}
