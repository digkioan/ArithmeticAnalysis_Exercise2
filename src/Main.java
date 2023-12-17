public class Main {
    public static void main(String[] args) {
        // Bisection Method
        BisectionMethod f1 = new BisectionMethod();
        int temp;

        System.out.println("Bisection method:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f1.BisectionMethod(-2, -1));
        temp = f1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f1.BisectionMethod(-1.5, 0.1));
        temp = f1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f1.BisectionMethod(0, 0.35));
        temp = f1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f1.BisectionMethod(0.35, 1));
        temp = f1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f1.BisectionMethod(1, 2));
        temp = f1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);

        System.out.println("----------------------------------------");

        // Newton-Raphson Method
        NewtonRaphson f2 = new NewtonRaphson();

        System.out.println("Newton-Raphson:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f2.NewtonRaphson(-2, -1));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);
        f2.checkQuadraticConvergence(-1.381);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f2.NewtonRaphson(-1, 0));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);
        f2.checkQuadraticConvergence(-0.6667);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f2.NewtonRaphson(0.2, 0.3));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);
        f2.checkQuadraticConvergence(0.205);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f2.NewtonRaphson(0.45, 1));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);
        f2.checkQuadraticConvergence(0.5);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f2.NewtonRaphson(1, 2));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);
        f2.checkQuadraticConvergence(1.176);

        System.out.println("----------------------------------------");

        // Secant Method
        SecantMethod f3 = new SecantMethod();

        System.out.println("Secant Method:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f3.SecantMethod(-2, -1.3));//edw xreaizetai na to balw pio konta sthn riza
        temp = f3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f3.SecantMethod(-1, 0));
        temp = f3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f3.SecantMethod(0, 0.35));
        temp = f3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f3.SecantMethod(0.35, 1));
        temp = f3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f3.SecantMethod(1, 2));
        temp = f3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);

        System.out.println("----------------------------------------");
    }

}
