package Back.WebApp;

import Back.Component;

public class WebApp extends Component {
    private final String type;
    private final String name;
    private final double price;

    public WebApp(){
        type = "WebApplication";
        name = "WebAppForUs";
        price = 5000;
    }
    @Override
    public String type() {
        return type;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }
}
