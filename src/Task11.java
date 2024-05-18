public class Task11 extends Task {
    int allVeretena = randomize(5, 9) * 100;
    double verObr = randomized(0.002, 0.006, 1000.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "3. Прядильщица обслуживает " + allVeretena + " веретен. Вероятность обрыва нити на одном веретене в течение\n" +
                    " часа равна " + verObr + ". Какова вероятность того, что в течение часа нить оборвется на трех веретенах?\n";
        } else {
            return "";
        }
    }

}

