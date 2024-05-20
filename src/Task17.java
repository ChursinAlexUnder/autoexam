public class Task17 extends Task {
    public int variant = randomize(5, 6);

    public String fill() {
        return "17. Дана плотность вероятности f(x) непрерывной случайной\n" +
                "величины X.\n" +
                "Требуется:\n" +
                "1) найти параметр a;\n" +
                "2) найти функцию распределения F(x);\n" +
                "3) найти асимметрию и эксцесс X.";
    }
    public int getVariant() {
        return variant;
    }

    public String answer() {
        if (variant == 5) {
            return "";
        } else {
            return "17. 1) 1/π; 2) F(x) = a * arctg(x) + aπ/2; 3) Ассиметрия = 0, Эксцесс = 8/(aπ) - 3";
        }
    }
}


