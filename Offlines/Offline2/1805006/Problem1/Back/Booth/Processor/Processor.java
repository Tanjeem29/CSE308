package Back.Booth.Processor;

import Back.Component;

public abstract class Processor extends Component {
    private final String type;


    public Processor(){
        type = "Processor";
    }
    @Override
    public String type() {
        return type;
    }

    public abstract String name();

    public abstract double price();

}


