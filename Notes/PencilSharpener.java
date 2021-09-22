
/**
 * Write a description of class PencilSharpener here.
 *
 * @author Ivan
 * @version 9.9.21
 */
public class PencilSharpener{

    //Things a pencil sharpener has
    //We call these private instance variables, or fields.
    private String blade;
    private String color;
    private String brand;
    private double weight;
    private int size;
    private boolean broken;

    //Constructors
    public PencilSharpener(String theBlade, String theColor, String theBrand, double lbs, int theSize){
        blade = theBlade;
        color = theColor;
        size = theSize;
        brand = theBrand;
        weight = lbs;
        broken = false;
    }

    public PencilSharpener(){
        blade = "paper";
        color = "Black";
        brand = "NoName";
        weight = 1.7;
        size = 3;
        broken = false;
    }

    public String sharpenPencil(){
        return "You sharpen a pencil";
    }

    public String throwSharpener(){
        if(!broken){
            broken = true;
            return "It's now broken. Good job.";
        }
        return "It's already broken";
    }

    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public String getBlade(){
        return blade;
    }
     public boolean isBroken(){
        return broken;
    }
}
