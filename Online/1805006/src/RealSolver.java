public class RealSolver extends Solver{
    public RealSolver(){
        type = REALSOLVE;
    }
    @Override
    protected void getRoots(double a, double b, double c) {
        double D = Math.sqrt(b*b - 4 * a * c);

        x[0] = ((-1*b) + D)/(2*a);
        x[1] = ((-1*b) - D)/(2*a);
        System.out.println("Real Roots: x1 = " + x[0] + ", x2 = " + x[1]);
        //System.out.print("Equal Roots: ");
        //showRoots();
    }
}
