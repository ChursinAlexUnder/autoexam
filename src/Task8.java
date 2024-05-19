public class Task8 extends Task {
    int ken = randomize(2, 4), mur = randomize(4, 7), gor = randomize(6, 8);
    double kenVer = randomized(0.6, 0.8, 10.0), murVer = randomized(0.3, 0.5, 10.0), gorVer = randomized(0.1, 0.3, 10.0);
    int musicans = randomize(5,7);
    int writers = randomize(9, 12);
    int scientist =randomize(4, 6);
    double p_m = randomized(0.4, 0.6,10.0);
    double p_w = randomized(0.6, 0.9, 10.0);
    double p_s = randomized(0.5, 0.6,10.0);
    int count = randomize(2, 5);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "8. В зоопарке живут " + ken + " кенгуру, " + mur + " муравьедов и " + gor + " горилл. Условия содержания\n" +
                    " млекопитающих таковы, что вероятность заболеть у этих животных соответственно равна " + kenVer + ", " + murVer + "\n" +
                    " и " + gorVer + ". Животное, которое удалось поймать врачу, оказалось здоровым. Какова вероятность того, что\n" +
                    " врач осматривал муравьеда?\n";
        } else {
            return "8. Учитель литературы предложил викторину по распознаванию\n" +
                    " портретов великих людей. Школьникам были\n" +
                    "показаны репродукции картин Ильи Репина: " + musicans + " портретов\n" +
                    " русских музыкантов (Глинки, Мусоргского, Бородина\n" +
                    ", Глазунова, Лядова, Римского, Корсакова), " + writers + "\n" +
                    "портретов русских писателей (Гоголя, Тургенева, Льва\n" +
                    "Толстого, Писемского, Гаршина, Фета, Стасова, Горького\n" +
                    ", Леонида Андреева, Короленко) и " + scientist + " портретов русских\n" +
                    " ученых (Сеченова, Менделеева, Павлова, Тарханова,\n" +
                    "Бехтерева). Подготовка учеников такова, что портреты\n" +
                    "музыкантов они узнают с вероятностью " + p_m + ", писателей —\n" +p_w
                    + ", ученых — "+p_s+". Школьница Даша правильно распознала\n" +
                    " портрет, выбранный наугад. Какова вероятность того,\n" +
                    "что ей попался портрет музыканта?";
        }
    }
    public String answer() {
        if(variant == 5){
            double ken1 = ken, mur1 = mur, gor1 = gor;
            double znam = ken1 + mur1 + gor1;
            double ans1 = (ken1 / znam) * (1 - kenVer) + (mur1 / znam) * (1 - murVer) + (gor1 / znam) * (1 - gorVer);
            double ans = notail(((mur1 / znam) * (1 - murVer)) / ans1);
            return "8. " + ans + '.';
        }else {
            return "";
        }
    }
}

