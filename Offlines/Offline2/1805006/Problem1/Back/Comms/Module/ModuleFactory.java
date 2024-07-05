package Back.Comms.Module;


public class ModuleFactory {
    public CommModule getModule(String s){
        if(s.equalsIgnoreCase("Wifi")){
            return new WifiModule();
        }
        if(s.equalsIgnoreCase("SIM")){
            return new SIM();
        }
        System.out.println("Invalid Display");
        return null;
    }
}
