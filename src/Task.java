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
    public String reduction(int a, int b) {
        int temp1 = a, temp2 = b;
        while (temp2 != 0) {
            int temp3 = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp3;
        }
        a /= temp1;
        b /= temp1;
        return a + "/" + b;
    }
    public int C(int n, int k) {
        if (k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid arguments: n = " + n + ", k = " + k);
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return C(n - 1, k - 1) + C(n - 1, k);
    }
    public double notail(double a){
        return Math.round(a*10000.0)/10000.0;
    }
}
