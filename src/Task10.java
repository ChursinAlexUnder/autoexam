public class Task10 extends Task {
    double boy = randomized(0.510, 0.535,1000.0);
    int[] array = {60,70,80,90};
    int count = array[randomize(0,3)];
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "10. Вероятность рождения мальчика равна "+boy+". Чему\n" +
                    "равна вероятность того, что среди "+count+" новорожденных:\n" +
                    "а) мальчиков ровно половина;\n" +
                    "б) не менее половины мальчиков?";
        }
    }

}
