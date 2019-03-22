
package probioticsmain;

import java.util.Scanner;

public class Yogurt extends Probiotics{
    private String brand;
    private int numOfbacteria;

    public Yogurt() {
        
    }

    public Yogurt( String name, String benefits, String risks, String type,
            String brand, String ingredients, int numOfbacteria) {
        super(name, benefits, risks, type);
        this.brand = brand;
        this.numOfbacteria = numOfbacteria;
    }

    public void dailyNeeds(double kg,double height)
    {
        double index = kg / (height * height);
        if(index <= 25)
            System.out.println("You need 300 gr yogurt a day");
        else
            System.out.println("You need 400 gr yogurt a day");
            
    }

    @Override
    public String toString() {
        return " \nYogurt Probiotics" + super.toString() + "\nBrand=" + brand + "\nNumber Of Bacteria=" + numOfbacteria ;
    }
    
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        super.getInput();
        System.out.println("Enter Yogurt Brand:");
        brand = sc.nextLine();
        System.out.println("Enter Number Of Bacteria:");
        numOfbacteria = sc.nextInt();   
    }  
}
