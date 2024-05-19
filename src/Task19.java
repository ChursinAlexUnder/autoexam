public class Task19 extends Task {
    int m1 = randomize(0,2)*10;
    double sigma1 = randomized(0.4, 0.6, 10.0);
    double p_long = randomized(0.7, 0.9, 10.0);
    int m2 = randomize(3, 15);
    double sigma2 = randomized(0.1, 0.5, 10.0);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "19. Станок-автомат изготавливает валики, контролируя их диаметр X. Считая, что X распределено\n" +
                    " нормально (m = " + m2 + " мм, σ = " + sigma2 + " мм), найти интервал, в котором с вероятностью 0,9973 будут\n" +
                    " заключены диаметры изготавливаемых валиков.\n";
        } else {
            return "19. Отклонение длины L изготавливаемых деталей от\n" +
                    "стандарта есть случайная величина, распределенная по\n" +
                    "нормальному закону (m = "+m1+", σ = "+sigma1+" см). Если стандартная\n" +
                    "длина детали равна 40 см, то в каком диапазоне окажутся\n" +
                    "длины деталей с вероятностью "+p_long+"?";
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

