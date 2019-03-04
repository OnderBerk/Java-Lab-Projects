/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide3_1;

import java.util.Scanner;

public class LabGuide3_1 {

     
    public static char menu()
    {
        Scanner sc = new Scanner(System.in);
        char choice;

	System.out.println("\t\tMENU\n**************************************\n");
	System.out.println("A. Add fractional parts of two numbers\n");
	System.out.println("B. Convert a double number to decimal\n");
	System.out.println("C. QUIT\n");
	
	do{
		System.out.println("Enter your choice: ");
		choice = sc.next().charAt(0); 
	}while(!(choice >= 'A' && choice <= 'C'));

	return (choice);
    }
    
    public static double fracPart(double number)
    {
        int	intPart;
	intPart = (int) number;	
	return (number - intPart);
    }
    
    public static int roundNum(double number)
    {
        if (fracPart(number) >= 0.5)
		return (int) (number + 1);

	return (int) (number);
    }
    public static void main(String[] args) {
        char    choice;
	int	intPart;
	double	num1, num2, frac1, frac2, sum, multiply;

        Scanner sc = new Scanner(System.in);
	choice = menu();
	
	while(choice != 'C')
	{
		switch(choice)
		{
		case 'A':
			System.out.println("Enter two double numbers: ");
			num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
			frac1 = fracPart(num1);
			frac2 = fracPart(num2);
			sum = frac1 + frac2;
			System.out.printf("%.4f + %.4f = %.4f\n\n", frac1, frac2, sum);
			break;
		case 'B':
			System.out.println("Enter a double number: ");
			num1 = sc.nextDouble();

			System.out.printf("The number %.4f converted to the decimal number %d\n\n", num1, roundNum(num1));
			break;
		}
		choice = menu();
	}
    }
    
}
