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
            return "17. 1) 2/3; 2) F(x) = {0, при x < 1; (x^2 - 1)/3, при 1 ⩽ x ⩽ 2; 1, при x > 2}; 3) Ассиметрия: -0,01, эксцесс: 1,5.";
        } else {
            return "17. 1) 1/π; 2) F(x) = a * arctg(x) + aπ/2; 3) Ассиметрия = 0, Эксцесс = 8/(aπ) - 3";
        }
    }
}


