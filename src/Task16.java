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
                    "2) построить графики F(x) и f(x);\n" +
                    "3) найти M(X), D(X), σ(Х);\n" +
                    "4) найти Р(a < X < b) для данных a = "+a1+", b = "+b1+".";
        } else {
            return "16. Дана функция распределения F(x) непрерывной случайной\n" +
                    "величины X.\n" +
                    "Требуется:" +
                    "1) найти плотность вероятности f(x);\n" +
                    "2) построить графики F(x) и f(x);\n" +
                    "3) найти M(X), D(X), σ(Х);\n" +
                    "4) найти Р(a < X < b) для данных a = "+a2+", b = "+b2+".";
        }
    }
    public int getVariant(){
        return variant;
    }
    public String answer() {
        if(variant==5){
            return "";
        }else {
            return "";
        }
    }
}
