public class Task9 extends Task {
    double ver = randomized(0.01, 0.05, 100.0);
    int lights = randomize(4, 7);
    double p = randomized(0.02, 0.05,100.0);
    int count1 = randomize(2,4);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "9. Вероятность отказа локомотива на линии за время полного оборота составляет " + ver + ". Найти\n" +
                    " вероятность того, что в восьми поездах произойдет не более двух отказов локомотива на линии.\n";
        } else {
            return "9. В поезде "+lights+" электрических лампочек. Каждая из\n" +
                    "них перегорает в течение года с вероятностью "+p+". Найти\n" +
                    "вероятность того, что в течение года перегорит не менее\n" +
                    count1+" лампочек.\n";
        }
    }
    public String answer() {
        if(variant==5){
            return "";
        }else {
            return "";
        }
    }
}

