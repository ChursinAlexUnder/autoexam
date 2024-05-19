public class Task2 extends Task {
    int tickets1 = randomize(4, 7), tickets2 = randomize(3, 5), tickets3 = randomize(2, 4);
    int firstleague = randomize(4, 7);
    int count = randomize(1, 3);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "2. В кассе осталось " + tickets1 + " билетов по 10 рублей, " + tickets2 + " — по 30 рублей и " + tickets3 + " — по 50. Покупатели наугад берут 3 билета. Найти вероятность того, что из этих билетов имеют одинаковую стоимость:\n" +
                    "а) два билета;\n" +
                    "б) хотя бы два билета.\n";
        } else {
            return "2. В розыгрыше кубка по футболу участвуют 16 команд,\n" +
                    " среди которых " + firstleague + " команд первой лиги. Все команды\n" +
                    "по жребию делятся на две группы по 8 команд. Найти вероятность\n" +
                    " того, что:\n а) все команды первой лиги попадут в одну группу;\n" +
                    "б) в одну группу попадут хотя бы " + count + "  команды первой\n" +
                    "лиги.";
        }
    }

    public String answer() {
        if (variant == 5) {
            return "";
        } else {
            int k = 8 - firstleague;
            int n = 16 - firstleague;
            String b = "";
            for (int i = count; i <= firstleague; i++) {
                int s = 8 - i;
                if (firstleague > i)
                    b += "C(" + firstleague + ", " + i + ")C(" + n + ", " + s + ") + ";
                else b += "C(" + firstleague + ", " + i + ")C(" + n + ", " + s + ")";
            }
            b += "/C(16, 8)";
            return "2. a) (C(" + n + ", " + k + ") + C(" + n + ", 8)/C(16, 8)); б) " + b;
        }
    }
}
