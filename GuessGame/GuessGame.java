import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class guessgame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuessGame
{
    /*GuessGame Requirements
     * Computer generates a random number from 1 to 50
     * You get 15 tries to guess the number.
     * After each guess, the computer will tell you to guess higher or lower.
     * The program ends when guesses have run out or if you guessed correctly.
     * 
     */

    public static void n1to50(){
        Scanner integer = new Scanner(System.in);
        int num = (int)(Math.random() * 50 + 1);
        System.out.println("Guess The Number: ");
        int number= integer.nextInt();
        int a = 0;
        System.out.println("The Number is "+ num);
        while (a < 14){
            if (num == number){
                System.out.println("Correct!");
                System.out.print(" tries");
                a = 14;
            } else if (num > number){
                System.out.println("Higher");
                System.out.println("Try again");
                System.out.println("Guess The Number: ");
                number= integer.nextInt();
                a += 1;
            } else if(num < number){
                System.out.println("Lower");
                System.out.println("Try again");
                System.out.println("Guess The Number: ");
                number= integer.nextInt();
                a += 1;
            }
            if (a > 13){
                System.out.println("You lost the correct answer was " + num);
            }
        }
        a = 14;
    }

}