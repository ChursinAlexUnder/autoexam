import static java.lang.Math.sqrt;
import static org.apache.poi.sl.draw.geom.GuideIf.Op.sqrt;

public class Task12 extends Task {
    double ver = randomized(0.7, 0.9, 10.0);
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
        if(variant==5){
            return "";
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
            return "12. MX = "+MX+"; DX = "+DX+"; σ(X) = "+sigma;
        }
    }
}

