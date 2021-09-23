
/**
 * Write a description of class BlackJack here.
 *
 * @author Ivan Abedano
 * @version 09.15.21
 */
import java.util.Scanner;
public class BlackJack{  

    public static void NewGame(String[] args){

        Hand player = new Hand();
        Hand dealer = new Hand();
        Scanner integer = new Scanner(System.in);

        Scanner in = new Scanner(System.in);
        System.out.println("Another Card?: ");
        System.out.println("1st Card: " + player.fcard());
        System.out.println("2nd Card: " + player.scard());
        System.out.println("Total is: " + player.ctotal());
        System.out.println("Dealer's Total is: " + dealer.ctotal());
        while(in.hasNext()) {
            String word = in.next();
            if (word.toLowerCase().equals("hit")){

                System.out.println("Your New Card is: " + player.hit());
                System.out.println("You're New total is: "+ player.ctotal());
                System.out.println("Another Card?: ");
            } else if (word.toLowerCase().equals("stay")){
                System.out.println("You're total is: "+ player.ctotal());
                
            }else{
                System.out.println("Hit or Stay?");
                }
            if (player.ctotal()>21){
                System.out.println("You're total is: "+ player.ctotal());                
                System.out.println("Went over 21, you lost"); 
            }
            if (dealer.ctotal()>=17){
                dealer.hit();
            }
        }
    }
}
