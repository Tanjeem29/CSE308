package User;

import Bank.Bank;

public abstract class Employee extends User {
    private employeeType ET;

    protected void setET(employeeType ET) {
        this.ET = ET;
    }

    public void lookup(String name) {
        boolean exists = User.hm.containsKey(name.toUpperCase());
        if (exists) {
            if (User.hm.get(name.toUpperCase()).getUT() == userType.ACCOUNT) {
                System.out.println(name + "'s current balance: " + ((Account) User.hm.get(name.toUpperCase())).getBalance() + "$");
            } else {
                System.out.println("No such account exists");
            }
        } else {
            System.out.println("No such account exists");
        }
    }

    //    protected void ApproveLoan(){
//        for (Account a: Account.hm.values()) {
//            a.grantLoan();
//        }
//    }
    public abstract void ApproveLoan();
    public abstract void ApproveLoan2(String name);
    public abstract void welcome();

    public abstract void ChangeIR(String name, double x);

    public abstract void seeIF();

    public static User createEmpUtil(String n, int type) {
        boolean exists = hm.containsKey(n.toUpperCase());
        if (!exists) {
            User A;
            if (type == 1) {
//                SavingsAcc SA = new SavingsAcc();
//                SA.createAcc(n, x);
//                return SA;
                A = new MD();
            } else if (type == 2) {
//                Student S = new Student();
//                S.createAcc(n, x);
//                return S;
                A = new Officer();
            } else {
//                FixedDeposit FD = new FixedDeposit();
//                FD.createAcc(n,x);
//                return FD;
                A = new Cashier();
            }
//            else {
////                Loan L = new Loan();
////                L.createAcc(n,x);
////                return L;
//                A = new Loan();
//            }
            ((Employee) A).createEmp(n);
            A.setUT(userType.EMPLOYEE);
            hm.put(A.getName().toUpperCase(), A);
            return A;
        } else {
            System.out.println("An account with this name already exists");
            return null;
        }

    }

    protected abstract void createEmp(String n);

    @Override
    public String toString() {
        return name + ": " + ET;
    }
}



class MD extends Employee {
    @Override
    public void ApproveLoan() {
        for (User a : User.hm.values()) {
            if (a.getUT() == userType.ACCOUNT) {
                ((Account) a).grantLoan();
            }
        }
    }

    @Override
    public void ApproveLoan2(String name) {
        User u = User.searchForAcc(name.toUpperCase());
        if(u == null){
            System.out.println("No Account by this name");
            return;
        }
        ((Account)u).grantLoan();
    }

    @Override
    public void welcome() {
        User.showLoanReqs();
    }

    @Override
    public void ChangeIR(String name, double x) {
        x /= 100;
        if (name.equalsIgnoreCase("SAVINGS")) {
            //SavingsAcc.depositInterest = x;
            (new SavingsAcc()).changeDepInt(x);
        } else if (name.equalsIgnoreCase("STUDENT")) {
            //Student.depositInterest = x;
            (new Student()).changeDepInt(x);
        } else if (name.equalsIgnoreCase("FIXEDDEPOSIT")) {
            //FixedDeposit.depositInterest = x;
            (new FixedDeposit()).changeDepInt(x);
        }
    }

    @Override
    public void seeIF() {
        System.out.println(Bank.getIF());
    }

    @Override
    protected void createEmp(String n) {
        setName(n);
        setUT(userType.EMPLOYEE);
        setET(employeeType.MD);
        //User.hm.put(name, this);
    }

}

class Officer extends Employee {
    @Override
    public void ApproveLoan() {
        for (User a : User.hm.values()) {
            if (a.getUT() == userType.ACCOUNT) {
                ((Account) a).grantLoan();
            }
        }
    }

    @Override
    public void ChangeIR(String name, double x) {
        System.out.println("You Don't have Permission");
    }

    @Override
    public void seeIF() {
        System.out.println("You Don't have Permission");
    }

    @Override
    protected void createEmp(String n) {
        setName(n);
        setUT(userType.EMPLOYEE);
        setET(employeeType.OFFICER);
        //User.hm.put(name, this);
    }

    @Override
    public void ApproveLoan2(String name) {
        User u = User.searchForAcc(name.toUpperCase());
        if(u == null){
            System.out.println("No Account by this name");
            return;
        }
        ((Account)u).grantLoan();
    }

    @Override
    public void welcome() {
        User.showLoanReqs();
    }

}

class Cashier extends Employee {
    @Override
    public void ApproveLoan() {
        System.out.println("You Don't have Permission");
    }

    @Override
    public void ChangeIR(String name, double x) {
        System.out.println("You Don't have Permission");
    }

    @Override
    public void seeIF() {
        System.out.println("You Don't have Permission");
    }

    @Override
    protected void createEmp(String n) {
        setName(n);
        setUT(userType.EMPLOYEE);
        setET(employeeType.CASHIER);
        //User.hm.put(name, this);
    }

    @Override
    public void ApproveLoan2(String name) {
        System.out.println("You Don't have Permission");
    }

    @Override
    public void welcome() {

    }

}
