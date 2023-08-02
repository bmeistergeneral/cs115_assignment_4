// *****************************************************************
// BaseConversion.java
//
// Recursively converts an integer from base 10 to another base
// *****************************************************************
import java.util.Scanner;

public class BaseConversion {

    public static void main (String[] args) {
        int base10Num;
        int base;

        Scanner scan = new Scanner(System.in);

        System.out.println ();
        System.out.println ("Base Conversion Program"); System.out.print ("Enter an integer: ");
        base10Num = scan.nextInt();
        System.out.print ("Enter the base: ");
        base = scan.nextInt();

        // Call convert and print the answer
        System.out.println(convert(base10Num, base));
    }

    // This method converts a value from 10 to 15 into strings "a" through "f".
    public static String numsToLetters(int value) throws IllegalArgumentException {
        if (value == 10) {
            return "a";
        } else if (value == 11) {
            return "b";
        } else if (value == 12) {
            return "c";
        } else if (value == 13) {
            return "d";
        } else if (value == 14) {
            return "e";
        } else if (value == 15) {
            return "f";
        } else {
            throw new IllegalArgumentException("Base is greater than 16");
        }
    }


    // -------------------------------------------------
    // Converts a base 10 number to another base.
    // -------------------------------------------------
    public static String convert(int num, int b) {
        int quotient;  // the quotient when num is divided by base b
        int remainder; // the remainder when num is divided by base b
        quotient = num / b;
        remainder = num % b;

        // Code to handle bases above 10.
        String stringRemainder;
        if (remainder > 9) {
            stringRemainder = numsToLetters(remainder);
        } else {
            stringRemainder = "" + remainder;
        }

        if (quotient == 0) {
            return stringRemainder;
        } else {
            return ("" + convert(quotient, b) + stringRemainder);
        }
    }
}