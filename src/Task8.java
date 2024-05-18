public class Task8 extends Task {
    int ken = randomize(2, 4), mur = randomize(4, 7), gor = randomize(6, 8);
    double kenVer = randomized(0.6, 0.8, 10.0), murVer = randomized(0.3, 0.5, 10.0), gorVer = randomized(0.1, 0.3, 10.0);
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "8. В зоопарке живут " + ken + " кенгуру, " + mur + " муравьедов и " + gor + " горилл. Условия содержания\n" +
                    " млекопитающих таковы, что вероятность заболеть у этих животных соответственно равна " + kenVer + ", " + murVer + "\n" +
                    " и " + gorVer + ". Животное, которое удалось поймать врачу, оказалось здоровым. Какова вероятность того, что\n" +
                    " врач осматривал муравьеда?\n";
        } else {
            return "";
        }
    }

}

