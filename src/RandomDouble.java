import java.util.Random;

public class RandomDouble{

    public double getRandomDouble(double min, double max) {
        Random random = new Random();
        return min+(max-min)*random.nextDouble();
    }
}
