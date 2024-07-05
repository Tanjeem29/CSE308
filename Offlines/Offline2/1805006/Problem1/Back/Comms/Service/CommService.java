package Back.Comms.Service;

import Back.Component;

public abstract class CommService extends Component {
    private final String type;

    public CommService() {
        type = "CommunicationService(Yearly)";
    }
    @Override
    public String type() {
        return type;
    }
    public abstract double price();
    public abstract String name();
}
