public class BmiService {

    public int calculate(double h, int m) {

        double bmiIndex;
        bmiIndex = m / (h * h);

        return (int) bmiIndex;
    }

}
