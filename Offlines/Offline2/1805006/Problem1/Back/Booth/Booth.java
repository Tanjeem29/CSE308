package Back.Booth;

import Back.Booth.Display.DisplaySystem;
import Back.Booth.Processor.Processor;

public class Booth {
    private Processor P;
    private DisplaySystem DS;

//    public Booth(int p, int d){
//        if(p == 1){
//            P = new ATMega();
//        }
//        else if(p == 2){
//            P = new ArduinoMega();
//        }
//        else if(p == 3){
//            P = new RaspberryPi();
//        }
//        else{
//            System.out.println("Invalid Processor");
//        }
//
//        if(d == 1){
//            DS = new LEDMatrix();
//        }
//        else if(d == 2){
//            DS = new LCDPanel();
//        }
//        else{
//            System.out.println("Invalid Display System");
//        }
//
//    }
    public Booth(){

    }
    public void setDS(DisplaySystem DS) {
        this.DS = DS;
    }

    public void setP(Processor p) {
        P = p;
    }

    public Processor getP(){
        return P;
    }

    public DisplaySystem getDS() {
        return DS;
    }
}
