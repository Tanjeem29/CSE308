package Back.Drinks;


import Back.FoodComponent;

public class DrinksFactory {
//    public DrinksDecor addCoffee(FoodComponent f){
//        return new CoffeeDrinksDecor(f);
//    }
//    public DrinksDecor addCoke(FoodComponent f){
//        return new CokeDrinksDecor(f);
//    }
//    public DrinksDecor addWater(FoodComponent f){
//        return new WaterDrinksDecor(f);
//    }
    public DrinksDecor addDrinks(String type, FoodComponent f){
        if(type.equalsIgnoreCase("Coffee")){
            return new CoffeeDrinksDecor(f);
        }
        else if(type.equalsIgnoreCase("Coke")){
            return new CokeDrinksDecor(f);
        }
        else if(type.equalsIgnoreCase("Water")){
            return new WaterDrinksDecor(f);
        }
        else{
            System.out.println("Invalid Drinks Type");
            return null;
        }
    }
}
