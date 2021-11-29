package PACKAGE_NAME;

public class Factorial {

    public static Integer factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
