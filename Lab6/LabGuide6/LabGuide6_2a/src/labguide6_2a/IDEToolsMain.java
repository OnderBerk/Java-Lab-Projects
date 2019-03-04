
package labguide6_2a;

import java.util.Scanner;

public class IDEToolsMain {

    public static void main(String[] args) {
        int i;
        String name,support,draw;
        double version;
        System.out.println("How many IDE TOOLs do you want to enter:");
        Scanner sc =new Scanner(System.in);
        i = sc.nextInt();

        for (int j = 0; j < i; j++) {
      
            System.out.printf("\nEnter %d. IDE name:\n",(j+1));
            name = sc.next();
            System.out.println("Enter version:");
            version = sc.nextDouble();
            System.out.println("Enter Supported Languages:");
            sc.skip("\n");
            support = sc.nextLine();
            System.out.println("Enter Drawbacks:");
            draw = sc.nextLine();
            
            IDETools ide = new IDETools(name, version, support, draw);
            System.out.println(ide);
        }   
    } 
}
