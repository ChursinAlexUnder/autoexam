import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task16 extends Task {
    double a2 = randomized(0.5,1.5,10.0);
    double b2 = randomized(1.6,2.5,10.0);
    double a1 = randomized(0.2, 0.6,10.0);
    double b1 = randomized(0.7, 0.9,10.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "16. Дана функция распределения F(x) непрерывной случайной\n" +
                    "величины X.\n" +
                    "Требуется:" +
                    "1) найти плотность вероятности f(x);\n" +
                    "2) найти M(X), D(X), σ(Х);\n" +
                    "3) найти Р(a < X < b) для данных a = "+a1+", b = "+b1+".";
        } else {
            return "16. Дана функция распределения F(x) непрерывной случайной\n" +
                    "величины X.\n" +
                    "Требуется:" +
                    "1) найти плотность вероятности f(x);\n" +
                    "2) найти M(X), D(X), σ(Х);\n" +
                    "3) найти Р(a < X < b) для данных a = "+a2+", b = "+b2+".";
        }
    }
    public int getVariant(){
        return variant;
    }
    public String answer() {
        if(variant==5){
            String fx = "0, при x ⩽ 0; 1, при 0 < x ⩽ 1; 0, при x > 1}";
            String mx = "1/2";
            String dx = "1/12";
            String sigmax = "sqrt(1/12)";
            double P = notail(b1 - a1);
            return "16. 1) f(x) = " + fx + "; 2) M(X) = " + mx + ", D(X) = " + dx + ", σ(Х) = " + sigmax + "; 3) Р(a < X < b) = " + P + ".";
        } else {
            String fx = "{0, при x ⩽ 0; 2 * x / 9, при 0 < x ⩽ 3; 0, при x > 3}";
            double MX = notail((double) 2 /27*(pow(3,3) - pow(0,3)));
            double DX = notail((double) 1 /18*(pow(3, 4) - pow(0, 4)));
            double sigma = notail(sqrt(DX));
            double P = notail((double) 2 /9*(b2 - a2));
            return "16. 1) "+fx+"; 2) MX = "+MX+", DX = "+DX+", σ(Х) = "+sigma+"; 3) "+P;
        }
    }
}
