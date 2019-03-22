
package probioticsmain;

import java.util.Scanner;

public class ProbioticsMain {

    public static void display(Probiotics arr[],int index)
    {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i].toString());  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Probiotics arr [] = new Probiotics[10];
        int count=0;
        System.out.println("Which Probiotics do you want to buy (Yogurt/Cheese):? (Y/C)");
        String choice = sc.next();
        
        while(!choice.equalsIgnoreCase("stop"))
        {
            if(choice.equalsIgnoreCase("Y"))
            {
                Yogurt y = new Yogurt();
                y.getInput();
                System.out.println("Enter your kg and height:");
                double kg = sc.nextDouble();
                double height = sc.nextDouble();
                y.dailyNeeds(kg, height);
                arr[count] = y;
                count++;
            }
            else
            {
                Cheese che = new Cheese();
                che.getInput();
                che.findCalsium();
                arr[count] = che;
                count++;
            }
            
            System.out.println("Which Probiotics do you want to buy (Yogurt/Cheese):? (Y/C)");
            choice = sc.next();
        }
        display(arr,count);
    }
    
}
