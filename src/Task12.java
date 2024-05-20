import static java.lang.Math.sqrt;
import static org.apache.poi.sl.draw.geom.GuideIf.Op.sqrt;

public class Task12 extends Task {
    double ver = randomized(0.6, 0.9, 10.0);
    int count = randomize(4, 6);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return  "12. Производятся последовательные испытания надежности пяти приборов. Каждый\n" +
                    " следующий прибор испытывается только в том случае, если предыдущий оказался надежным.\n" +
                    " Составить ряд распределения числа испытаний приборов, если вероятность выдержать испытание\n" +
                    " для каждого прибора равна " + ver + ". Найти М(Х), D(X), σ (X) \n" +
                    "этой случайной величины.\n";
        } else {
            return "12. Имеется "+count+" ключей, из которых только один подходит\n" +
                    " к замку. Составить ряд распределения числа подбора\n" +
                    " ключа к замку, если не подошедший ключ в последующих\n" +
                    "опробованиях не участвует. Найти М(Х), D(X), σ(X). ";
        }
    }
    public String answer() {
        if(variant == 5){
            String[][] ansTable = answerTable();
            double mx = 0;
            for (int i = 2; i <= 6; i++) {
                mx += Double.parseDouble(ansTable[0][i]) * Double.parseDouble(ansTable[1][i]);
            }
            double mx2 = 0;
            for (int i = 2; i <= 6; i++) {
                mx2 += Math.pow(Double.parseDouble(ansTable[0][i]), 2) * Double.parseDouble(ansTable[1][i]);
            }
            double dx = mx2 - Math.pow(mx, 2);
            double sigmax = Math.sqrt(dx);
            return "12. Ряд распределения смотреть внизу после ответов. M(X) = " + notail(mx) + ", D(X) = " + notail(dx) + ", σ(X) = " + notail(sigmax) + ".";
        }else {
            double MX=0.0;
            double MX_2=0.0;
            for(int i=1;i<=count;i++){
                MX+= (double) 1 /count*i;
                MX_2+= (double) 1 /count*i*i;
            }
            double DX = notail(MX_2 - MX*MX);
            MX = notail(MX);
            double sigma = notail(sqrt(DX));
            return "12. Ряд распределения смотреть внизу после ответов. MX = "+MX+"; DX = "+DX+"; σ(X) = "+sigma;
        }
    }
    public String[][] answerTable() {
        if (variant == 5) {
            String[][] ansTable = new String[2][7];
            ansTable[0][0] = "№";
            ansTable[1][0] = "12";
            ansTable[0][1] = "X";
            ansTable[1][1] = "P";
            for (int i = 1; i <= 5; i++)
                ansTable[0][i+1] = Integer.toString(i);
            for (int i = 0; i <= 4; i++) {
                if (i == 4) {
                    ansTable[1][i+2] = Double.toString(notail(Math.pow(ver, i)));
                } else {
                    ansTable[1][i+2] = Double.toString(notail((1 - ver) * Math.pow(ver, i)));
                }
            }
            return ansTable;
        } else {
            String[][] ansTable = new String[2][2 + count];
            ansTable[0][0] = "№";
            ansTable[1][0] = "12";
            ansTable[0][1] = "X";
            ansTable[1][1] = "P";
            for (int i = 1; i <= count; i++)
                ansTable[0][i+1] = Integer.toString(i);
            double count1 = count;
            for (int i = 0; i <= count - 1; i++) {
                ansTable[1][i+2] = Double.toString(notail((1 / count1)));
            }
            return ansTable;
        }
    }
}

