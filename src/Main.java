public class Main {
    public static void main(String[] args) {
        // Bisection Method
        BisectionMethod f1 = new BisectionMethod();
        BisectionMethod2 f1_1 = new BisectionMethod2();
        int temp;

        System.out.println("Bisection method:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f1.BisectionMethod(-2, -1));
        temp = f1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f1.BisectionMethod(-1, 0));
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

        System.out.println("Bisection 2 method:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f1_1.BisectionMethod(-2, -1));
        temp = f1_1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f1_1.BisectionMethod(-1, 0));
        temp = f1_1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f1_1.BisectionMethod(0, 0.35));
        temp = f1_1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f1_1.BisectionMethod(0.35, 1));
        temp = f1_1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f1_1.BisectionMethod(1, 2));
        temp = f1_1.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);

        System.out.println("----------------------------------------");

        // Newton-Raphson Method
        NewtonRaphson f2 = new NewtonRaphson();
        NewtonRaphson2 f2_2= new NewtonRaphson2();

        System.out.println("Newton-Raphson:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f2.NewtonRaphson(-2, -1));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f2.NewtonRaphson(-1, 0));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f2.NewtonRaphson(0.13, 0.35));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f2.NewtonRaphson(0.35, 0.75));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f2.NewtonRaphson(1, 2));
        temp = f2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);

        System.out.println("----------------------------------------");

        System.out.println("Newton-Raphson 2:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f2_2.NewtonRaphson2(-2, -1));
        temp = f2_2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f2_2.NewtonRaphson2(-1, 0));
        temp = f2_2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f2_2.NewtonRaphson2(0.13, 0.35));
        temp = f2_2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f2_2.NewtonRaphson2(0.35, 0.75));
        temp = f2_2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f2_2.NewtonRaphson2(1, 2));
        temp = f2_2.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);

        System.out.println("----------------------------------------");


        // Secant Method
        SecantMethod f3 = new SecantMethod();
        SecantMethod2 f3_3 = new SecantMethod2();

        System.out.println("Secant Method:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f3.SecantMethod(-2, -1.2));
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

        System.out.println("Secant Method 2:");

        // Set [-2, -1]
        System.out.println("Root 1 for [-2, -1] = " + f3_3.SecantMethod(-2, -1));
        temp = f3_3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root1: " + temp);

        // Set [-1, 0]
        System.out.println("Root 2 for [-1, 0] = " + f3_3.SecantMethod(-1, 0));
        temp = f3_3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root2: " + temp);

        // Set [0, 0.35]
        System.out.println("Root 3 for [0, 0.35] = " + f3_3.SecantMethod(0, 0.35));
        temp = f3_3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root3: " + temp);

        // Set [0.35, 1]
        System.out.println("Root 4 for [0.35, 1] = " + f3_3.SecantMethod(0.35, 1));
        temp = f3_3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root4: " + temp);

        // Set [1, 2]
        System.out.println("Root 5 for [1, 2] = " + f3_3.SecantMethod(1, 2));
        temp = f3_3.numberOfRepetitions();
        System.out.println("Number of Repetitions for root5: " + temp);

        System.out.println("----------------------------------------");
    }

}
