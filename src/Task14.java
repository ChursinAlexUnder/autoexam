public class Task14 extends Task {
    double brak = randomized(0.01, 0.03, 100.0);
    int count = randomize(1, 3) * 100;
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "14. Станок - автомат штампует детали. Вероятность того, что деталь окажется бракованной,\n" +
                    " равна " + brak + ". Составить ряд распределения бракованных деталей из " + count +" изготовленных. Найти M(X)\n" +
                    " этой случайной величины.\n";
        } else {
            return "";
        }
    }

}

