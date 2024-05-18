public class Task2 extends Task{
    int tickets1 = randomize(4, 7), tickets2 = randomize(3, 5), tickets3 = randomize(2, 4);
    public String fill() {
            if (randomize(5, 6) == 5) {
                return "2. В кассе осталось " + tickets1 + " билетов по 10 рублей, " + tickets2 + " — по 30 рублей и " + tickets3 + " — по 50. Покупатели наугад берут 3 билета. Найти вероятность того, что из этих билетов имеют одинаковую стоимость:\n" +
                        "а) два билета;\n" +
                        "б) хотя бы два билета.\n";
            } else {
                return "popa";
            }
    }
}
