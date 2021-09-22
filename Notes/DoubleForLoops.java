
/**
 * Write a description of class DoubleForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleForLoops
{
    public static void main(){
        for (int i = 1; i < 8; i ++){
            for(int j = 0; j < 6 - i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main2(){
        for (int i = 5; i > 0; i --){
            for(int j = 0; j < 6 - i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main3(){
        for (int i = 5; i > 0; i --){
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main4(){
        for (int i = 1; i < 6; i ++){
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
