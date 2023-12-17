import java.util.ArrayList;

public class NewtonRaphson {
    private double x1,x2;

    private ArrayList<Double> results;

    public double NewtonRaphson(double lower,double upper){
        results = new ArrayList<>();

        if(function.f(lower)*function.df_second(lower)>0)x1=lower;
        else if(function.f(upper)*function.df_second(upper)>0) x1=upper;
        results.add(x1);

        int maxIterations = 100;

        for (int i = 0; i < maxIterations; i++) {
            if (function.df_first(x1) != 0) {
                x2 = x1 - function.f(x1) / function.df_first(x1);
                results.add(x2);
                if (Math.abs(x2 - x1) <= 0.00001) {
                    //System.out.println(results);
                    return x2;
                } else {
                    x1 = x2;
                }
            }
        }
        System.out.println(results);
        return x2;
    }

    public int numberOfRepetitions(){return results.size();}

    public void checkQuadraticConvergence(double expected) {
        double sum=0,result;
        int counter=0;

        for(int i=2;i<results.size();i++){
            sum+=Math.log(Math.abs(results.get(i)-expected))/Math.log(Math.abs(results.get(i-1)-expected));
            counter++;
        }

        result=sum/counter;
        if(result>=1.5 && result<=2.5) System.out.println("For root "+x2+" Newton-Raphson converges quadratically");
        else System.out.println("For root "+x2+" Newton-Raphson does not converge quadratically");

    }


}


