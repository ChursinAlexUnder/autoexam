import java.util.Random;
public class Task {
    Random random = new Random();
    public String fill(){return "";}
    public int randomize(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
    public double randomized(double min, double max, double znak) {
        double randomNumber = min + (max - min) * random.nextDouble();
        return Math.round(randomNumber * znak) / znak;
    }
    public String answer() {return "";}
}
