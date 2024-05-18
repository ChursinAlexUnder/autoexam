public class Task9 extends Task {
    double ver = randomized(0.01, 0.05, 100.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "9. Вероятность отказа локомотива на линии за время полного оборота составляет " + ver + ". Найти\n" +
                    " вероятность того, что в восьми поездах произойдет не более двух отказов локомотива на линии.\n";
        } else {
            return "";
        }
    }

}

