
/**
 * Write a description of class phone here.
 *
 * @author Ivan
 * @version (a version number or a date)
 */
public class Phone
{
    //Things a Phone has:
    private boolean headphoneJack;
    private boolean homeButton;
    private int batteryPercent;
    private int modelType;
    private String brand;
    public Phone(boolean earphoneJack, boolean hasHomeButton, 
    int currentBatteryPercent, int phoneModelType, String brand){
        headphoneJack = earphoneJack;
        homeButton = hasHomeButton;
        batteryPercent = currentBatteryPercent;
        modelType = phoneModelType;
        this.brand = brand;
    }
    public Phone(){
        headphoneJack = true;
        homeButton = true;
        batteryPercent = 96;
        modelType = 8;
        brand = "Apple";
    }
    //Accessor Methods
    public boolean earphoneJack(){
        return headphoneJack;
    }
    public boolean hasHomeButton(){
        return homeButton;
    }
    public int currentBatteryPercent(){
        return batteryPercent;
    }
    public int phoneModelType(){
        return modelType;
    }
    public String brand(){
        return brand;
    }
    //Mutator methods 
    public void newPhoneJack(boolean addHeadphoneJack){
        headphoneJack = addHeadphoneJack;
    }
    public void addHomeButton(){
        if (homeButton){
            homeButton = false;
        } else {
            homeButton = true;
        }
    }
    public void chargePhone(){
        if(batteryPercent < 100){
        System.out.println("Charge your phone");
        }
    }
    public void upgradeModel(){
        if(modelType < 8){
        System.out.println("Upgrade to  new phone, yours is old");
        }
    }
    public void changeCompany(){
        if(brand == "Samsung"){
        System.out.println("Change phone company now!");
        }
    }
    //3 more
        public void newBatteryPerecnt(int howMuchAdded){
        batteryPercent += howMuchAdded;
    }
    public void addNewHeadphoneJack(){
        if (headphoneJack){
            headphoneJack = false;
        } else {
            headphoneJack = true;
        }
    }
    public void newButton(boolean addHomeButton){
        homeButton = addHomeButton;
    }
}