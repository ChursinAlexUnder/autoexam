public class Task13 extends Task {
    int shoot = randomize(3, 5);
    double ver = randomized(0.2, 0.4, 10.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "13. Составить ряд распределения числа попаданий в цель, если произведено " + shoot + " выстрелов,\n" +
                    " а вероятность попадания при одном выстреле равна " + ver + ". Найти M(X) и D(X) этой случайной\n" +
                    " величины.\n";
        } else {
            return "";
        }
    }

}

