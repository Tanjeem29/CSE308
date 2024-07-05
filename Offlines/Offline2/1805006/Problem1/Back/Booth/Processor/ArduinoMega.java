package Back.Booth.Processor;

public class ArduinoMega extends Processor {
    private final String name;
    private final double price;

    public ArduinoMega(){
        name = "ArduinoMega";
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