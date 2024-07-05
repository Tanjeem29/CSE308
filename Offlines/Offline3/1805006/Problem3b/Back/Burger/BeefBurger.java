package Back.Burger;

public class BeefBurger extends BurgerBase{
    public BeefBurger(){
        super.setPrice(110);
    }
    @Override
    public String describe() {
        return "Beef Burger";
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
