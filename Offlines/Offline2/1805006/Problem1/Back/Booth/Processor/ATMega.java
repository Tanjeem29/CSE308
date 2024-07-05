package Back.Booth.Processor;

public class ATMega extends Processor {
    private final String name;
    private final double price;

    public ATMega(){
        name = "ATMega";
        price = 300;
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
