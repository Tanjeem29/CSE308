package Front;

import Back.QMS.QMS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter QMS Name: (Deluxe OR Optimal OR Poor)");
        String boothType = sc.nextLine();
        System.out.println("Specify Comms Channel: (Wifi OR MobileData)");
        String comssType = sc.nextLine();
        System.out.println("Specify Number of Display Units: ");
        int DUNum = sc.nextInt();
        try {
            QMS x = new QMS(boothType, comssType, DUNum);
            x.ShowComponents();
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
