package Back.Comms;

import Back.Comms.Module.CommModule;
import Back.Comms.Module.ModuleFactory;
import Back.Comms.Service.CommService;
import Back.Comms.Service.ServiceFactory;

public class MobileComms extends Comms{
    ModuleFactory MF = new ModuleFactory();
    ServiceFactory SF = new ServiceFactory();
    public MobileComms(){
        setCM(MF.getModule("SIM"));
        setCS(SF.getService("MobileData"));
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
