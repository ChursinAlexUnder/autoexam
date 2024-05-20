public class Task14 extends Task {
    double brak = randomized(0.01, 0.03, 100.0);

    int count = randomize(1, 3) * 100;
    double line = randomized(0.02, 0.05, 100.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "14. Станок - автомат штампует детали. Вероятность того, что деталь окажется бракованной,\n" +
                    " равна " + brak + ". Составить ряд распределения бракованных деталей из " + count + " изготовленных. Найти M(X)\n" +
                    " этой случайной величины.\n";
        } else {
            return "14. Прядильщица обслуживает 1000 веретен. Вероятность\n" +
                    " обрыва нити на одном веретене в течение одной минуты\n" +
                    " равна " + line + ". Составить ряд распределения числа обрывов\n" +
                    " нити в течение одной минуты. Найти M(X) этой случайной\n" +
                    " величины.";
        }
    }

    public String answer() {
        if (variant == 5) {
            return "";
        } else {
            int MX = (int) (1000 * line);
            return "14. MX = " + MX;
        }
    }
}

