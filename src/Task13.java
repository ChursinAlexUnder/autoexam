public class Task13 extends Task {
    int shoot = randomize(3, 5);
    double ver = randomized(0.2, 0.4, 10.0);
    double signal = randomized(0.6, 0.8,10.0);
    int count = randomize(4, 6);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "13. Составить ряд распределения числа попаданий в цель, если произведено " + shoot + " выстрелов,\n" +
                    " а вероятность попадания при одном выстреле равна " + ver + ". Найти M(X) и D(X) этой случайной\n" +
                    " величины.\n";
        } else {
            return "13. Вероятность приема сигнала равна "+signal+". Сигнал передаётся\n" +
                    count+" раз. Составить ряд распределения числа передач, \n" +
                    " в которых сигнал будет принят. Найти M(X) и D(X)\n" +
                    "этой случайной величины.";
        }
    }
    public String answer() {
        if(variant == 5) {
            double MX = notail(shoot*ver);
            double DX = notail(shoot*ver*(1-ver));
            return "13. Ряд распределения смотреть внизу после ответов. M(X) = " + MX + "; D(X) = " + DX + ".";
        }else {
            double MX = notail(count*signal);
            double DX = notail(count*signal*(1-signal));
            return "13. Ряд распределения смотреть внизу после ответов. MX = "+MX+"; DX = "+DX;
        }
    }
    public String[][] answerTable() {
        if (variant == 5) {
            String[][] ansTable = new String[2][shoot + 3];
            ansTable[0][0] = "№";
            ansTable[1][0] = "13";
            ansTable[0][1] = "X";
            ansTable[1][1] = "P";
            for (int i = 0; i <= shoot; i++)
                ansTable[0][i+2] = Integer.toString(i);
            for (int i = 0; i <= shoot; i++) {
                ansTable[1][i+2] = String.format("%.5f", C(shoot, i) * Math.pow((1 - ver), shoot - i) * Math.pow(ver, i));
            }
            return ansTable;
        } else {
            String[][] ansTable = new String[2][count + 3];
            ansTable[0][0] = "№";
            ansTable[1][0] = "13";
            ansTable[0][1] = "X";
            ansTable[1][1] = "P";
            for (int i = 0; i <= count; i++)
                ansTable[0][i+2] = Integer.toString(i);
            for (int i = 0; i <= count; i++) {
                ansTable[1][i+2] = String.format("%.5f", (notail(C(count, i) * Math.pow((1 - signal), count - i) * Math.pow(signal, i))));
            }
            return ansTable;
        }
    }
}

