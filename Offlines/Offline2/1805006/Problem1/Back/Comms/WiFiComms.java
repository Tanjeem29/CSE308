package Back.Comms;

import Back.Comms.Module.CommModule;
import Back.Comms.Module.ModuleFactory;
import Back.Comms.Service.CommService;
import Back.Comms.Service.ServiceFactory;

public class WiFiComms extends Comms{
    ModuleFactory MF = new ModuleFactory();
    ServiceFactory SF = new ServiceFactory();
    public WiFiComms(){
        setCM(MF.getModule("Wifi"));
        setCS(SF.getService("Wifi"));
    }
    @Override
    public CommService getService() {
        return CS;
    }

    @Override
    public CommModule getModule() {
        return CM;
    }
}
