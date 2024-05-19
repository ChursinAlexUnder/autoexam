public class Table extends Task {
    String[][] table;
    Table(int columns, int numberTask, boolean needPar, String sumbol) {
        // Из double в String: Double.toString();
        // Из String в double: Double.parseDouble();
        // Из int в String: Integer.toString();
        // Из String в int: Integer.parseInt();
        table = new String[2][columns];
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < columns; j++) {
                if (i == 0) {
                    table[i][j] = Integer.toString(randomize(1 + 3 * (j - 2), 3 + 3 * (j - 2)));
                } else {
                    table[i][j] = Double.toString(randomized(0.1, 0.6, 10.0));
                }
            }
        }
        table[0][0] = "№";
        table[1][0] =Integer.toString(numberTask);
        table[0][1] = sumbol;
        table[1][1] ="P";
        if (needPar == true) {
            table[1][3] = "p";
        }
    }
    String[][] getTable() {return table;}

}
