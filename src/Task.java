import java.util.Random;
public class Task {
    Random random = new Random();
    public String fill(){return "";}
    public int randomize(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
    public double randomize(double min, double max){
        return random.nextDouble((max - min) + 1) + min;
    }
}
