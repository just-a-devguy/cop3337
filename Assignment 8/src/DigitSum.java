// Adler G Luders
// COP 3337
// 31 Mar 2024
// Assignment 8

/**
 * DigitSum
 */
public class DigitSum {
    public static int sumOfDigits(int n) {
        // base
        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int sum = sumOfDigits(1234);

        System.out.println(sum);
    }
}
