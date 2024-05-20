import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Task11 extends Task {
    int allVeretena = randomize(5, 9) * 100;
    double verObr = randomized(0.002, 0.006, 1000.0);
    int percent = randomize(2, 3);
    int count = randomize(3, 4);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "11. Прядильщица обслуживает " + allVeretena + " веретен. Вероятность обрыва нити на одном веретене в течение\n" +
                    " часа равна " + verObr + ". Какова вероятность того, что в течение часа нить оборвется на трех веретенах?\n";
        } else {
            return "11. Некачественные сверла составляют " + percent + "% всей продукции\n" +
                    " фабрики. Изготовленные сверла упаковываются в\n" +
                    "ящики по 100 штук. Какова вероятность того, что в ящике\n" +
                    " окажется не более " + count + " некачественных сверл?";
        }
    }
    public String answer() {
        if(variant == 5){
            double allVeretena1 = allVeretena;
            double tmp = Math.sqrt(allVeretena1 * verObr * (1 - verObr));
            double x = Math.abs((3 - allVeretena1 * verObr) / tmp);
            double fx = f(x);
            double ans = notail(fx / tmp);
            return "11. " + ans + ".";
        }else {
            int flag; double percent_d = percent*0.01;
            double x1 = notail((0 - 100 * percent_d) / sqrt(100 * percent_d * (1 - percent_d)));
            if (x1 < 0) flag = -1;
            else flag = 1;
            double x2 = abs(notail((count - 100 * percent_d) / sqrt(100 * percent_d * (1 - percent_d))));
            double ans = notail(F(x2) - flag*F(abs(x1)));
            return "11. " + ans;
        }
    }
}

