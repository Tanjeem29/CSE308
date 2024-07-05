package Back.Booth.Processor;

public class RaspberryPi extends Processor {
    private final String name;
    private final double price;

    public RaspberryPi(){
        name = "RaspberryPi";
        price = 4000;
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