public class Task6 extends Task {
    int allTick = randomize(30, 35), knowTick = randomize(20, 25);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "1. Студент пришел на зачет по математике, зная " + knowTick + " вопросов из " + allTick + ". Если он не может ответить, ему\n" +
                    "предоставляется еще один шанс. Какова вероятность, что он сдаст зачет?\n";
        } else {
            return "";
        }
    }

}

