
/**
 * Write a description of class BooleanLogic here.
 *
 * @author Ivan Abedano
 * @version 08/27/21
 */
public class BooleanLogic
{
    public static void main(){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(a);
        System.out.println(a && b); // A and B (Both critera must be true)
        System.out.println(a || b); // A or B (Only one critera needs to be true)
        System.out.println(!a); // Not A (It swaps the boolean value)
        System.out.println(!a && !b); // 
        System.out.println(!(a || b)); // 
        
    }
    public static void main2(){
        boolean a = true;
        boolean b = true;
        boolean c = false;
        System.out.println(a || b &&c);
    }
    public static String betterGradeThis(int percentage){
        if(percentage >= 90){
            return "You get an A";
        } else if (percentage >=80 && percentage < 90){
            return "You get a B";
        } else if (percentage >= 70){
            return "You get a C";
        } else if (percentage >= 60){
            return "You get a D";
        } else {
            return "You fail!";
        }
    }
}
