public class Task3 extends Task {
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "3. Эксперимент состоит в бросании игральной кости. Пусть событие А — появление нечетного числа очков, В — непоявление 3 очков, С — непоявление 5 очков. Постройте множество элементарных исходов и выявите состав подмножеств, соответствующих событиям:\n" +
                    "а) А ∧ В ∧ С;\n" +
                    "б) А ∨ В;\n" +
                    "в) ¬А ∧ В\n";
        } else {
            return "";
        }
    }
}

