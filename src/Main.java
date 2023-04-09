public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87;
        int m = 98;
        int bmiIndex = service.calculate(h, m); //

        System.out.println("Индекс массы тела (BMI): ");
        System.out.println(bmiIndex);
    }
}
