public class Task3 extends Task {
    public String fill() {
        if (randomize(5, 6) == 5) {
            return  "";
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
}

