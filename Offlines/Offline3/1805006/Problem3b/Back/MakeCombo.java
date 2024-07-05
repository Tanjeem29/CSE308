package Back;

public class MakeCombo implements FoodComponent{
    private FoodComponent newFood;
    public MakeCombo(FoodComponent newFC){
        this.newFood = newFC;
    }
    @Override
    public String describe() {
        return newFood.describe() + " (Combo Meal)";
    }

    @Override
    public double getPrice() {
        return newFood.getPrice() - 15;
    }
}
