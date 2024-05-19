public class Task7 extends Task {
    int trader1 = randomize(3, 4) * 10, trader2 = randomize(6, 7) * 10, trader3 = randomize(5, 8) * 10;
    double ver1 = randomized(0.3, 0.5, 10.0), ver2 = randomized(0.5, 0.8, 10.0), ver3 = randomized(0.1, 0.3, 10.0);
    double doctor1 = randomized(0.4, 0.6, 10.0);
    double doctor2 = randomized(0.6, 0.8, 10.0);
    double doctor3 = randomized(0.7, 0.8, 10.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "7. Три торговца сыром продают за день " + trader1 + ", " + trader2 + " и " + trader3 + "% своей продукции, допуская при подсчете\n" +
                    " стоимости товара ошибку с вероятностью " + ver1 + ", " + ver2 + " и " + ver3 + " соответственно. Какова вероятность того,\n" +
                    " что покупатель сыра, выбравший продавца наугад, будет обманут?\n";
        } else {
            return "7. В диагностическом центре прием больных ведут три\n" +
                    "невропатолога: Фридман, Гудман и Шеерман, которые ставят\n" +
                    " правильный диагноз с вероятностью " + doctor1 + ", " + doctor2 + " и " + doctor3 + " соотвественно.\n" +
                    " Какова вероятность того, что больному Сидорову\n" +
                    " будет поставлен неверный диагноз, если он выбирает\n" +
                    " врача случайным образом?";
        }
    }

    public String answer() {
        if (variant == 5) {
            return "";
        } else {
            double ans = notail(((double) 1 / 3) * ((1 - doctor1) + (1 - doctor2) + (1 - doctor3)));
            return "7. "+ans;
        }
    }
}

