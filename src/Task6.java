public class Task6 extends Task {
    int allTick = randomize(30, 35), knowTick = randomize(20, 25);
    int count2 = randomize(7, 10);
    int count1 = randomize(24,28);
    int count3=randomize(3,5);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "6. Студент пришел на зачет по математике, зная " + knowTick + " вопросов из " + allTick + ". Если он не может ответить, ему\n" +
                    "предоставляется еще один шанс. Какова вероятность, что он сдаст зачет?\n";
        } else {
            return "6.  В корзине "+count1+" шаров, среди которых "+count2+" оранжевых.\n" +
                    "Из нее поочередно извлекаются "+count3+" шара. Найти вероятность\n" +
                    "того, что все вынутые шары оранжевые.";
        }
    }
    public String answer() {
        if(variant==5){
            return "";
        }else {
            return "";
        }
    }
}

