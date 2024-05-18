public class Task19 extends Task {
    int m = randomize(0,2)*10;
    double sigma = randomized(0.4, 0.6, 10.0);
    double p_long = randomized(0.7, 0.9, 10.0);
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "19. Отклонение длины L изготавливаемых деталей от\n" +
                    "стандарта есть случайная величина, распределенная по\n" +
                    "нормальному закону (m = "+m+", σ = "+sigma+" см). Если стандартная\n" +
                    "длина детали равна 40 см, то в каком диапазоне окажутся\n" +
                    "длины деталей с вероятностью "+p_long+"?";
        }
    }

}

