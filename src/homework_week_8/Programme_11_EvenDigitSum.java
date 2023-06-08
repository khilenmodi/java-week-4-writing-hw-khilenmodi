package homework_week_8;

import java.util.Scanner;

/**
 * Even digit sum
 * Write a method named getEvenDigitsum with one parameter of type int called number.
 * the method should return the sum of the even digits within the number.
 * if the number is negative, the method should return -1 to indicate an invalid value.
 * Example Input/ Output:
 * getEvenDigitSum (123456789); should return 20 since 2+4+6+8=20.
 * getEvenDigitSum (252); should return 4 since 2+2 = 4
 * getEvenDigitSum (-22) should return -1 since the number is negative
 * Note :
 * the method getEvenDigitSum should be defined as public static
 */

public class Programme_11_EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = 0;
        int evenDigitSum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            number = number / 10;
        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int a = scanner.nextInt();
        int result = getEvenDigitSum(a);
        System.out.println("The sum of even digits is : " + result);
        // closing the scanner object
        scanner.close();
    }

}

