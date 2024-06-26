import static java.lang.Math.round;

public class Task5 extends Task {
    double crush = randomized(0.1, 0.9, 10.0);
    double baron = randomized(0.4, 0.6, 10.0);
    double graf = randomized(0.5, 0.7, 10.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "5. При включении в сеть цепи, в которой на первом участке цепи параллельно подключены два\n" +
                    " элемента, на втором участке подключен один элемент, на третьем участке подключены\n" +
                    " параллельно два элемента, каждый элемент выходит из строя с вероятностью " + formatNum(crush) + ". Найти\n" +
                    " вероятность того, что в момент включения цепь не разомкнется.\n";
        } else {
            return "5. Барон вызвал графа на дуэль. В пистолетах у дуэлянтов\n" +
                    " по два патрона. Вероятность попадания в своего противника\n" +
                    " для барона (он и начинает дуэль) равна " + formatNum(baron) + ", для\n" +
                    "графа — " + formatNum(graf) + ". Найти вероятность того, что барон останется\n" +
                    "невредимым, если дуэль продолжается либо до первого\n" +
                    "попадания в кого-либо из противников, либо до тех пор,\n" +
                    "пока не закончатся все патроны.";
        }
    }

    public String answer() {
        if(variant == 5){
            double ans = notail((1 - crush * crush) * (1 - crush) * (1 - crush * crush));
            return "5. " + formatNum(ans) + ".";
        }else {
            double ans = notail(baron * (1 - graf) + baron * (1 - baron) * (1 - graf) * (1 - graf) + (1 - baron) * (1 - baron) * (1 - graf) * (1 - graf));
            return "5. " + formatNum(ans);
        }
    }
}

