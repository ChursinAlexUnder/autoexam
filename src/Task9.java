public class Task9 extends Task {
    int lights = randomize(4, 7);
    double p = randomized(0.02, 0.05,100.0);
    int count1 = randomize(2,4);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "9. В поезде "+lights+" электрических лампочек. Каждая из\n" +
                    "них перегорает в течение года с вероятностью "+p+". Найти\n" +
                    "вероятность того, что в течение года перегорит не менее\n" +
                    count1+" лампочек.\n";
        }
    }

}

