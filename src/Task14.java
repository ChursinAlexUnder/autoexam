public class Task14 extends Task {
    double brak = randomized(0.01, 0.03, 100.0);

    int count = randomize(1, 3) * 100;
    double line = randomized(0.02, 0.05, 100.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "14. Станок - автомат штампует детали. Вероятность того, что деталь окажется бракованной,\n" +
                    " равна " + formatNum(brak) + ". Составить ряд распределения бракованных деталей из " + count + " изготовленных. Найти M(X)\n" +
                    " этой случайной величины.\n";
        } else {
            return "14. Прядильщица обслуживает 1000 веретен. Вероятность\n" +
                    " обрыва нити на одном веретене в течение одной минуты\n" +
                    " равна " + formatNum(line) + ". Составить ряд распределения числа обрывов\n" +
                    " нити в течение одной минуты. Найти M(X) этой случайной\n" +
                    " величины.";
        }
    }

    public String answer() {
        if (variant == 5) {
            int mx = (int) (count * brak);
            return "14. M(X) = " + formatNum(mx) + ".";
        } else {
            int MX = (int) (1000 * line);
            return "14. MX = " + formatNum(MX);
        }
    }
    public String[][] answerTable() {
        if (variant == 5) {
            String[][] ansTable = new String[2][7];
            ansTable[0][0] = "№";
            ansTable[1][0] = "14";
            ansTable[0][1] = "X";
            ansTable[1][1] = "P";
            for (int i = 0; i <= 1; i++)
                ansTable[0][i+2] = Integer.toString(i);
            ansTable[0][4] = "...";
            ansTable[1][4] = "...";
            ansTable[0][5] = "n";
            ansTable[1][5] = "(" + (int) (count * brak) + "^n)" + "/n! * e^-" + (int) (count * brak);
            ansTable[0][6] = "...";
            ansTable[1][6] = "...";
            for (int i = 0; i <= 1; i++) {
                ansTable[1][i+2] = "(" + (int) (count * brak) + "^" + i + ")" + "/" + i + "! * e^-" + (int) (count * brak);
            }
            return ansTable;
        } else {
            String[][] ansTable = new String[2][7];
            ansTable[0][0] = "№";
            ansTable[1][0] = "14";
            ansTable[0][1] = "X";
            ansTable[1][1] = "P";
            for (int i = 0; i <= 1; i++)
                ansTable[0][i+2] = Integer.toString(i);
            ansTable[0][4] = "...";
            ansTable[1][4] = "...";
            ansTable[0][5] = "n";
            ansTable[1][5] = "(" + (int) (1000 * line) + "^n)" + "/n! * e^-" + (int) (1000 * line);
            ansTable[0][6] = "...";
            ansTable[1][6] = "...";
            for (int i = 0; i <= 1; i++) {
                ansTable[1][i+2] = "(" + (int) (1000 * line) + "^" + i + ")" + "/" + i + "! * e^-" + (int) (1000 * line);
            }
            return ansTable;
        }
    }
}

