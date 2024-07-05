package Back.Comms.Service;

public class WifiService extends CommService{
    private final String name;
    private final double price;
    public WifiService(){
        name = "WifiService";
        price = 5000;
    }


    @Override
    public double price() {
        return price;
    }

    public String name() {
        return name;
    }
}
