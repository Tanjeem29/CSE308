package Back.Booth.Processor;



public class ProcessorFactory {
    public Processor getProcessor(String s){
        {
            if(s.equalsIgnoreCase("ATMega")){
                return new ATMega();
            }
            if(s.equalsIgnoreCase("ArduinoMega")){
                return new ArduinoMega();
            }
            if(s.equalsIgnoreCase("RaspberryPi")){
                return new RaspberryPi();
            }
            System.out.println("Invalid Display");
            return null;
        }
    }
}