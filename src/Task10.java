import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Task10 extends Task {
    int allTest = randomize(5, 6) * 100, kol = randomize(15, 17) * 10, kol1 = randomize(23, 24) * 10, kol2 = randomize(17, 18) * 10;
    double ver = randomized(0.3, 0.4, 10.0);
    double boy = randomized(0.510, 0.535, 1000.0);
    int[] array = {60, 70, 80, 90};
    int count = array[randomize(0, 3)];
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "10. В каждом из " + allTest + " независимых испытаний событие А происходит с постоянной вероятностью " + formatNum(ver) + ".\n" +
                    " Найти вероятность того, что событие А наступит:\n" +
                    "а) точно " + kol + " раз;\n" +
                    "б) менее чем " + kol1 + " и более чем " + kol2 + " раз.\n";
        } else {
            return "10. Вероятность рождения мальчика равна " + formatNum(boy) + ". Чему\n" +
                    "равна вероятность того, что среди " + count + " новорожденных:\n" +
                    "а) мальчиков ровно половина;\n" +
                    "б) не менее половины мальчиков?";
        }
    }

    public String answer() {
        if(variant == 5){
            double allTest1 = allTest, kol0 = kol, kol11 = kol1, kol22 = kol2;
            double tmp = Math.sqrt(allTest1 * ver * (1 - ver));
            double x = (kol0 - allTest1 * ver) / tmp;
            double fx = f(x);
            double ans1 = fx / tmp;
            double flag1, flag2;
            double x1 = (kol22 - allTest1 * ver) / tmp, x2 = (kol11 - allTest1 * ver) / tmp;
            if (x1 < 0)
                flag1 = -1;
            else flag1 = 1;
            if (x2 < 0)
                flag2 = -1;
            else flag2 = 1;
            x1 = Math.abs(x1);
            x2 = Math.abs(x2);
            double Fx1 = F(x1) * flag1, Fx2 = F(x2) * flag2;
            double ans2 = notail(Fx2 - Fx1);
            return "10. а) " + formatNum(ans1) + "; б) " + formatNum(ans2) + ".";
        }else {
            int flag;
            double x1 = notail(((double) count / 2 - count * boy) / sqrt(count * boy * (1 - boy)));
            if (x1 < 0) flag = -1;
            else flag = 1;
            double ans1 = notail(f(flag * x1) / sqrt(count * boy * (1 - boy)));
            double x2 = abs(notail((count - count * boy) / sqrt(count * boy * (1 - boy))));
            double ans2 = notail(F(x2) - flag * F(abs(x1)));
            return "10. a)" + formatNum(ans1) + "; b) " + formatNum(ans2);
        }
    }
}
