package Back.Booth;

import Back.Booth.Display.DisplayFactory;
import Back.Booth.Display.DisplaySystem;
import Back.Booth.Display.LCDPanel;
import Back.Booth.Display.LEDMatrix;
import Back.Booth.Processor.*;

public class BoothBuilder{
    public Booth buildBooth(String s){
        Booth B = new Booth();
        ProcessorFactory PF = new ProcessorFactory();
        Processor P;
        DisplayFactory DF = new DisplayFactory();
        DisplaySystem DS;
        if(s.equalsIgnoreCase("Deluxe")){
            P = PF.getProcessor("RaspberryPi");
            DS = DF.getDisplay("LCDPanel");
            //return new Booth(3,2);

        }
        else if(s.equalsIgnoreCase("Optimal")){
            //return new Booth(2,1);
            P = PF.getProcessor("ArduinoMega");
            DS = DF.getDisplay("LEDMatrix");
        }
        else if(s.equalsIgnoreCase("Poor")){
            //return new Booth(1,1);
            P = PF.getProcessor("ATMega");
            DS = DF.getDisplay("LEDMatrix");
        }
        else {
            System.out.println("No such Package for Booth");
            return null;
        }
        B.setP(P);
        B.setDS(DS);
        return B;
    }
}
