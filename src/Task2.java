public class Task2 extends Task{
    int firstleague = randomize(4, 7);
    int count = randomize(1, 3);
    public String fill() {
            if (randomize(5,6) == 5) {
                return "rol";
            } else {
                return "2. В розыгрыше кубка по футболу участвуют команд,\n" +
                        " среди которых " +firstleague+ " команд первой лиги. Все команды\n" +
                        "по жребию делятся на две группы по 8 команд. Найти вероятность\n" +
                        " того, что:\n а) все команды первой лиги попадут в одну группу;\n" +
                        "б) в одну группу попадут хотя бы "+count+"  команды первой\n" +
                        "лиги.";
            }
    }
}
