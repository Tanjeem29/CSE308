package Back.editor;

import Back.fonts.FontFactory;
import Back.parser.ParserFactory;

public class editorBuilder {
    public editor changeEditor(String file){
        editor e = editor.getInstance();
        String temp[] = file.split("\\.");
        FontFactory FF = new FontFactory();
        ParserFactory PF = new ParserFactory();
        if(temp.length!=2){
            System.out.println("Invalid file name. No changes made to editor.");
        }
        else{
            if(temp[1].equals("c")){
                e.setLang("C");
            }
            else if(temp[1].equals("cpp")){
                e.setLang("C++");
            }
            else if(temp[1].equals("py")){
                e.setLang("Python");
            }
            else{
                System.out.println("Invalid file name. No changes made to editor");
                return e;
            }
            e.setFont(FF.getFont(temp[1]));
            e.setParser(PF.getParser(temp[1]));
        }
        return e;
    }
}
