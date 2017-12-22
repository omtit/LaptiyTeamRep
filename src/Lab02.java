/**
 * Created by Александр on 22.12.2017.
 */
public class Lab02 {
    public static double task4411(double x) {
        return 2 * x;
    }

    public static double task8428(int a) {
        return 0;
    }

    public static double task9020(int x) throws Exception {
        if (x > 61) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return 3 * Math.sqrt(61 - x);
    }

    public static double task7237(double t) throws Exception {
        if (t < -273.15) {
            throw new Exception("Значение T должно быть не ниже абсолютного нуля");
        }
        return t * 1.8 + 32;
    }

}
