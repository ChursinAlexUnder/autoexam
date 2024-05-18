public class Task7 extends Task {
    int trader1 = randomize(3, 4) * 10, trader2 = randomize(6, 7) * 10, trader3 = randomize(5, 8) * 10;
    double ver1 = randomized(0.3, 0.5, 10.0), ver2 = randomized(0.5, 0.8, 10.0), ver3 = randomized(0.1, 0.3, 10.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "7. Три торговца сыром продают за день " + trader1 + ", " + trader2 + " и " + trader3 + "% своей продукции, допуская при подсчете\n" +
                    " стоимости товара ошибку с вероятностью " + ver1 + ", " + ver2 + " и " + ver3 + " соответственно. Какова вероятность того,\n" +
                    " что покупатель сыра, выбравший продавца наугад, будет обманут?\n";
        } else {
            return "";
        }
    }

}

