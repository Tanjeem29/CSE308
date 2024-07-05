package Back.QMS;

import Back.Booth.Booth;
import Back.Booth.BoothBuilder;
import Back.Comms.CommFactory;
import Back.Comms.Comms;
import Back.Component;
import Back.ControlUnit.ControlUnit;
import Back.WebApp.WebApp;

import java.util.ArrayList;

public class QMS {
    private Booth B;
    private Comms C;
    private ControlUnit CU;
    private WebApp WA;
    private ArrayList<Component> components;
    private double price;

    public QMS(String BoothType, String CommType,
               int CUNumber) throws Exception {
        BoothBuilder BB = new BoothBuilder();
        CommFactory CF = new CommFactory();
        B = BB.buildBooth(BoothType);
        C = CF.getComm(CommType);
        WA = new WebApp();
        CU = new ControlUnit(CUNumber);
        if(B == null || C == null || CUNumber <=0){
            System.out.println("Invalid specs.");
            throw new Exception();
        }
        components = new ArrayList<>();
        components.add(B.getP());
        components.add(B.getDS());
        components.add(C.getModule());
        components.add(C.getService());
        components.add(WA);
        components.add(CU);

    }

    public double getPrice(){
        price = 0;
        double x = 0;
        for (Component c: components) {
            if(c.type().equalsIgnoreCase("Processor") || c.type().equalsIgnoreCase("DisplaySystem") || c.name().equalsIgnoreCase("SIM")){
                x = c.price() * CU.getDUNumber();
            }
            else{
                x = c.price();
            }
            price += x;

        }
        System.out.println("Total price: " + price);
        return price;
    }

    public void ShowComponents(){
        for (Component c: components) {
            System.out.println("-------------------");
            System.out.println("Type: " + c.type());
            System.out.println("Name: " + c.name());
            System.out.println("Price: " + c.price());
            System.out.println("+++++++++++++++++++");
        }

        System.out.println("Number of Display Units:" + CU.getDUNumber());
        getPrice();
    }
}
