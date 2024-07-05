package Back.Booth.Display;

public class LCDPanel extends DisplaySystem {
    private final String name;
    private final double price;

    public LCDPanel(){
        name = "LCDPanel";
        price = 2000;
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

