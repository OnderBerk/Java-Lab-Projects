/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide2_aq;

import java.util.Scanner;

public class LabGuide2_AQ {
    public static void main(String[] args) {
        double sales,profit,sum_profit=0.0,reached,sum_sales=0.0;
	int year=1;
	Scanner sc = new Scanner(System.in);
	//getting intial sales from the user
	System.out.println("Enter the sales of the firm:");
	sales = sc.nextDouble();

	//getting profit to be reached
	System.out.println("Enter the profit that is required to be reached :");
	reached = sc.nextDouble();

	System.out.println("\nYEAR	     SALES		 PROFIT\n");
	System.out.println("-----------------------------------------\n");

	//until sum_profit reached the required profit
	while(sum_profit<reached)
	{
		//doing the calculations
		sales = sales - sales*0.04;
		profit = sales * 0.1;
		System.out.printf("%3d %15.2f %19.2f\n",year,sales,profit);
		sum_profit = sum_profit + profit;
		sum_sales = sum_sales + sales;
		year++;
	}
	//displaying the sum
	System.out.printf("-----------------------------------------\n");
	System.out.printf("SUM	%11.2f %19.2f\n",sum_sales,sum_profit);
    }
    
}
