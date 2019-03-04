
package labguide3_aq;

import java.util.Scanner;

public class LabGuide3_AQ {

    public static void menu() {
	System.out.print("\nMenu\n************\n1. Draw a triangle \n2. Draw a rhombus \n3.Exit\n ");
    }
    
    public static void drawRhombus() {
	int i, k, m, num = 5;

	for (k = 1; k <= num; k++) //upper part
	{
		for (i = 1; i <= num - k; i++) //blank triangle on the left
			System.out.print(" ");
		System.out.printf("%d", k); //numbers on the left side

		for (i = 1; i <= 2 * k - 3; i++) //blank triangle in the middle
			System.out.print(" ");

		if (k != 1)
			System.out.printf("%d", k); //numbers on the right side

		System.out.print("\n");
	}

	m = num;
	for (k = 1; k <= num - 1; k++) //lower part
	{
		for (i = 2; i <= k + 1; i++)  //blank triangle on the left
			System.out.print(" ");
		System.out.printf("%d", k + num);  //numbers on the left side

		for (i = 1; i <= m; i++) //blank triangle in the middle
			System.out.print(" ");
		m -= 2;
		if (num - 1 != k)
			System.out.printf("%d", k + num); //numbers on the right side
		System.out.printf("\n");
	}
    }
    public static void drawTrangle() {
	int i, j, m, k, num = 5;

	for (i = 1; i <= num; i++)
	{
		//this for loop is to draw the blank triangle at the left
		for (j = 1; j <= num - i; j++)
			System.out.printf(" ");

		//this for loop is for drawing the left side of the number triangle
		for (m = i; m >= 1; m--)
			if (m == i || i == num) //print number for the borders of the triangle
				System.out.printf("%d", m);
			else
				System.out.printf(" "); //printf space for the inside of the triangle

		//this for loop is for drawing the right side of the number triangle
		for (k = 2; k <= i; k++)
			if (k == i || i == num) //print number for the borders of the triangle
				System.out.printf("%d", k);
			else
				System.out.printf(" "); //printf space for the inside of the triangle

		System.out.printf("\n");
	}
    }
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
	do
	{
		menu();
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		while (choice<1 || choice>3)
		{
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
		}

		switch (choice)
		{
		case 1:
			drawTrangle();
			break;
		case 2:
			drawRhombus();
		}

	} while (choice != 3);
    } 
}
