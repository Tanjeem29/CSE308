package Back.ControlUnit;

import Back.Component;

public class ControlUnit extends Component {
    private final String type;
    private final String name;
    private final double price;
    private int DUNumber;

    public ControlUnit(int x){
        type = "ControlUnit";
        name = "ControlUnitX";
        price = 4000;
        DUNumber = x;
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

    public int getDUNumber() {
        return DUNumber;
    }

    public void setDUNumber(int DUNumber) {
        this.DUNumber = DUNumber;
    }
}
