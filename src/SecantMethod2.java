import java.util.ArrayList;
import java.util.Collections;

public class SecantMethod2 {
        private double x1,x2,x3,x4,q,r,s;

        private ArrayList<Double> results,arr;

        public double SecantMethod(double lower,double upper){
            results=new ArrayList<>();
            x1=lower;x3=upper;
            x2=(lower+upper)/2.0;
            q=function.f(x1)/function.f(x2);r=function.f(x3)/function.f(x2);s=function.f(x3)/function.f(x1);
            int maxIterations = 100;

            for (int i = 0; i < maxIterations; i++) {
                if (function.f(x2)-function.f(x1) !=0) {
                    x4=x3-(r*(r-q)*(x3-x2)+(1-r)*s*(x3-x1))/((q-1)*(r-1)*(s-1));
                    results.add(x4);
                    if (Math.abs(x4-x3) <= 0.00001) {
                        System.out.println(results);
                        return x4;
                    } else {
                        x1=x2;
                        x2=x3;
                        x3=x4;
                       /* arr=arrange(x1,x2,x3);
                        x1=arr.get(0);
                        x2=arr.get(1);
                        x3=arr.get(2);*/
                    }
                }
            }
            System.out.println(results);
            return x4;


        }

        public int numberOfRepetitions(){return results.size();}

    private ArrayList<Double> arrange(double x1, double x2, double x3){
            ArrayList<Double> arr = new ArrayList<>();
            arr.add(x1);arr.add(x2);arr.add(x3);
            Collections.sort(arr);
            return arr;
    }
    }


