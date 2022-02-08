
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    /* 
     * Make an array with the numbers 1-1000
     */
    private int[] arr;
    public void ArrayPractice(){
        arr = new int[1000]; //This actually makes the array
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
    }

    /*
     * Make an array of strings that says "Have a fairly average day" 
     */
    public void ans1(){
        String[] ans;
        ans = new String[5];
        ans[0] = "Have";
        ans[1] = "a";
        ans[2] = "fairly";
        ans[3] = "average";
        ans[4] = "day";
    }
    public void ans2(){
        String[] ans = {"Have", "a", "fairly", "average", "day"};
    }





}
