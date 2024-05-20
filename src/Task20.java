import static java.lang.Math.sqrt;

public class Task20 extends Task {
    int pa = randomize(1, 3) * 100, pb = randomize(4, 6) * 100, pc = randomize(9, 10) * 100;
    int variant = randomize(5, 6);
    int A = randomize(2, 5);

    public String fill() {
        if (variant == 5) {
            return "20. Время T работы лазерного принтера до выхода из строя имеет экспоненциальное распределение с плотностью \n" +
                    "f(t) = 0,00042e–0,00042t (t > 0). \n" +
                    "Найти вероятность того, что принтер проработает до выхода из строя не менее:\n" +
                    "а) " + pa + " ч;\n" +
                    "б) " + pb + " ч;\n" +
                    "в) " + pc + " ч.\n";
        } else {
            return "20. Для какого значения А функция:  \n" +
                    "f(x) = {0, при x<0; 1/" + A + " * exp(-3" + A + "x), при x>=0}    является:" +
                    " а) плотностью вероятности;\n" +
                    "б) плотностью вероятности экспоненциального закона?";
        }
    }

    public String answer() {
        if (variant == 5) {
            return "";
        } else {
            double ans = notail(sqrt((double) 1 / A));
            return "20. a) A = ± " + ans + "; б) A = " + ans;
        }
    }
}
