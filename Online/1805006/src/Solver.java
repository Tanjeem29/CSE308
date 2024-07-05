public abstract class Solver {
    public static int ZEROSOLVE = 0;
    //public static int REALSOLVE = 2;
    public static int REALSOLVE = 1;
    public static int IMASOLVE = 2;

    protected static double x[] = new double[2];
    protected int type;
    protected Solver nextSolver;
    public void setNextSolver(Solver n){
        nextSolver = n;
    }

    public void showSolve2(double a, double b, double c){
        int t = getLevel(a,b,c);
        showSolve(t,  a,  b,  c);
    }
    private void showSolve(int t, double a, double b, double c){
        if(t <= type){
            getRoots(a,b,c);
        }
        else if(nextSolver!=null){
            nextSolver.showSolve(t, a, b, c);
        }
        else {
            System.out.println("Error!");
        }
    }



    private int getLevel(double a, double b, double c){
        if(b*b - 4 * a* c == 0){
            return ZEROSOLVE;
        }
        else if(b*b - 4 * a* c > 0){
            return REALSOLVE;
        }
        else{
            return IMASOLVE;
        }
    }

    protected abstract void getRoots(double a, double b, double c);
//    protected void showRoots(){
//        System.out.println(" x1 = " + x[0] + ", x2 = " + x[1]);
//    }



}
