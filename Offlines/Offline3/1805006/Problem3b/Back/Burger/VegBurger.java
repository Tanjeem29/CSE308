package Back.Burger;

public class VegBurger extends BurgerBase{
    public VegBurger(){
        super.setPrice(100);
    }
    @Override
    public String describe() {
        return "Veggie Burger";
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
