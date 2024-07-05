package Back.Appetizers;

import Back.FoodComponent;

public class AppetizerFactory {
//    public AppetizerDecor addFrenchFries(FoodComponent f){
//        return new FrenchFriesDecor(f);
//    }
//    public AppetizerDecor addOnionRings(FoodComponent f){
//        return new OnionRingsDecor(f);
//    }
    public AppetizerDecor addAppetizer(String type, FoodComponent f){
        if(type.equalsIgnoreCase("FrenchFries")){
            return new FrenchFriesDecor(f);
        }
        else if(type.equalsIgnoreCase("OnionRings")){
            return new OnionRingsDecor(f);
        }
        else{
            System.out.println("Invalid Appetizer");
            return null;
        }
    }
}