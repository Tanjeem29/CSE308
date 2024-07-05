package Front;

import Dev.NewSummer;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        NewSummer NS = new NewSummer();
        //File in = new File("D:\\L3T1\\CSE308\\Offlines\\Offline3\\Problem1\\src\\Front","input.txt");
        File in = new File("input.txt");

        int ans = NS.calculateSum(in);
        System.out.println(ans);
    }
}
