import java.lang.Math;
public class function {
    public static double f(double x){
        return 54*Math.pow(x,6)+45*Math.pow(x,5)-102*Math.pow(x,4) -69*Math.pow(x,3)+35*Math.pow(x,2)+16*x-4;
    }

    public static double df_first(double x){return 324*Math.pow(x,5)+225*Math.pow(x,4) -408*Math.pow(x,3)-207*Math.pow(x,2)+70*x+16;}

    public static double df_second(double x){return 1620*Math.pow(x,4) +900*Math.pow(x,3)-1224*Math.pow(x,2)-414*x+70;}


}
