/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide3_2;

import java.util.Scanner;

public class LabGuide3_2 {

    public static void draw_stars()
    {
        int i; //loop counter
		
	for (i = 1; i <= 10; i++)
	{
            System.out.print("*");
	}
	System.out.print("\n");
    }
    
    public static void draw_n_stars(int n)
    {
        
	int i; //loop counter
	for (i = 1; i <= n; i++)
	{
		System.out.print("*");
	}
	System.out.print("\n");
    }
    
    public static void draw_triangle(int n)
    {
        for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= i; j++)
			if (j == 1 || i == j || i == n)
				System.out.print("*");
			else
				System.out.print(" ");
		System.out.print("\n");
	}
    }
    public static void menu()
    {
        System.out.print("MENU\n");
	System.out.print("-----\n");
	System.out.print("1.Draw a line of 10 stars\n");
	System.out.print("2.Draw a line of N stars\n");
	System.out.print("3.Draw a triangle\n");
	System.out.print("4.Exit\n");
    }
    public static void main(String[] args) {
        int choice; //input - menu choice
        Scanner sc = new Scanner(System.in);

	do{
		menu();
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();

		while (choice <1 || choice >4) //validation for choice
		{
			System.out.println("Wrong input!\nEnter your choice again: ");
			choice = sc.nextInt();
		}

		switch (choice)
		{
		case 1:
			draw_stars();
			break;
		case 2:
			int number;
			System.out.println("How many stars? ");
			number = sc.nextInt();
			draw_n_stars(number);
			break;
		case 3:
			int lines;
			System.out.println("How many lines does the triangle have? ");
			lines = sc.nextInt();
			draw_triangle(lines);
		}
	} while (choice != 4);
    }
    
}
