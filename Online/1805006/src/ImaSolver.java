public class ImaSolver extends Solver{
    public ImaSolver(){
        type = IMASOLVE;
    }
    @Override
    protected void getRoots(double a, double b, double c) {
        double D = Math.sqrt(4 * a * c - b * b);
        double r = -b/(2*a);
        double im = D/(2*a);
//        x[0] = ((-1*b) + D)/(2*a);
//        x[1] = ((-1*b) - D)/(2*a);
        System.out.println("Complex Roots: x1 = " + r + " + j(" + im +"), " + "x2 = " + r + " - j(" + im +")");
        //System.out.print("Equal Roots: ");
        //showRoots();
    }
}
