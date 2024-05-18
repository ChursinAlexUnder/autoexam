public class Task4 extends Task {
    double regi = randomized(0.1, 0.3, 10.0), actr = randomized(0.3, 0.6, 10.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "4. Вероятность опоздания режиссера на репетицию равна " + regi + ", ведущей актрисы театра — " + actr + ". Какова вероятность того, что в среду:\n" +
                    "а) на репетицию опоздают и режиссер, и актриса;\n" +
                    "б) опоздает только актриса;\n" +
                    "в) никто не опоздает?\n";
        } else {
            return "";
        }
    }

}

