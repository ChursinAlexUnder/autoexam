import static java.lang.Math.pow;

public class Task9 extends Task {
    double ver = randomized(0.01, 0.05, 100.0);
    int lights = randomize(4, 5);
    double p = randomized(0.02, 0.03, 100.0);
    int count1 = randomize(2, 3);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "9. Вероятность отказа локомотива на линии за время полного оборота составляет " + formatNum(ver) + ". Найти\n" +
                    " вероятность того, что в восьми поездах произойдет не более двух отказов локомотива на линии.\n";
        } else {
            return "9. В поезде " + lights + " электрических лампочек. Каждая из\n" +
                    "них перегорает в течение года с вероятностью " + formatNum(p) + ". Найти\n" +
                    "вероятность того, что в течение года перегорит не менее\n" +
                    count1 + " лампочек.\n";
        }
    }

    public String answer() {
        if (variant == 5) {
            double k0 = Math.pow((1 - ver), 8);
            double k1 = 8 * ver * Math.pow((1 - ver), 7);
            double k2 = 28 * Math.pow(ver, 2) * Math.pow((1 - ver), 6);
            return "9. " + formatNum(notail(k0 + k1 + k2)) + ".";
        } else {
            double ans = 0;
            for (int i = count1; i <= lights; i++)
                ans += C(lights, i) * pow(p, i) * pow(1 - p, lights - i);
            ans = notail(ans);

            return "9. " + formatNum(ans);
        }
    }
}

