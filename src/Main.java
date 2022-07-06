public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double normalParameters = service.calculate(65.00, 1.75);
        System.out.printf("%.2f", normalParameters);

        System.out.println();
        double unusualParameters = service.calculate(-65.00, -1.75);
        System.out.printf("%.2f", unusualParameters);

        System.out.println();
        double lowWeight = service.calculate(-65.00, 1.75);
        System.out.printf("%.2f", lowWeight);

        System.out.println();
        double shortHeight = service.calculate(-65.00, 1.75);
        System.out.printf("%.2f", shortHeight);
    }
}
