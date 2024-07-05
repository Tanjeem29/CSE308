package Back.Drinks;

import Back.FoodComponent;

public abstract class DrinksDecor implements FoodComponent {
        private double price;
        public double getPrice(){
            return price;
        }

    public void setPrice(double price) {
        this.price = price;
    }
}
