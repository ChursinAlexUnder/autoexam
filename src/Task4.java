public class Task4 extends Task {
    double first = randomized(0.6, 0.8, 10.0);
    double second = randomized(0.4, 0.6, 10.0);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "4. Два рыбака ловят рыбу на озере. Вероятность поймать\n" +
                    " на удочку карася для первого равна " +first+ ", для второго\n" +
                    " — "+second+". Какова вероятность того, что:\n" +
                    "а) они поймают хотя бы одного карася;\n" +
                    "б) вообще не поймают карасей;\n" +
                    "в) поймает карася только первый рыбак?";
        }
    }

}

