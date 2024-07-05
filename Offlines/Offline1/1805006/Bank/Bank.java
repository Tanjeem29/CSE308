package Bank;
import User.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bank {
    private static double IF = 1000000;
    public static double getIF(){
        return IF;
    }
    public Bank(int Officers, int Cashiers){
        System.out.print("Bank Created");
        String s;
        s = "MD";
        Employee.createEmpUtil(s, 1);
        System.out.print( "; " + s);
        for(int i = 1; i<= Officers; i++){
            s = "O"+ i;
            Employee.createEmpUtil(s, 2);
            System.out.print( ", " + s);
        }
        for(int i = 1; i<= Cashiers; i++){
            s = "C"+ i;
            Employee.createEmpUtil(s, 3);
            System.out.print( ", " + s);
        }
        System.out.print(" created.\n");

    }

    public void Session() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("input.txt"));
        String line;
        User U = new User();
        U.makeNone();
        User curr = U;
        double y = 0;

        while(true){
            y=0;
            line = sc.nextLine();
            String[] Tokens = line.split(" ");
            if(curr.isNone()){
                if(Tokens[0].equalsIgnoreCase("Close")){
                    if(Tokens.length==1) {
                        System.out.println("Ending Session");
                        break;
                    }
                    else{
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if(Tokens[0].equalsIgnoreCase("Create")){
                    if(Tokens.length!=4){
                        System.out.println("Invalid Command");
                        continue;
                    }
                    else {
                        double x;
                        int type;
                        try
                        {
                            x = Double.parseDouble(Tokens[3]);
                        }
                        catch(NumberFormatException e)
                        {
                            System.out.println("Invalid Initial Deposit");
                            continue;
                        }
                        if(Tokens[2].equalsIgnoreCase("Savings")){
                            type = 1;
                        }
                        else if(Tokens[2].equalsIgnoreCase("Student")){
                            type = 2;
                        }
                        else if(Tokens[2].equalsIgnoreCase("FixedDeposit")){
                            type = 3;
                        }
                        else if(Tokens[2].equalsIgnoreCase("Loan")){
                            type = 4;
                        }
                        else{
                            System.out.println("Invalid account type");
                            continue;
                        }
                        curr = Account.createAccUtil(Tokens[1], x, type);
                        if(curr == null) {
                            curr = U;

                        }
                        else{
                            y+=((Account)curr).getBalance();
                        }


                    }
                }
                else if(Tokens[0].equalsIgnoreCase("Inc")){
                    if(Tokens.length==1) {
                        Account.incYearsUtil();
                        continue;
                    }
                    else{
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if(Tokens[0].equalsIgnoreCase("Open")){
                    if(Tokens.length==2) {
                        curr = User.searchForUser(Tokens[1]);
                        if(curr == null){
                            System.out.println("No such Account/Employee exists");
                            curr = U;
                        }
                        else if(curr.isAcc()){
                            System.out.println("Welcome back, " + curr.getName());
                        }
                        else if(curr.isEmp()){
                            System.out.println(curr.getName() + " active");
                            ((Employee)curr).welcome();
                        }
                        continue;
                    }
                    else{
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if (Tokens[0].equalsIgnoreCase("help")) {
                    if (Tokens.length == 1) {
                        System.out.println("Commands:\n1.Create _name_ _accountType_ _InitialDeposit_\n\tAccountTypes:\t1.Savings\t2.Student\t3.FixedDeposit\t4.Loan\n2.Inc\n3.Open _name_\n4.Help\n5.Close");
                        //curr = U;
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else {
                    System.out.println("Invalid Command");
                }

            }
            else if(curr.isAcc()) {
                if (Tokens[0].equalsIgnoreCase("Close")) {
                    if (Tokens.length == 1) {
                        System.out.println("Transaction Closed for " + curr.getName());
                        curr = U;
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                } else if (Tokens[0].equalsIgnoreCase("Deposit")) {
                    double x;
                    if (Tokens.length == 2) {
                        try {
                            x = Double.parseDouble(Tokens[1]);
                        } catch (NumberFormatException e) {
                            System.out.println("Unsuccessful Transaction. Deposit is not a valid Number");
                            continue;
                        }
                        assert curr instanceof Account;
                        y = ((Account) curr).deposit(x);

                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }

                } else if (Tokens[0].equalsIgnoreCase("Withdraw")) {
                    double x;
                    if (Tokens.length == 2) {
                        try {
                            x = Double.parseDouble(Tokens[1]);
                        } catch (NumberFormatException e) {
                            System.out.println("Unsuccessful Transaction. Withdrawal is not a valid Number");
                            continue;
                        }
                        assert curr instanceof Account;
                        y = ((Account) curr).withdraw(x);
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }

                } else if (Tokens[0].equalsIgnoreCase("Request")) {
                    double x;
                    if (Tokens.length == 2) {
                        try {
                            x = Double.parseDouble(Tokens[1]);
                        } catch (NumberFormatException e) {
                            System.out.println("Unsuccessful Transaction. Requested Loan is not a valid Number");
                            continue;
                        }
                        assert curr instanceof Account;
                        ((Account) curr).reqLoan(x);
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                } else if (Tokens[0].equalsIgnoreCase("Query")) {
                    if (Tokens.length == 1) {
                        assert curr instanceof Account;
                        ((Account) curr).query();
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if (Tokens[0].equalsIgnoreCase("help")) {
                    if (Tokens.length == 1) {
                        System.out.println("Commands:\n1.Deposit _amount_\n2.Withdraw _amount_\n3.Request _amount_\n4.Query\n5.Help\n6.Close");
                        //curr = U;
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else {
                    System.out.println("Invalid command");
                }


            }

            else if(curr.isEmp()) {
                if (Tokens[0].equalsIgnoreCase("Close")) {
                    if (Tokens.length == 1) {
                        System.out.println("Operations Closed for " + curr.getName());
                        curr = U;
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if(Tokens[0].equalsIgnoreCase("Lookup")){
                    if (Tokens.length == 2) {
                        assert curr instanceof Employee;
                        ((Employee)curr).lookup(Tokens[1].toUpperCase());
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if(Tokens[0].equalsIgnoreCase("ApproveLoan")){
                    if (Tokens.length == 2) {
                        assert curr instanceof Employee;
                        ((Employee)curr).ApproveLoan2(Tokens[1].toUpperCase());
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if(Tokens[0].equalsIgnoreCase("Change")){
                    double x;
                    if (Tokens.length == 3) {

                        try {
                            x = Double.parseDouble(Tokens[2]);
                        } catch (NumberFormatException e) {
                            System.out.println("Unsuccessful Operation. Given rate is not a valid Number");
                            continue;
                        }
                        assert curr instanceof Employee;
                        ((Employee) curr).ChangeIR(Tokens[1], x);
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if(Tokens[0].equalsIgnoreCase("See")){
                    if (Tokens.length == 1) {
                        assert curr instanceof Employee;
                        ((Employee)curr).seeIF();
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else if (Tokens[0].equalsIgnoreCase("help")) {
                    if (Tokens.length == 1) {
                        System.out.println("Commands:\n1.Lookup _name_\n2.ApproveLoan _name_\n3.Change _AccountType_ _NewRate_\n4.See\n5.Help\n6.Close");
                        //curr = U;
                    } else {
                        System.out.println("Invalid command");
                        continue;
                    }
                }
                else{
                    System.out.println("Invalid command");
                }
            }
            IF += y;
            y = 0;
        }

    }
}
