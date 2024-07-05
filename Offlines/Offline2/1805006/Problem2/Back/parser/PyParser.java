package Back.parser;


public class PyParser extends Parser{
    private final String name;

    public PyParser() {
        this.name = "PyParser";
    }

    @Override
    public String getname() {
        return name;
    }
}


