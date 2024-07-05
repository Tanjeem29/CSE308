package User;

import java.util.HashMap;
import java.util.Locale;

public abstract class Account extends User {
    private accountType AT;
    protected double balance;
    protected double loan;
    protected double loanreq;
    protected int years;
    protected double loanInterest;
    protected double SC;
    //static double depositInterest;
    static protected HashMap<String, Account> hm2 = new HashMap<>();


    protected abstract boolean createAcc(String n, double initBal); //take type as input

    public abstract double deposit(double x);

    public abstract double withdraw(double x);

    public abstract void reqLoan(double x);

    protected abstract double getDepInt();

    protected void setAT(accountType at){AT = at;}

    protected accountType getAT(accountType at){return AT;}

    public abstract void changeDepInt(double x);

    public abstract void initCreateMessage();


    public Account() {
        years = 0;
        loanInterest = .1;
        SC = 500;
    }

    public Account(double i) {
        years = 0;
        loanInterest = i;
        SC = 500;
    }


    public static void incYearsUtil() {
        System.out.println("1 year passed");
        for (User a : hm.values()) {
            if (a.getUT() == userType.ACCOUNT) {
                ((Account) a).incYears();
                ((Account) a).incBalance();
                ((Account) a).incLoan();
                ((Account) a).serviceCharge();
            }
        }
    }

    protected abstract void serviceCharge();

    protected void incBalance() {
        balance = balance * (1 + getDepInt());
        //System.out.println(balance);
    }

    protected void incYears() {
        years++;
    }

    ///
    protected void incLoan() {
        balance -= loan * loanInterest;
        //System.out.println(balance);
    }

    public void grantLoan() {
        loan += loanreq;
        balance += loanreq;
        System.out.println("Loan for " + getName() + " approved");
        loanreq = 0;
    }


    public void query() {
        System.out.println("Current Balance: " + Math.round(balance) + " $");
        if (loan > 0) {
            System.out.println("Current Loan: " + Math.round(loan) + " $");
        }
        if (loanreq > 0) {
            System.out.println("Current Request for Loan: " + Math.round(loanreq) + " $");
        }
    }

    public static User createAccUtil(String n, double x, int type) {
        boolean exists = hm.containsKey(n.toUpperCase());
        if (!exists) {
            User A;
            String t;
            if (type == 1) {
//                SavingsAcc SA = new SavingsAcc();
//                SA.createAcc(n, x);
//                return SA;
                A = new SavingsAcc();
                t = "Savings";
            } else if (type == 2) {
//                Student S = new Student();
//                S.createAcc(n, x);
//                return S;
                A = new Student();
                t = "Student";
            } else if (type == 3) {
//                FixedDeposit FD = new FixedDeposit();
//                FD.createAcc(n,x);
//                return FD;
                A = new FixedDeposit();
                t = "Fixed Deposit";
            } else if(type == 4){
//                Loan L = new Loan();
//                L.createAcc(n,x);
//                return L;
                A = new Loan();
                t = "Loan";
            }
            else{
                System.out.println("Invalid Type");
                return null;
            }
            boolean flag = ((Account)A).createAcc(n, x);
            if(flag == false) return null;
            A.setUT(userType.ACCOUNT);
            hm.put(A.getName().toUpperCase(), A);
            ((Account) A).initCreateMessage();
            return A;

        } else {
            System.out.println("An account with this name already exists");
            return null;
        }

    }

    public double getBalance() {
        return balance;
    }

    public double getLoan() {
        return loan;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AT=" + AT +
                ", balance=" + balance +
                ", loan=" + loan +
                ", loanreq=" + loanreq +
                ", years=" + years +
                ", loanInterest=" + loanInterest +
                '}';
    }

}

class SavingsAcc extends Account{
    static double maxLoan = 10000;
    static double minBal = 1000;
    static double depositInterest = .1;

    @Override
    public boolean createAcc(String n, double x) {
        name = n;
        balance = x;
        setAT(accountType.SAVINGS);
        //depositInterest = .1;
        return true;
    }

    @Override
    public double deposit(double x) {
        if(x>0){
            balance += x;
            System.out.println("Transaction Successful." + " Deposited "+ Math.round(x) + "$. Current Balance: " + Math.round(balance) + " $");
            return x;
        }
        else{
            System.out.println("Transaction Unsuccessful. Improper amount");
            return 0;
        }

    }

    @Override
    public double withdraw(double x) {
        if(balance-x<minBal){
            System.out.println("Transaction Unsuccessful. Not enough balance for a Savings Account. Current Balance: " + Math.round(balance) + " $");
            return 0;
        }
        else{
            balance-=x;
            System.out.println("Transaction Successful. Current Balance: " + Math.round(balance) + " $");
            return -x;
        }
    }

    @Override
    public void reqLoan(double x) {
        if(x + loanreq + getLoan() > maxLoan){
            System.out.println("Loan Request Unsuccessful. Requested loan amount exceeds permissible value of " + maxLoan + " $");
        }
        else{
            if(x>0){
                loanreq += x;
                System.out.println("Loan Request Successful. Awaiting approval");
            }
            else{
                System.out.println("Loan Request Unsuccessful. Invalid loan amount");
            }
        }
    }

    @Override
    public double getDepInt() {
        return depositInterest;
    }
    public void changeDepInt(double x){
        depositInterest = x;
        System.out.println("Change successful. New rate for Savings: " + x * 100);
    }

    @Override
    public void initCreateMessage() {
        System.out.println("Savings Account for " + getName() + " created; initial balance: " + getBalance() + "$");
    }

    @Override
    protected void serviceCharge() {
        balance -= SC;
        //System.out.println(balance);
    }


}

class Student extends Account{

    static double maxWithdraw = 10000;
    static double maxLoan = 1000;
    static double depositInterest = .05;

    @Override
    public boolean createAcc(String n, double x) {
        name = n;
        balance = x;
        setAT(accountType.STUDENT);
        //depositInterest = .05;
        return true;
    }

    @Override
    public double deposit(double x) {
        if(x>0){
            balance += x;
            System.out.println("Transaction Successful." + " Deposited "+ Math.round(x) + "$. Current Balance: " + Math.round(balance) + " $");
            return x;
        }
        else{
            System.out.println("Transaction Unsuccessful. Invalid deposit amount");
            return 0;
        }

    }

    @Override
    public double withdraw(double x) {
        if(balance<x){
            System.out.println("Transaction Unsuccessful. Not enough balance. Current Balance: " + Math.round(balance) + " $");
            return 0;
        }
        else if(x > maxWithdraw){
            System.out.println("Transaction Unsuccessful. A Student Account cannot withdraw more than " + maxWithdraw + " $");
            return 0;
        }
        else{
            balance-=x;
            System.out.println("Transaction Successful. Current Balance: " + Math.round(balance) + " $");
            return -x;
        }
    }

    @Override
    public void reqLoan(double x) {
        if(x + loanreq + getLoan() > maxLoan){
            System.out.println("Loan Request Unsuccessful. Requested loan amount exceeds permissible value of " + maxLoan + " $");
        }
        else{
            if(x>0){
                loanreq += x;
                System.out.println("Loan Request Successful. Waiting approval");
            }
            else{
                System.out.println("Loan Request Unsuccessful. Invalid loan amount");
            }
        }
    }

    @Override
    public double getDepInt() {
        return depositInterest;
    }
    public void changeDepInt(double x){
        depositInterest = x;
        System.out.println("Change successful. New rate for Student: " + x * 100);
    }

    @Override
    public void initCreateMessage() {
        System.out.println("Student Account for " + getName() + " created; initial balance: " + getBalance() + "$");
    }

    @Override
    protected void serviceCharge() {
        balance -= SC;
    }
}

class FixedDeposit extends Account{

    static double minFirstDeposit = 100000;
    static double minDeposit = 50000;
    static int minMaturity = 1;
    static double maxLoan = 100000;
    static double depositInterest = .15;

    @Override
    public boolean createAcc(String n, double x) {
        if(x>= minFirstDeposit) {
            name = n;
            balance = x;
            setAT(accountType.FIXED);
            //depositInterest = .15;
            return true;
        }
        else{
            System.out.println("Unsuccessful Request. Insufficient initial deposit.");
            return false;
        }
    }

    @Override
    public double deposit(double x) {
        if(x>=minDeposit){
            balance += x;
            System.out.println("Transaction Successful." + " Deposited "+ Math.round(x) + "$. Current Balance: " + Math.round(balance) + " $");
            return x;
        }
        else{
            System.out.println("Transaction Unsuccessful. Invalid deposit amount. Minimum deposit: " + Math.round(minDeposit) + " $");
            return 0;
        }

    }

    @Override
    public double withdraw(double x) {
        if(years < minMaturity){
            System.out.println("Unsuccessful Transaction. Minimum maturity not yet reached.");
            return 0;
        }
        if(balance<x){
            System.out.println("Transaction Unsuccessful. Not enough balance. Current Balance: " + Math.round(balance) + " $");
            return 0;
        }
        else{
            balance-=x;
            System.out.println("Transaction Successful. Current Balance: " + Math.round(balance) + " $");
            return -x;
        }
    }

    @Override
    public void reqLoan(double x) {
        if(x + loanreq + getLoan() > maxLoan){
            System.out.println("Loan Request Unsuccessful. Requested loan amount exceeds permissible value of " + maxLoan + " $");
        }
        else{
            if(x>0){
                loanreq += x;
                System.out.println("Loan Request Successful. Awaiting approval");
            }
            else{
                System.out.println("Loan Request Unsuccessful. Invalid loan amount");
            }
        }
    }
    @Override
    public double getDepInt() {
        return depositInterest;
    }
    public void changeDepInt(double x){
        depositInterest = x;
        System.out.println("Change successful. New rate for Fixed Deposit: " + x * 100);
    }

    @Override
    public void initCreateMessage() {
        System.out.println("Fixed Deposit Account for " + getName() + " created; initial balance: " + getBalance() + "$");
    }

    @Override
    protected void serviceCharge() {
        balance -= SC;
    }


}

class Loan extends Account{

    static double maxLoan;
    static double depositInterest = 0;

    @Override
    protected boolean createAcc(String n, double x) {
        name = n;
        balance = 0;
        loan = x;
        setAT(accountType.LOAN);
        SC = 0;
        //depositInterest = 0;
        return true;
    }

    @Override
    public double deposit(double x) {
        if(loan > 0){
            loan -= x;
            if(loan < 0){
                balance -= loan;
                loan = 0;

            }
            System.out.println("Transaction Successful. Current Loan: " + Math.round(loan) + " $");
            return x;
        }
        else{
            System.out.println("Transaction Unsuccessful. Loan has already been repaid.");
            return 0;
        }

    }

    @Override
    public double withdraw(double x) {
        System.out.println("Invalid Transaction. Loan Accounts cannot withdraw.");
        return 0;
    }

    @Override
    public void reqLoan(double x) {
        maxLoan = .05 * loan;
        if(x + loanreq  > maxLoan){
            System.out.println("Loan Request Unsuccessful. Requested loan amount exceeds permissible value of " + maxLoan + " $");
        }
        else{
            if(x>0){
                loanreq += x;
                System.out.println("Loan Request Successful. Awaiting approval");
            }
            else{
                System.out.println("Loan Request Unsuccessful. Invalid loan amount");
            }
        }
    }
    @Override
    protected double getDepInt() {
        return depositInterest;
    }
    public void changeDepInt(double x){
        depositInterest = x;
        System.out.println("Loan accounts do not have deposit interest rates");
    }

    @Override
    public void initCreateMessage() {
        System.out.println("Loan Account for " + getName() + " created; initial loan: " + getLoan() + "$");
    }

    @Override
    protected void serviceCharge() {
        balance -= SC;
    }

    @Override
    public double getBalance(){
        return -getLoan();
    }


}