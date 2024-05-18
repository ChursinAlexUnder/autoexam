public class Task20 extends Task {
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "20. Для какого значения А функция\n" +
                    "f(x)={0, при x<0; 1/A*exp(-3*Ax), при x>=0}"+
                    "а) плотностью вероятности;\n" +
                    "б) плотностью вероятности экспоненциального закона?";
        }
    }

}
