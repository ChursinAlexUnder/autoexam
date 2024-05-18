public class Task13 extends Task {
    double signal = randomized(0.6, 0.8,10.0);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "13. Вероятность приема сигнала равна "+signal+". Сигнал передаётся\n" +
                    " пять раз. Составить ряд распределения числа передач, \n" +
                    " в которых сигнал будет принят. Найти M(X) и D(X)\n" +
                    "этой случайной величины.";
        }
    }

}

