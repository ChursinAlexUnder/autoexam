public class Task15 extends Task {
    public String fill() {
        if (randomize(5,6) == 5) {
            return  "";
        } else {
            return "15. Независимые случайные величины X и Y заданы таблицами\n" +
                    " распределений.\n" +
                    "Найти:\n" +
                    "1) M(X), M(Y), D(X), D(Y);\n" +
                    "2) таблицы распределения случайных величин Z1 = 2x+Y\n" +
                    ", Z2 = X * Y;\n" +
                    "3) M(Z1), M(Z2), D(Z1), D(Z2) непосредственно по таблицами\n" +
                    " распределений и на основании свойств математического\n" +
                    " ожидания и дисперсии";
        }
    }

}

