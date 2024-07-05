package Back.Appetizers;
import Back.FoodComponent;

public abstract class AppetizerDecor implements FoodComponent {
    private double price;
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
