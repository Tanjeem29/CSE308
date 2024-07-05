package Back.Burger;
public class ChickenBurger extends BurgerBase{
    public ChickenBurger(){
        super.setPrice(120);
    }
    @Override
    public String describe() {
        return "Chicken Burger";
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
