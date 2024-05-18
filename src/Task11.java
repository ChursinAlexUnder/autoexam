public class Task11 extends Task {
    int percent = randomize(2, 4);
    int count = randomize(2, 5);

    public String fill() {
        if (randomize(5, 6) == 5) {
            return "";
        } else {
            return "11. Некачественные сверла составляют " + percent + "% всей продукции\n" +
                    " фабрики. Изготовленные сверла упаковываются в\n" +
                    "ящики по 100 штук. Какова вероятность того, что в ящике\n" +
                    " окажется не более " + count + " некачественных сверл?";
        }
    }
}

