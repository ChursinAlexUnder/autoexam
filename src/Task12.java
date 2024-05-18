public class Task12 extends Task {
    int count = randomize(4, 6);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "12. Имеется "+count+" ключей, из которых только один подходит\n" +
                    " к замку. Составить ряд распределения числа подбора\n" +
                    " ключа к замку, если не подошедший ключ в последующих\n" +
                    "опробованиях не участвует. Найти М(Х), D(X), σ(X). ";
        }
    }
}

