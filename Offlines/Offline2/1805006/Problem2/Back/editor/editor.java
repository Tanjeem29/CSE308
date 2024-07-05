package Back.editor;

import Back.fonts.Font;
import Back.parser.Parser;

public class editor {
    private Parser P;
    private Font F;
    private String L;
    private static editor instance = new editor();
    private editor(){}
    public static editor getInstance(){
        return instance;
    }
    protected void setParser(Parser p){
        P = p;
    }
    protected void setFont(Font f){
        F = f;
    }
    protected void setLang(String l){
        L = l;
    }


    public void Parse(){
        System.out.println();
    }


    public void showDetails() {
        System.out.println("Font: " + F.getname());
        System.out.println("Parser: " + P.getname());
        System.out.println("Language and Environment: " + L);
    }
}


