public class Task13 extends Task {
    int shoot = randomize(3, 5);
    double ver = randomized(0.2, 0.4, 10.0);
    double signal = randomized(0.6, 0.8,10.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "13. Составить ряд распределения числа попаданий в цель, если произведено " + shoot + " выстрелов,\n" +
                    " а вероятность попадания при одном выстреле равна " + ver + ". Найти M(X) и D(X) этой случайной\n" +
                    " величины.\n";
        } else {
            return "13. Вероятность приема сигнала равна "+signal+". Сигнал передаётся\n" +
                    " пять раз. Составить ряд распределения числа передач, \n" +
                    " в которых сигнал будет принят. Найти M(X) и D(X)\n" +
                    "этой случайной величины.";
        }
    }
    public String answer() {
        if(variant==5){
            return "";
        }else {
            return "";
        }
    }
}

