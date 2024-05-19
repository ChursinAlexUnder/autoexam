public class Task3 extends Task {
    int variant = randomize(5, 6);
    public String fill() {
        if (variant == 5) {
            return  "3. Эксперимент состоит в бросании игральной кости. Пусть событие А — появление нечетного числа очков, В — непоявление 3 очков, С — непоявление 5 очков. Постройте множество элементарных исходов и выявите состав подмножеств, соответствующих событиям:\n" +
                    "а) А ∧ В ∧ С;\n" +
                    "б) А ∨ В;\n" +
                    "в) ¬А ∧ В\n";
        } else {
            return "3. Электронная схема содержит три транзистора, четыре\n" +
                    " конденсатора и пять резисторов. Событие Tk — выход из\n" +
                    "строя k-го транзистора (k = 1, 2, 3), событие Сi — выход из\n" +
                    "строя i-го конденсатора (i = 1, 2, 3, 4), Rj — выход из строя\n" +
                    "j-го резистора (j = 1, 2, 3, 4, 5). Электронная схема считается\n" +
                    " исправной, если одновременно исправны все транзисторы\n" +
                    " не менее двух конденсаторов и хотя бы один резистор.\n" +
                    "Записать в алгебре событий событие А: схема исправна.";
        }
    }
    public String answer() {
        if(variant==5){
            return "";
        }else {
            return "3. A=(T1 ∧ T2 ∧ T3) ∧ (D1 ∧ D2 ∧ D3 ∧ D4) ∧ (R1 ∨ R2 ∨ R3 ∨ R4 ∨ R5)";
        }
    }
}

