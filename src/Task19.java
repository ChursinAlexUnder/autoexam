public class Task19 extends Task {
    int m1 = randomize(0, 2) * 10;
    double sigma1 = randomized(0.4, 0.6, 10.0);
    double p_long = randomized(0.7, 0.9, 10.0);
    int m2 = randomize(3, 15);
    double sigma2 = randomized(0.1, 0.5, 10.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "19. Станок-автомат изготавливает валики, контролируя их диаметр X. Считая, что X распределено\n" +
                    " нормально (m = " + m2 + " мм, σ = " + sigma2 + " мм), найти интервал, в котором с вероятностью 0,9973 будут\n" +
                    " заключены диаметры изготавливаемых валиков.\n";
        } else {
            return "19. Отклонение длины L изготавливаемых деталей от\n" +
                    "стандарта есть случайная величина, распределенная по\n" +
                    "нормальному закону (m = " + m1 + ", σ = " + sigma1 + " см). Если стандартная\n" +
                    "длина детали равна 40 см, то в каком диапазоне окажутся\n" +
                    "длины деталей с вероятностью " + p_long + "?";
        }
    }

    public String answer() {
        if (variant == 5) {
            double delta = 3 * sigma2;
            String ans = notail(m2 - delta) + " < X < " + notail(m2 + delta);
            return "19. " + ans + ".";
        } else {
            p_long /= 2;
            double d = 0.0;
            for (double i = 0.0; i < 10.0; i += 0.01)
                if (p_long < F(i) + 0.001) {
                    d = i * sigma1;
                    break;
                }
            double x1 = notail(m1 - d);
            double x2 = notail(m1 + d);
            return "19. " + x1 + " < X < " + x2;
        }
    }
}

