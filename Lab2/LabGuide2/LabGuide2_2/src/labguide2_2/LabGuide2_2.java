/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide2_2;

import java.util.Scanner;

public class LabGuide2_2 {

    public static void main(String[] args) {
        int shelf_size, total_book, total_number_stand;
	int one_stand, total_stand, total_need_stand;

        Scanner sc = new Scanner(System.in);
	//get size of the shelf
	System.out.println("Enter the size of a shelf: ");
	shelf_size = sc.nextInt();

	//get total number of books
	System.out.println("Enter total number of books: ");
	total_book = sc.nextInt();

	//get number of bookstands
	System.out.println("Enter total number of bookstands: ");
	total_number_stand = sc.nextInt();

	//calculate the stand size
	one_stand = shelf_size * 3;
	total_stand = one_stand*total_number_stand;
	total_need_stand = total_book - total_stand;


	if (total_book<total_stand)
		System.out.println("Bookstand can be store "+(total_stand - total_book)+" more book");
	else
	{
		if (total_book == total_stand)
			System.out.println("There is/are enough bookstand(s) to store "+total_book+" books \n");
		else
			System.out.printf("There is/are "+((total_need_stand) / one_stand +1)+ " bookstand(s) is/are needed\n");
	}

    }
    
}
