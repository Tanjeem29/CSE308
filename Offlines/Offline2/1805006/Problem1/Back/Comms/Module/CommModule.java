package Back.Comms.Module;

import Back.Component;

public abstract class CommModule extends Component {
    private final String type;

    public CommModule() {
        type = "CommModule";
    }
    @Override
    public String type() {
        return type;
    }

    public abstract double price();
    public abstract String name();
}
