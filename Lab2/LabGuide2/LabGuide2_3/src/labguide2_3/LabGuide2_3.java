/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide2_3;

import java.util.Scanner;

public class LabGuide2_3 {

    public static final double TAX1 = 1.07;
    public static final double TAX2 = 1.06;
    public static final double TAX3 = 1.04;

    public static void main(String[] args) {
        double	amount=0, rate=0;	//input-amount of the purchase
	String	type;	//input-type of the county

        Scanner sc = new Scanner(System.in);
	//getting the values from the user
	System.out.println("Enter the amount of the purchase: ");
	amount = sc.nextDouble();
	
	do{
		System.out.println("Enter the type of the county: ");
		type = sc.next();
	}while(!type.equalsIgnoreCase("A") && !type.equalsIgnoreCase("B") && !type.equalsIgnoreCase("C") );

	//according to the type of county
	//amount is calculated
	if(type.equalsIgnoreCase("A"))
		rate = TAX1;
        else if(type.equalsIgnoreCase("B"))
		rate = TAX2;
        else if (type.equalsIgnoreCase("C"))
		rate = TAX3;
	

	amount = amount * rate;
	System.out.printf("The amount owed is %.2f\n", amount);
    }
    
}
