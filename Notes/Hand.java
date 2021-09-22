
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class Hand
{
    Scanner sc= new Scanner(System.in); 
    private int card1;
    private int card2;
    private int total;
    Hand player = new Hand();
    Hand dealer = new Hand();
    public Hand(){
        card1 = hit();

    }

    public int hit(){
        int num = (int)(Math.random() * 8 + 2);
        total += num;
        return num;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        Scanner integer = new Scanner(System.in);
        System.out.println("Another Card?: ");
            while(in.hasNext()) {
            String word = in.next();
            if (word.toLowerCase().equals("hit")){
           
                System.out.println("Your New Card is: " + player.hit());
            } else if (word.toLowerCase().equals("stay")){

            } else {
                System.out.println("Hit or Stay?");
            }
        }
    }
}

