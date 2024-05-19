public class Task2 extends Task{
    int tickets1 = randomize(3, 12), tickets2 = randomize(3, 12);
    int firstleague = randomize(4, 7);
    int count = randomize(1, 3);
    int variant = randomize(5, 6);
    public String fill() {
            if (variant == 5) {
                return "2. В кассе осталось " + tickets1 + " билетов по 10 рублей, " + tickets2 + " — по 30 рублей и 2 — по 50. Покупатели наугад берут 3 билета. Найти вероятность того, что из этих билетов имеют одинаковую стоимость:\n" +
                        "а) два билета;\n" +
                        "б) хотя бы два билета.\n";
            } else {
                return "2. В розыгрыше кубка по футболу участвуют команд,\n" +
                        " среди которых " +firstleague+ " команд первой лиги. Все команды\n" +
                        "по жребию делятся на две группы по 8 команд. Найти вероятность\n" +
                        " того, что:\n а) все команды первой лиги попадут в одну группу;\n" +
                        "б) в одну группу попадут хотя бы "+count+"  команды первой\n" +
                        "лиги.";
            }
    }

    public String answer() {
        if (variant == 5) {
            return "2. а) 2/3; б) 8/9.";
        } else {
            return "";
        }
    }
}
