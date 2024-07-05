package Back.Comms;

import Back.Comms.Module.CommModule;
import Back.Comms.Service.CommService;

public abstract class Comms {
    CommService CS;
    CommModule CM;

    public void setCM(CommModule CM) {
        this.CM = CM;
    }

    public void setCS(CommService CS) {
        this.CS = CS;
    }

    public abstract CommService getService();
    public abstract CommModule getModule();
}
