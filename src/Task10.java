public class Task10 extends Task {
    int allTest = randomize(4, 6) * 100, kol = randomize(20, 30) * 10, kol1 = randomize(10, 20) * 10, kol2 = randomize(25, 30) * 10;
    double ver = randomized(0.3, 0.6, 10.0);
    double boy = randomized(0.510, 0.535, 1000.0);
    int[] array = {60,70,80,90};
    int count = array[randomize(0,3)];
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "10. В каждом из " + allTest + " независимых испытаний событие А происходит с постоянной вероятностью " + ver + ".\n" +
                    " Найти вероятность того, что событие А наступит:\n" +
                    "а) точно " + kol + " раз;\n" +
                    "б) менее чем " + kol1 + " и более чем " + kol2 + " раз.\n";
        } else {
            return "10. Вероятность рождения мальчика равна "+boy+". Чему\n" +
                    "равна вероятность того, что среди "+count+" новорожденных:\n" +
                    "а) мальчиков ровно половина;\n" +
                    "б) не менее половины мальчиков?";
        }
    }

}
