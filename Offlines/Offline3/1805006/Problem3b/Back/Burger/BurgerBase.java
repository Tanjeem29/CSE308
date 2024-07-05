package Back.Burger;

import Back.FoodComponent;

public abstract class BurgerBase implements FoodComponent {
    private double price;

    protected void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
