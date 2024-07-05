package Back.fonts;


public class FontFactory {
    public Font getFont(String s){
        if(s.equals("c")){
            return new CourierNew();
        }
        if(s.equals("cpp")){
            return new Monaco();
        }
        if(s.equals("py")){
            return new Consolas();
        }
        return null;
    }
}

