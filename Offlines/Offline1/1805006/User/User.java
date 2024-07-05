package User;
import java.util.HashMap;

enum userType{
    ACCOUNT, EMPLOYEE, NONE
}
enum accountType{
    SAVINGS, STUDENT, LOAN, FIXED
}
enum employeeType{
    MD, OFFICER, CASHIER
}


public class User {
    protected String name;
    protected userType UT;
    static protected HashMap<String, User> hm = new HashMap<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUT(userType UT) {
        this.UT = UT;
    }
    public void makeNone(){ UT = userType.NONE; }
    public boolean isNone(){return UT == userType.NONE;}
    public boolean isAcc(){return UT == userType.ACCOUNT;}
    public boolean isEmp(){return UT == userType.EMPLOYEE;}

    public userType getUT() {
        return UT;
    }
    public static User searchForUser(String name){
        User ans;
        ans = hm.get(name.toUpperCase());
        if(ans == null){
            return null;
        }
        else{
            return ans;
        }
    }
    public static User searchForAcc(String name){
        User ans;
        ans = hm.get(name.toUpperCase());
        if(ans == null){
            return null;
        }
        else if(ans.getUT()!= userType.ACCOUNT){
            return null;
        }
        else{
            return ans;
        }
    }
    public static User searchForEmp(String name){
        User ans;
        ans = hm.get(name.toUpperCase());
        if(ans == null){
            return null;
        }
        else if(ans.getUT()!= userType.EMPLOYEE ){
            return null;
        }
        else{
            return ans;
        }
    }
    public static void showLoanReqs(){
        int cnt = 0;
        for(User u : User.hm.values()) {
            if(u.getUT() == userType.ACCOUNT){
                if(((Account)u).loanreq > 0){
                    cnt++;
                    if(cnt == 1){
                        System.out.println("There are loan requests pending. Showing names, requests:");
                    }
                    System.out.println(cnt + ". " + u.getName() + "; Loan: " + ((Account) u).loanreq + "$");
                }
            }
        }
        if(cnt == 0){
            System.out.println("No pending Loan requests");
        }
    }
    public static void showAll(){
        for(User u : User.hm.values())
            System.out.println(u);
    }
    public static void main(String[] args) {
        System.out.println("test");



    }
}




