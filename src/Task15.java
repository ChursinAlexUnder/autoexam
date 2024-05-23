public class Task15 extends Task {
    int variant = randomize(5, 6);
    String[][] tableX, tableY;

    Task15() {
        // Из double в String: Double.toString();
        // Из String в double: Double.parseDouble();
        // Из int в String: Integer.toString();
        // Из String в int: Integer.parseInt();
        tableX = new String[2][5];
        tableY = new String[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < 5; j++) {
                if (i == 0) {
                    tableX[i][j] = Integer.toString(randomize(1 + 3 * (j - 2), 3 + 3 * (j - 2)));
                } else {
                    tableX[i][j] = Double.toString(randomized(0.1, 0.6, 10.0));
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < 4; j++) {
                if (i == 0) {
                    tableY[i][j] = Integer.toString(randomize(1 + 2 * (j - 2), 2 + 2 * (j - 2)));
                } else {
                    tableY[i][j] = Double.toString(randomized(0.1, 0.5, 10.0));
                }
            }
        }

        tableX[1][3] = "p";
        tableX[0][0] = tableY[0][0] = "№";
        tableX[1][0] = tableY[1][0] = "15";
        tableX[0][1] = "X";
        tableY[0][1] = "Y";
        tableX[1][1] = tableY[1][1] = "P";
    }

    String[][] getTableX() {
        return tableX;
    }

    String[][] getTableY() {
        return tableY;
    }

    public String fill() {
        if (variant == 5) {
            return "15. Независимые случайные величины X и Y заданы таблицами распределений.\n" +
                    "Найти:\n" +
                    "1) M(X), M(Y), D(X), D(Y);\n" +
                    "2) таблицы распределения случайных величин Z1 = 2X + Y, Z2 = X * Y;\n" +
                    "3) M(Z1), M(Z2), D(Z1), D(Z2) непосредственно по таблицам распределений и на основании свойств математического ожидания и дисперсии.";
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

    public String answer() {
        // а
        int flag2 = 1;
        double tmpmx = 0, aa1 = Double.parseDouble(tableX[0][2]) * Double.parseDouble(tableX[1][2]);
        double cc1 = Double.parseDouble(tableX[0][4]) * Double.parseDouble(tableX[1][4]);
        tmpmx += aa1;
        tmpmx += cc1;
        String mx = notail(tmpmx) + " + " + tableX[0][3] + "p";
        double tmpmx2 = 0;
        tmpmx2 += Math.pow(Double.parseDouble(tableX[0][2]), 2) * Double.parseDouble(tableX[1][2]);
        tmpmx2 += Math.pow(Double.parseDouble(tableX[0][4]), 2) * Double.parseDouble(tableX[1][4]);
        tmpmx2 -= Math.pow(tmpmx, 2);
        double slonik = (Math.pow(Double.parseDouble(tableX[0][3]), 2) - 2 * Double.parseDouble(tableX[0][3]) * aa1 - 2 * Double.parseDouble(tableX[0][3]) * cc1);
        if (slonik < 0) {
            flag2 = -1;
        }
        double sloniktmp = slonik;
        String slonik2 = String.format("%.3f", slonik);
        String dx = notail(tmpmx2) + ((flag2 == 1) ? " + " : " ") + slonik2 + "p - " + notail(Math.pow(Double.parseDouble(tableX[0][3]), 2)) + "p^2";

        double mxy = 0, mxy2 = 0;
        for (int i = 2; i <= 3; i++) {
            mxy += Double.parseDouble(tableY[0][i]) * Double.parseDouble(tableY[1][i]);
            mxy2 += Math.pow(Double.parseDouble(tableY[0][i]), 2) * Double.parseDouble(tableY[1][i]);
        }
        double dxy = notail(mxy2 - Math.pow(mxy, 2));
        mxy = notail(mxy);
        // в
        String mz1 = notail(2 * tmpmx + mxy) + " + " + notail((Double.parseDouble(tableX[0][3]) * 2)) + "p";
        double temp = Double.parseDouble(tableX[0][3]) * mxy;
        String mz2 = notail(tmpmx * mxy) + ((temp >= 0) ? " + " : " ") + notail(temp) + "p";
        double slonik3 = sloniktmp * 4;
        String dz1 = notail(4 * tmpmx2 + dxy) + ((slonik3 >= 0) ? " + " : " ") + String.format("%.3f", notail(slonik3)) + "p - " + notail(Math.pow(Double.parseDouble(tableX[0][3]), 2) * 4) + "p^2";
        double tmpmz2 = 0;
        tmpmz2 += Math.pow(Double.parseDouble(tableX[0][2]), 2) * Double.parseDouble(tableX[1][2]);
        tmpmz2 += Math.pow(Double.parseDouble(tableX[0][4]), 2) * Double.parseDouble(tableX[1][4]);
        tmpmz2 *= mxy2;
        double slonik4 = Math.pow(Double.parseDouble(tableX[0][3]), 2) * mxy2;
        double mxmy_mx2 = 2 * tmpmx * mxy * Double.parseDouble(tableX[0][3]) * mxy;
        double mxmy = Math.pow(tmpmx * mxy, 2);
        double mxp = Math.pow(Double.parseDouble(tableX[0][3]) * mxy, 2);
        String dz2 = notail((tmpmz2 - mxmy)) + (((slonik4 - mxmy_mx2) >= 0) ? " + " : " ") + String.format("%.3f", notail(slonik4 - mxmy_mx2)) + "p - " + notail(mxp) + "p^2";

        return "15. а) M(X) = " + mx + "; D(X) = " + dx + "; M(Y) = " + notail(mxy) + "; D(Y) = " + notail(dxy) + ";\n" +
                "в) M(Z1) = " + mz1 + "; D(Z1) = " + dz1 + "; M(Z2) = " + mz2 + "; D(Z2) = " + dz2 + ".";
    }

    public String[][] answerTableZ1() {
        String[][] ansTable = new String[2][8];
        ansTable[0][0] = "№";
        ansTable[1][0] = "15";
        ansTable[0][1] = "Z1";
        ansTable[1][1] = "P";
        int k = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                ansTable[0][k + 2] = Integer.toString(Integer.parseInt(tableX[0][i + 2]) * 2 + Integer.parseInt(tableY[0][j + 2]));
                k++;
            }
        }
        k = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                if (i == 1) {
                    ansTable[1][k + 2] = Double.parseDouble(tableY[1][j + 2]) + "p";
                } else {
                    ansTable[1][k + 2] = Double.toString(notail(Double.parseDouble(tableX[1][i + 2]) * Double.parseDouble(tableY[1][j + 2])));
                }
                k++;
            }
        }
        return ansTable;
    }
    public String[][] answerTableZ2 () {
        String[][] ansTable = new String[2][8];
        ansTable[0][0] = "№";
        ansTable[1][0] = "15";
        ansTable[0][1] = "Z2";
        ansTable[1][1] = "P";
        int k = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                ansTable[0][k + 2] = Integer.toString(Integer.parseInt(tableX[0][i + 2]) * Integer.parseInt(tableY[0][j + 2]));
                k++;
            }
        }
        k = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                if (i == 1) {
                    ansTable[1][k + 2] = Double.parseDouble(tableY[1][j + 2]) + "p";
                } else {
                    ansTable[1][k + 2] = Double.toString(notail(Double.parseDouble(tableX[1][i + 2]) * Double.parseDouble(tableY[1][j + 2])));
                }
                k++;
            }
        }
        return ansTable;
    }
}