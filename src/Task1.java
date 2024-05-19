public class Task1 extends Task {
    int variants = randomize(10, 12);
    int students = randomize(7, 9);
    int count2 = randomize(6, 8);
    int photos1 = randomize(10, 13), photos2 = randomize(5, 7);
    int variant = randomize(5, 6);

    public String fill() {
        if (variant == 5) {
            return "1. В конверте " + photos1 + " фотографий, на двух из которых изображены отец и сын, объявленные в розыск. Следователь извлекает наугад последовательно без возвращения " + photos2 + " фотографий. Найти вероятность того, что:\n" +
                    "а) на первой из извлеченных фотографии будет отец, а на второй — сын;\n" +
                    "б) фотография отца попадется раньше, чем фотография сына.\n";
        } else {
            return "1. " + variants + " вариантов контрольной работы по математике\n" +
                    " распределяются случайным образом среди " + students + "\n" +
                    " студентов, сидящих в одном ряду. Каждый получает по\n" +
                    "одному варианту. Найти вероятность того, что:\n" +
                    "а) варианты 1-й и 2-й достанутся первым двум студентам;\n" +
                    "б) первые " + count2 + " вариантов распределятся последовательно.";
        }
    }

    public String answer() {
        if (variant == 5) {
            // а
            int mA = 1, mB = 1;
            for (int i = 2; i < photos2; i++) {
                mA *= photos1 - i;
            }
            mB = mA;
            int znamA = 1, znamB = 1;
            for (int i = 0; i < (photos1 - photos2); i++) {
                znamA *= photos1 - i;
            }
            znamB = znamA;

            // б
            int sum = 1, factorial = 1;
            for (int i = 2; i < photos2; i++) {
                factorial *= i;
                sum += factorial;
            }
            mB *= sum;

            return "a) " + reduction(mA, znamA);
        } else {
            //a)
            int numerator = 2, numerator2 = 2;
            for (int i = variants - 2; i > variants - students; i--)
                numerator *= i;
            int znam = 1, znam2 = 1;
            for (int i = variants; i > variants - students; i--)
                znam *= i;
            //b)
            for (int i = variants - count2; i > variants - students; i--)
                numerator2 *= i;
            for (int i = variants; i > variants - students; i--)
                znam2 *= i;
            return "1. " + " a) " + reduction(numerator, znam) + " b) " + reduction(numerator2, znam2);
        }
    }
}
