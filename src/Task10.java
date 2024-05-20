import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Task10 extends Task {
    int allTest = randomize(4, 6) * 100, kol = randomize(20, 30) * 10, kol1 = randomize(10, 20) * 10, kol2 = randomize(25, 30) * 10;
    double ver = randomized(0.3, 0.6, 10.0);
    double boy = randomized(0.510, 0.535, 1000.0);
    int[] array = {60, 70, 80, 90};
    int count = array[randomize(0, 3)];
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "10. В каждом из " + allTest + " независимых испытаний событие А происходит с постоянной вероятностью " + ver + ".\n" +
                    " Найти вероятность того, что событие А наступит:\n" +
                    "а) точно " + kol + " раз;\n" +
                    "б) менее чем " + kol1 + " и более чем " + kol2 + " раз.\n";
        } else {
            return "10. Вероятность рождения мальчика равна " + boy + ". Чему\n" +
                    "равна вероятность того, что среди " + count + " новорожденных:\n" +
                    "а) мальчиков ровно половина;\n" +
                    "б) не менее половины мальчиков?";
        }
    }

    public String answer() {
        if (variant == 5) {
            return "";
        } else {
            int flag;
            double x1 = notail(((double) count / 2 - count * boy) / sqrt(count * boy * (1 - boy)));
            if (x1 < 0) flag = -1;
            else flag = 1;
            double ans1 = notail(f(flag * x1) / sqrt(count * boy * (1 - boy)));
            double x2 = abs(notail((count - count * boy) / sqrt(count * boy * (1 - boy))));
            double ans2 = notail(F(x2) - flag * F(abs(x1)));
            return "10. a)" + ans1 + "; b) " + ans2;
        }
    }
}
