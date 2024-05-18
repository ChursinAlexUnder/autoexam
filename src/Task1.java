import java.util.Random;
public class Task1 extends Task {
    int variants = randomize(10,12);
    int students = randomize(7,9);
    int count1 = randomize(2,4);
    int count2=randomize(6, 8);
    public String fill() {
            if (randomize(5, 6) == 5) {
                return  "123";
            } else {
                return variants + " вариантов контрольной работы по матема\n" +
                        "тике распределяются случайным образом среди "+students+"\n" +
                        "студентов, сидящих в одном ряду. Каждый получает по\n" +
                        "одному варианту. Найти вероятность того, что:\n" +
                        "а) варианты 1'й и 2'й достанутся первым"+count1+" сту\n" +
                        "дентам;\n" +
                        "б) первые"+count2+" вариантов распределятся последовательно.";
            }
    }

}
