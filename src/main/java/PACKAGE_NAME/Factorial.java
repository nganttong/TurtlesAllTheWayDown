package PACKAGE_NAME;

public class Factorial {

    public static Long factorial (int n) {
        if (n == 0) {
            return 1l;
        }
        return n * factorial(n - 1);
    }
}
