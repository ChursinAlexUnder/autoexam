public class Task21 extends Task {
    int sigma = randomize(1, 2)*10;
    int mat = randomize(9, 11)*10;
    int vagon = randomize(8, 10)*10;
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "21. Число вагонов в прибывающем на расформирование\n" +
                    "составе является случайной величиной, распределенной\n" +
                    "по нормальному закону с параметрами σ = "+sigma+", m = "+mat+".\n" +
                    "Определить вероятность того, что в составе будет не более\n" +vagon+" вагонов";
        }
    }

}
