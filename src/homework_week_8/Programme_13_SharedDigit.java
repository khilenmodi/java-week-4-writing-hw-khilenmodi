package homework_week_8;

/**
 * write a method named hasSharedDigit with two parameters of type int.
 * Each numbr should be within the range of 10 (inclusive) - 99 (inclusive). if one of the number is not
 * within the range, method should return false.
 * the method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * Example Input / output :
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE:
 * The method hasSharedDigit should be defined as public static
 */

public class Programme_13_SharedDigit {

    public static boolean hasSharedDigit ( int firstNumber, int secondNumber){
        if ((firstNumber >= 10 && firstNumber<=99) && (secondNumber>=10 && secondNumber<=99)){
            int firstNumberLastDigit = firstNumber%10;
            int secondNumberLastDigit = secondNumber%10;
            firstNumber/=10;
            secondNumber/=10;
            int firstNumberFirstDigit = firstNumber;
            int secondNumberFirstDigit = secondNumber;
            return  ((firstNumberFirstDigit == secondNumberFirstDigit) ||
                    (firstNumberFirstDigit == secondNumberLastDigit) ||
                    (firstNumberLastDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberLastDigit));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
