package Back.Burger;

public class BurgerFactory {
//    public BurgerBase getVegBase(){
//        return new VegBurger();
//    }
//    public BurgerBase getChickenBase(){
//        return new ChickenBurger();
//    }
//    public BurgerBase getBeefBase(){
//        return new BeefBurger();
//    }
    public BurgerBase getBase(String type){
        if(type.equalsIgnoreCase("Veggie")){
            return new VegBurger();
        }
        else if(type.equalsIgnoreCase("Beef")){
            return new BeefBurger();
        }
        else if(type.equalsIgnoreCase("Chicken")){
            return new ChickenBurger();
        }
        else{
            System.out.println("Invalid Burger Type");
            return null;
        }
    }
}
