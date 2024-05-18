public class Task7 extends Task {
    double doctor1 = randomized(0.4, 0.6, 10.0);
    double doctor2 = randomized(0.6, 0.8, 10.0);
    double doctor3 = randomized(0.7, 0.8, 10.0);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "7. В диагностическом центре прием больных ведут три\n" +
                    "невропатолога: Фридман, Гудман и Шеерман, которые ставят\n" +
                    " правильный диагноз с вероятностью "+doctor1+", "+doctor2+" и "+doctor3+" соотвественно.\n" +
                    " Какова вероятность того, что больному Сидорову\n" +
                    " будет поставлен неверный диагноз, если он выбирает\n" +
                    " врача случайным образом?";
        }
    }

}

