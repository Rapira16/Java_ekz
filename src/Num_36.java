public class Num_36 {
    public static void main(String[] args) {
        double angleInDegrees = 45.0;
        double angleInRadians = Math.toRadians(angleInDegrees); // Преобразование градусов в радианы

        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);

        System.out.println("Sin(45°): " + sinValue);
        System.out.println("Cos(45°): " + cosValue);
        System.out.println("Tan(45°): " + tanValue);

        double base = 2.0;
        double exponent = 3.0;

        double powerValue = Math.pow(base, exponent); // 2^3
        double expValue = Math.exp(1); // e^1
        double logValue = Math.log(10); // Натуральный логарифм 10

        System.out.println("2^3: " + powerValue);
        System.out.println("e^1: " + expValue);
        System.out.println("ln(10): " + logValue);
    }
}
