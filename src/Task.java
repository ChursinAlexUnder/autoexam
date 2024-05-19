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
}
