public class Task4 extends Task {
    double regi = randomized(0.1, 0.3, 10.0), actr = randomized(0.3, 0.6, 10.0);
    double first = randomized(0.6, 0.7, 10.0);
    double second = randomized(0.4, 0.6, 10.0);
    int variant = randomize(5, 6);
    public String fill() {
        if (variant == 5) {
            return  "4. Вероятность опоздания режиссера на репетицию равна " + formatNum(regi) + ", ведущей актрисы театра — " + formatNum(actr) + ". Какова вероятность того, что в среду:\n" +
                    "а) на репетицию опоздают и режиссер, и актриса;\n" +
                    "б) опоздает только актриса;\n" +
                    "в) никто не опоздает?\n";
        } else {
            return "4. Два рыбака ловят рыбу на озере. Вероятность поймать\n" +
                    " на удочку карася для первого равна " + formatNum(first) + ", для второго\n" +
                    " — " + formatNum(second) +". Какова вероятность того, что:\n" +
                    "а) они поймают хотя бы одного карася;\n" +
                    "б) вообще не поймают карасей;\n" +
                    "в) поймает карася только первый рыбак?";
        }
    }
    public String answer() {
        if(variant == 5){
            double answerA = notail(regi * actr), answerB = notail((1 - regi) * actr), answerC = notail((1 - regi) * (1 - actr));
            return "4. а) " + formatNum(answerA) + "; б) " + formatNum(answerB) + " в) " + formatNum(answerC) + ".";
        }else {
            double ansA = notail(first + second - first*second);
            double ansB = notail(1 - ansA);
            double ansC = notail(first*(1-second));
            return "4. a) "+formatNum(ansA)+"; б) "+formatNum(ansB)+"; в) "+formatNum(ansC);
        }
    }
}

