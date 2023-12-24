import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        BisectionMethod2 f = new BisectionMethod2();
        int temp;
        ArrayList<Integer> reps = new ArrayList<>();
        for(int i=0;i<20;i++){
            temp=0;
            f.BisectionMethod(-2,-1);
            temp+=f.numberOfRepetitions();
            f.BisectionMethod(-1,0);
            temp+=f.numberOfRepetitions();
            f.BisectionMethod(0,0.35);
            temp+=f.numberOfRepetitions();
            f.BisectionMethod(0.35,1);
            temp+=f.numberOfRepetitions();
            f.BisectionMethod(1,2);
            temp+=f.numberOfRepetitions();
            reps.add(temp);
        }
        System.out.println(reps);
    }


}
