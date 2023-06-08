package homework_week_8;

import java.util.Scanner;

/**
 * write a java program that takes the user to provide a single character from the alphabets
 * print vowel of consonant, depending on the user inpiut. if the user input is not a letter
 * (between a and z or A and Z), or is a string of length >1,
 * print an error message.
 * for e.g.
 * Input an alphabet: p
 * Expected Output:
 * Input letter is consonant
 */

public class Programme_3_FindVowelOrConsonant
{
    public static void checkVowelOrConsonant(String letter)
    {
        // check length of string
        // if user enters more than 1 character an error message is printed
        if (letter.length()>1)
        {
            System.out.println("Error. Not a Single character");
            // if user enter a symbol
        }
        else if (!(isItALetter(letter)))
        {
            System.out.println("Error. not a letter. EnterUppercase or Lowercase Letter");

        }
        else if (letter.equals("a") || letter.equals("e") || letter.equals("i")
        || letter.equals("o") || letter.equals("u"))
        {
            System.out.println("Input letter is a Vowel");
        }
        else
        {
            System.out.println("Input Letter is A Constant");
        }
    }

    // this method will check is it a letter or not ?
    public static boolean isItALetter(String l)
    {
        return l.charAt(0) >96 && l.charAt(0)<123;
    }

    public static void main(String[] args)
    {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character :");
        String str= scanner.next().toLowerCase();
        // calling static method directly
        checkVowelOrConsonant(str);
        // closing the scanner object
        scanner.close();
    }
}

