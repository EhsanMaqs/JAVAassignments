public class Calculator {


    public static double sum(double i, double j) {
        return i + j;
    }

    public static double multiply(double i, double j) {
        return i * j;
    }

    public static double divide(double i, double j) {
        if(j == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return i / j;
    }

    public static double subtract(double i, double j) {
        return i - j;
    }
}
