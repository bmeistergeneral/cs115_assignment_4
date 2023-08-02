// ******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// ******************************************************************
import java.util.Scanner;
public class DigitPlay {

    public static void main (String[] args) {
        int num;   // a number
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println();
        System.out.print("Please enter a positive integer: ");
        num = scan.nextInt();

        if (num <= 0)
            System.out.println( num + " isn't positive -- start over!!");
        else {
            // Call numDigits to find the number of digits in the number
            // Print the number returned from numDigits

            System.out.println("\nThe number " + num + " contains " + numDigits(num) + " digits.");
            System.out.println();
            System.out.println("\nThe sum of the digits of the number " + num + " is " + sumDigits(num));
            System.out.println("Please input an identification number: ");
            int id = scan2.nextInt();
            System.out.println("The sum of the digits in this id is: " + sumDigits(id));
            if (sumDigits(id) % 7 == 0) {
                System.out.println("ok");
            } else {
                System.out.println("error");
            }
        }
    }
    // -----------------------------------------------------------
    // Recursively counts the digits in a positive integer
    // -----------------------------------------------------------
    public static int numDigits (int num) {
        if (num < 10) {
            return (1);
        } else {
            return (1 + numDigits(num / 10));
        }
    }
    public static int sumDigits (int num) {
        if (num < 10) {
            return num;
        } else {
            return (num % 10) + sumDigits(num / 10);
        }
    }
}
