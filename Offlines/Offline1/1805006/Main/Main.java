package Main;
import User.*;
import Bank.*;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        User curr = Account.createAccUtil("Tanjeem", 100000, 3);
//        //System.out.println(User.hm.get("Tanjeem"));
//        if(curr != null){
//            //System.out.println(((Account) curr).balance);
//            System.out.println("----------1");
//            ((Account) curr).query();
//            Account.incYearsUtil();
//            //((Account) curr).changeDepInt(.2);
//            System.out.println("----------2");
//            ((Account) curr).query();
//            ((Account) curr).withdraw(15000);
//            System.out.println("----------3");
//            ((Account) curr).query();
//            Account.incYearsUtil();
//            System.out.println("----------4");
//            ((Account) curr).query();
//            ((Account) curr).withdraw(20000);
//            System.out.println("----------5");
//            ((Account) curr).query();
//            System.out.println("----------5");
//            ((Account) curr).reqLoan(5000);
//            ((Account) curr).query();
//            System.out.println("----------5");
//            ((Account) curr).grantLoan();
//            ((Account) curr).query();
//            Account.incYearsUtil();
//            ((Account) curr).query();
//            System.out.println("----------6");
//
//        }
//        curr = Account.createAccUtil("Farzin", 100000, 2);
//        if(curr != null){
//            System.out.println(((Account) curr).getBalance());
//            ((Account) curr).deposit(100000);
//            ((Account)curr).reqLoan(900);
//            ((Account) curr).query();
//            Account.incYearsUtil();
//            ((Account) curr).query();
//
//            curr = User.searchForAcc("Tanjeem");
//            ((Account) curr).query();
//
//        }
//        curr = Account.createAccUtil("Alice", 1000, 2);
//        ((Account)curr).deposit(20000);
//        ((Account)curr).reqLoan(500);
//        //((Account)curr).grantLoan();
//
//        ((Account)curr).query();
//        Account.incYearsUtil();
//        ((Account)curr).query();
//        curr = Account.createAccUtil("Tanjeem", 1000, 2);
//        if(curr == null) System.out.println("lol");



    Bank B = new Bank(2, 5);
//        User.showAll();
//        curr = User.searchForEmp("MD");
//        ((Employee) curr).seeIF();
//        System.out.println(User.searchForAcc("shovik"));
    B.Session();
    }
}

