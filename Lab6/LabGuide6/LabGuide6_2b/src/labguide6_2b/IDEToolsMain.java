
package labguide6_2b;

import java.util.Scanner;

public class IDEToolsMain {

    public static void main(String[] args) {
        int i;
        System.out.println("How many IDE TOOLs do you want to enter:");
        Scanner sc =new Scanner(System.in);
        i = sc.nextInt();

        for (int j = 1; j <= i; j++) {
            System.out.println("Enter "+j+". IDE name:");
            IDETools ide = new IDETools();
            ide.getInput();
            System.out.println(ide);
        
        }
    }
    
}
