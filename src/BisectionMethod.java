import java.util.ArrayList;

public class BisectionMethod {
    private double a,b,c,result;

    private ArrayList<Double> results;

    public double BisectionMethod(double lower,double upper){
        a=lower;
        b=upper;
        results = new ArrayList<>();
        while(Math.abs(b-a)>0.00001) {
            c = (a + b) / 2;
            result = function.f(c);
            results.add(c);
            if (result * function.f(a) < 0) {
                b = c;
            } else {
                a = c;
            }

        }
        System.out.println(results);
        return c;
    }

    public int numberOfRepetitions(){return results.size();}

}
