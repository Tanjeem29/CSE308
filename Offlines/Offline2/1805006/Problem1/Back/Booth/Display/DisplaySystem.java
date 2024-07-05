package Back.Booth.Display;

import Back.Component;

public abstract class DisplaySystem extends Component {
    private final String type;
    public DisplaySystem(){
        type = "DisplaySystem";
    }
    @Override
    public String type() {
        return type;
    }

    public abstract String name();

    public abstract double price();
}
