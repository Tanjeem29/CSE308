package Back.Booth.Display;


public class DisplayFactory {
    public DisplaySystem getDisplay(String s){
        {
            if(s.equalsIgnoreCase("LCDPanel")){
                return new LCDPanel();
            }
            if(s.equalsIgnoreCase("LEDMatrix")){
                return new LEDMatrix();
            }
            System.out.println("Invalid Display");
            return null;
        }
    }
}
