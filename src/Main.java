public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(187,98);
        System.out.println("Ваш BMI индекс " + index);
    }
}