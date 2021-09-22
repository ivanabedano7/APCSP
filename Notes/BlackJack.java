
/**
 * Write a description of class BlackJack here.
 *
 * @author Ivan Abedano
 * @version 09.15.21
 */
import java.util.Scanner;
public class BlackJack
{
    public static void NewGame(String[] args){
        Hand player = new Hand();
        Hand dealer = new Hand();
        Scanner integer = new Scanner(System.in);
        

        
        Scanner in = new Scanner(System.in);
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
