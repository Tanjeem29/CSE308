package Back.Comms.Module;

public class SIM extends CommModule{
    private final String name;
    private final double price;
    public SIM(){
        name = "SIM";
        price = 500;
    }


    @Override
    public double price() {
        return price;
    }

    public String name() {
        return name;
    }
}
