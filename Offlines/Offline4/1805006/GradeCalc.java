//import java.util.Scanner;

public class GradeCalc {
    int cred;
    int getCred(){
        return cred;
    }
    void setCred(int x){
        cred = x;
    }
    public GradeCalc(int p){
        cred = p;
    }

    String Calculate(Object x){
        String ans = new String();
        double mark = 0;
        int flag = 0;
        try{
            mark = Double.parseDouble(x.toString());
        }
        catch(NumberFormatException e){
            ans= "Invalid Input: Non_number Input";
            flag++;
        }
        if(flag==0){
            if(mark<0){
                ans = "Invalid Input: Negative mark";
            }
            else if(mark > 100 * getCred()){
                ans = "Invalid Input: Exceeds Upper Bound";
            }
            else{
                mark = Math.ceil(mark);
                if(mark>=80*cred){
                    ans = "A";
                }
                else if(mark>=70*getCred()){
                    ans = "B";
                }
                else if(mark>=60*getCred()){
                    ans = "C";
                }
                else {
                    ans = "F";
                }
            }
        }
        return ans;
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println(GradeCalc.Calculate(in.next(), in.nextInt()));
//    }
}
