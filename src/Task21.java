import static java.lang.Math.abs;

public class Task21 extends Task {
    int sigma1 = randomize(1, 2) * 10;
    int mat = randomize(9, 11) * 10;
    int vagon = randomize(8, 10) * 10;
    int m = randomize(2, 4), sigma2 = randomize(2, 3), t1 = randomize(5, 7), t2 = randomize(8, 9);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "21. Случайная величина — период накопления состава на сортировочном пути — распределена по\n" +
                    " нормальному закону с параметрами m = " + m + " ч и σ = " + sigma2 + " ч. Какова вероятность того, что случайная\n" +
                    " величина будет заключена между " + t1 + " и " + t2 + " часами?\n";
        } else {
            return "21. Число вагонов в прибывающем на расформирование\n" +
                    "составе является случайной величиной, распределенной\n" +
                    "по нормальному закону с параметрами σ = " + sigma1 + ", m = " + mat + ".\n" +
                    "Определить вероятность того, что в составе будет не более\n" + vagon + " вагонов";
        }
    }

    public String answer() {
        if (variant == 5) {
            double x1 = (double) (t1 - m) / sigma2;
            double x2 = (double) (t2 - m) / sigma2;
            int flag1 = 1, flag2 = 1;
            if (x1 < 0) flag1 = -1;
            if (x2 < 0) flag2 = -1;
            double Fx1 = F(abs(x1)), Fx2 = F(abs(x2));
            double ans = notail(flag2 * Fx2 - flag1 * Fx1);
            return "21. " + ans + ".";
        } else {
            double x2 = (double) (vagon - mat) / sigma1;
            double x1 = (double) mat / sigma1;
            int flag;
            if (x2 > 0) flag = 1;
            else flag = -1;
            double P = notail(F(x1) + flag * F(abs(x2)));
            return "21. "+P;
        }
    }
}
