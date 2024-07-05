package Back.Booth.Display;

public class LEDMatrix extends DisplaySystem {
    private final String name;
    private final double price;

    public LEDMatrix(){
        name = "LEDMatrix";
        price = 500;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }
}