
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    /** Find the largest number in the array
     * 
     */
    public int getLargest(){
        int largestSoFar = arr[0];
        for (int i=0; i < arr.length; i++){
            if (arr[i] > largestSoFar){
                largestSoFar = arr[i];
            }
        }
        return largestSoFar;
    }
}
