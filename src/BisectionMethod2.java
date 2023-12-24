import java.util.ArrayList;

public class BisectionMethod2 {
        private double a,b,c,result;

        private ArrayList<Double> results;
        RandomDouble randomDouble;

        public double BisectionMethod(double lower,double upper){
            a=lower;
            b=upper;
            results = new ArrayList<>();
            randomDouble=new RandomDouble();
            int i=0;
            while(Math.abs(b-a)>0.00001 && i<100) {
                c =randomDouble.getRandomDouble(a, b);
                result = function.f(c);
                results.add(c);
                i++;
                if (result * function.f(a) < 0) {
                    b = c;
                } else {
                    a = c;
                }

            }
            return c;
        }

        public int numberOfRepetitions(){return results.size();}

    }


