public class BmiService {
    public int calculate(int cm, int kg) {
        int bmi;
        bmi = (int) (kg * 10000 /(Math.pow(cm, 2)));
        return bmi;
    }
}
