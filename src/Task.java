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
//    public int gcd(int a, int b) {
//        if (a == 0 && b == 0)
//            return 1;
//        if (a == 0 || b == 0)
//            return (a == 0) ? b : a;
//        int remainder = a % b;
//        if (remainder == 0) {
//            return b;
//        } else return gcd(b, remainder);
//    }


}
