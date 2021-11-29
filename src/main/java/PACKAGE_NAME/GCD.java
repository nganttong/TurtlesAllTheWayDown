package PACKAGE_NAME;

public class GCD {

    public static Integer gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static Integer gcd2 (int a, int b) {
        while (b != 0) {
            int holder = b;
            b = a % b;
            a = holder;
        }
        return a;
    }
}
