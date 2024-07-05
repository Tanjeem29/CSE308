public class ZeroSolver extends Solver{
    public ZeroSolver(){
        type = ZEROSOLVE;
    }

    @Override
    protected void getRoots(double a, double b, double c) {
        x[0] = (-1*b)/(2*a);
        x[1] = x[0];
        System.out.println("Equal Roots: x1 = " + x[0] + ", x2 = " + x[1]);
        //System.out.print("Equal Roots: ");
        //showRoots();
    }
}
