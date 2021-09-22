
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Hand
{
    private int card1;
    private int card2;
    private int total;

    public Hand(){
        card1 = hit();
        card2 = hit();
    }

    public int hit(){
        int num = (int)(Math.random() * 8 + 2);
        total += num;
        return num;
        
    }

}

