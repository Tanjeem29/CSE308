package Back.Garnish;

import Back.FoodComponent;

public class GarnishFactory {
    public CheeseDecor addCheese(FoodComponent f){
        return new CheeseDecor(f);
    }
}
