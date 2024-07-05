package Back.Comms.Module;

public class WifiModule extends CommModule{
    private final String name;
    private final double price;
    public WifiModule(){
        name = "WifiModule";
        price = 2000;
    }


    @Override
    public double price() {
        return price;
    }

    public String name() {
        return name;
    }
}
