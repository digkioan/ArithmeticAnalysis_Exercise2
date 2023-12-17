import java.util.ArrayList;

public class SecantMethod {
    private double x1,x2,x3;

    private ArrayList<Double> results;

    public double SecantMethod(double lower,double upper){
        results=new ArrayList<>();
        x1=lower;x2=upper;
        int maxIterations = 100;

        for (int i = 0; i < maxIterations; i++) {
            if (function.f(x2)-function.f(x1) !=0) {
                x3=x2-(function.f(x2)*(x2-x1))/(function.f(x2)-function.f(x1));
                results.add(x3);
                if (Math.abs(x3 - x2) <= 0.00001) {
                    //System.out.println(results);
                    return x3;
                } else {
                    x1=x2;
                    x2 = x3;
                }
            }
        }
        System.out.println(results);
        return x3;


    }

    public int numberOfRepetitions(){return results.size();}
}
