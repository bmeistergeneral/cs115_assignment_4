// *******************************************************************
//  Fib.java
//
//  A utility class that provide methods to compute elements of the
//  Fibonacci sequence.
// *******************************************************************
public class Fib {
    //------------------------------------------------------------------
    // Recursively computes fib(n)
    //------------------------------------------------------------------
    public static int fib1(int n) {
        // Fill in code -- this should look very much like the
        // mathematical specification
        System.out.println("In fib1" + "(" + n + ")");
        if (n > 1) {
            return fib1(n - 1) + fib1(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return n;
    }

    public static int fib2(int n) {
        int[] fibArray = new int[n];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[fibArray.length - 1];
    }
}
