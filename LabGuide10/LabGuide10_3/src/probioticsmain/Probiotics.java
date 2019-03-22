
package probioticsmain;

import java.util.Scanner;

public class Probiotics {
    protected String name;
    protected String benefits;
    protected String risks;
    protected String type;

    public Probiotics() {
    }
    
    public Probiotics(String name, String benefits, String risks, String type) {
        this.name = name;
        this.benefits = benefits;
        this.risks = risks;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nName=" + name + "\nBenefits=" + benefits + "\nRisks=" + risks + "\nType=" + type ;
    }
     
     public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Benefits:");
        benefits = sc.nextLine();
        System.out.println("Enter Risks:");
        risks = sc.nextLine();
        System.out.println("Enter Type:");
        type = sc.nextLine(); 
    }  
    
}
