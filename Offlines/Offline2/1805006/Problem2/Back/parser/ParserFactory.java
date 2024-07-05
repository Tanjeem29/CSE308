package Back.parser;



public class ParserFactory {
    public Parser getParser(String s){
        if(s.equals("c")){
            return new CParser();
        }
        if(s.equals("cpp")){
            return new CppParser();
        }
        if(s.equals("py")){
            return new PyParser();
        }
        return null;
    }
}
