import java.util.ArrayList;

public class SecantMethod2 {
    private double x0,x1,x2,x3,q,r,s;
    private ArrayList<Double> results;

        public double SecantMethod(double lower,double upper){
            results = new ArrayList<>();
            x0=lower;x2=upper;x1=(lower+upper)/2.0;
            int maxIterations = 100;
            for(int i =0 ; i<maxIterations;i++){
                q=function.f(x0)/function.f(x1);
                r=function.f(x2)/function.f(x1);
                s=function.f(x2)/function.f(x0);

                x3 = x2 - ( r*(r-q)*(x2-x1) +(1-r)*s*(x2-x0)  )/((q-1)*(r-1)*(s-1) );
                results.add(x3);
                if(Math.abs(x3-x2)<=0.00001){
                    return x3;
                }
                else {
                    x0=x1;x1=x2;x2=x3;
                }
            }
            return x3;
        }

        public int numberOfRepetitions(){return results.size();}

    }


