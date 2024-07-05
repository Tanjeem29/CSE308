package Back.Comms.Service;


public class ServiceFactory {
    public CommService getService(String s){
        if(s.equalsIgnoreCase("Wifi")){
            return new WifiService();
        }
        if(s.equalsIgnoreCase("MobileData")){
            return new MobileDataService();
        }
        System.out.println("Invalid Display");
        return null;
    }
}
