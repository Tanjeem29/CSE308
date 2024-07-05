package Back.parser;


public class CppParser extends Parser{
    private final String name;

    public CppParser() {
        this.name = "CppParser";
    }

    @Override
    public String getname() {
        return name;
    }
}

