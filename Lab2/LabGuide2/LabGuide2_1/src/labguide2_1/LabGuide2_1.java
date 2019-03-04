/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide2_1;

import java.util.Scanner;

public class LabGuide2_1 {

    public static final double ATTEND = 0.25;
    
    public static void main(String[] args) {
       int total_course_hour,//input-total lecture hours
		stu_hour,//input-student hours which the student is absent
		attendance;//howmnay hours the student can make attendance
       double ATTEND = 0.25;
       Scanner sc = new Scanner(System.in);

	//getting inputs from the user
	System.out.println("Please enter the total number of course hours:");
	total_course_hour = sc.nextInt();

	System.out.println("Please enter the hours the student absent:");
	stu_hour = sc.nextInt();

	//calculating attendance hour
	attendance = (int) (total_course_hour * ATTEND);

	//If student fails from the attendance rule
	//the program gives a message
	if (stu_hour >= attendance)
		System.out.println("Student failed the course");
        else
                System.out.println("Student pass the course");

    }
    
}
