package Back.Comms.Service;

public class MobileDataService extends CommService{
    private final String name;
    private final double price;
    public MobileDataService(){
        name = "MobileDataService";
        price = 3000;
    }


    @Override
    public double price() {
        return price;
    }

    public String name() {
        return name;
    }
}
