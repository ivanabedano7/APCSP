
/**
 * Write a description of class taxcal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class taxcal{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Gross Income?");
        double grossIncome = scanner.nextDouble();
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Number of dependents you have?");
        int numofDependents = scanner.nextInt();
        System.out.println("Number of Dependents: " + numofDependents);
        double taxableIncome = grossIncome - 10000 - 2000 * numofDependents;
        double incomeTax = taxableIncome * 0.20;
        System.out.println("Income Tax is: " + incomeTax);
        
    }
    public static void main2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature in Fahrenheit?");
        double tempinF = scanner.nextDouble();
        System.out.println("Temperature is" + tempinF);
        
        
        
    }
}

