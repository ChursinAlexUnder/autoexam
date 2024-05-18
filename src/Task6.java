public class Task6 extends Task {
    int count2 = randomize(7, 10);
    int count1 = randomize(24,28);
    int count3=randomize(3,5);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "6.  В корзине "+count1+" шаров, среди которых "+count2+" оранжевых.\n" +
                    "Из нее поочередно извлекаются "+count3+" шара. Найти вероятность\n" +
                    "того, что все вынутые шары оранжевые.";
        }
    }
}

