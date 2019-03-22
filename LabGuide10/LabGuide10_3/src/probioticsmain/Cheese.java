
package probioticsmain;

import java.util.Scanner;


public class Cheese extends Probiotics {
    private int numOfVitamins;
    private int numOfMinerals;
    private double milkPercentage;
    private double calsium;

    public Cheese() {
        
    }

    public Cheese(String name, String benefits, String risks, String type,
            int numOfVitamins, int numOfMinerals, double milkPercentage) {
        super(name, benefits, risks, type);
        this.numOfVitamins = numOfVitamins;
        this.numOfMinerals = numOfMinerals;
        this.milkPercentage = milkPercentage;
        calsium=0;
    }

    public void findCalsium()
    {
        if(type.equalsIgnoreCase("stager"))
            calsium = 200;
        else{
            if(numOfVitamins>7 && numOfMinerals>10)
                if(milkPercentage > 5)
                    calsium = 182;
                else 
                    calsium = 168;
            else
                calsium = 150;
        }         
    }
    @Override
    public String toString() {
        return "\nCheese Probiotics"+super.toString()+"\nNumber Of Vitamins=" + numOfVitamins + "\nNumber Of Minerals=" 
                + numOfMinerals + "\nMilk Percentage=" + milkPercentage+ "\nCalsium="+calsium;
    }
    
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        super.getInput();
        System.out.println("Enter Number Of Vitamins:");
        numOfVitamins = sc.nextInt();
        System.out.println("Enter Number Of Minerals:");
        numOfMinerals = sc.nextInt();
        System.out.println("Enter Milk Percentage:");
        milkPercentage = sc.nextDouble();
    }  
       
}
