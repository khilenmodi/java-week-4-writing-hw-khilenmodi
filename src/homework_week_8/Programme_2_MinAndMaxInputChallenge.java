package homework_week_8;

import java.util.Scanner;

/**
 * read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered
 * before the user enters the number, print the message enter number:
 * if the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 *
 *Hint
 * use an endless while loop.
 * create a class with the name MinAndMaxInputChallenge.
 */

public class Programme_2_MinAndMaxInputChallenge {
    public static void findMinAndMaxNumbers(){
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max =0;
        boolean first = true;
        // while loop
        while (true) {
            System.out.println("Enter Number :");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if (number>max){
                    max = number;
                }
                if (number<min){
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine(); // handle output
        }
        System.out.println("Min = " + min + " , Max =" +max);
        scanner.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
