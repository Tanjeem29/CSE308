import java.util.Scanner;

public class CoRDemo {
    private static Solver makeChain(){
        Solver zero = new ZeroSolver();
        Solver real = new RealSolver();
        zero.setNextSolver(real);
        Solver ima = new ImaSolver();
        real.setNextSolver(ima);
        return zero;
    }


    public static void main(String[] args) {
        Solver S = makeChain();
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();
        S.showSolve2(a,b,c);
    }
}
