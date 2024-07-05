package Back.Comms;

public class CommFactory {
    public Comms getComm(String s){
        {
            if(s.equalsIgnoreCase("Wifi")){
                return new WiFiComms();
            }
            if(s.equalsIgnoreCase("MobileData")){
                return new MobileComms();
            }
            System.out.println("Invalid Comms");
            return null;
        }
    }
}
