public class Task10 extends Task {
    int allTest = randomize(4, 6) * 100, kol = randomize(20, 30) * 10, kol1 = randomize(10, 20) * 10, kol2 = randomize(25, 30) * 10;
    double ver = randomized(0.3, 0.6, 10.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "10. В каждом из " + allTest + " независимых испытаний событие А происходит с постоянной вероятностью " + ver + ".\n" +
                    " Найти вероятность того, что событие А наступит:\n" +
                    "а) точно " + kol + " раз;\n" +
                    "б) менее чем " + kol1 + " и более чем " + kol2 + " раз.\n";
        } else {
            return "";
        }
    }

}
