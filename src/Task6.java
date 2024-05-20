public class Task6 extends Task {
    int allTick = randomize(30, 35), knowTick = randomize(20, 25);
    int count2 = randomize(7, 10);
    int count1 = randomize(24, 28);
    int count3 = randomize(2, 4);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "6. Студент пришел на зачет по математике, зная " + knowTick + " вопросов из " + allTick + ". Если он не может ответить, ему\n" +
                    "предоставляется еще один шанс. Какова вероятность, что он сдаст зачет?\n";
        } else {
            return "6.  В корзине " + count1 + " шаров, среди которых " + count2 + " оранжевых.\n" +
                    "Из нее поочередно извлекаются " + count3 + " шара. Найти вероятность\n" +
                    "того, что все вынутые шары оранжевые.";
        }
    }

    public String answer() {
        if(variant == 5){
            double knowTick1 = knowTick, allTick1 = allTick;
            double ans1 = notail(knowTick1 / allTick1);
            double ans2 = notail(((allTick1 - knowTick1) / allTick1) * (knowTick1 / (allTick1 - 1)));
            double ans = notail(ans1 + ans2);
            return "6. " + ans + ".";
        }else {
            int numerator = 1;
            for (int i = count2; i > count2 - count3; i--)
                numerator *= i;
            int znam = 1;
            for (int i = count1; i > count1 - count3; i--)
                znam *= i;
            double ans = notail((double) numerator / znam);
            String str_ans = String.format("%.6f", ans);
            return "6. " + str_ans;
        }
    }
}

