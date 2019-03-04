/*Differences between println, printf and print*/

package javaapplication1;

public class CTIS221 {

    public static void main(String[] args) {
        
     //initialization of variables 
     int x=31, y=7, z=12;
     double var1=13.2, var2=6.1;
     boolean flag=true;
     String course="welcome to java course";
     char ch='D';
     
     //Print these variables with different ways
        System.out.println("Course name is :"+course);
        System.out.println("Course name is :\n"+course);
        System.out.println("Course name is :\t"+course);
        System.out.printf("The first number is: %d",x);
        System.out.print("\nTotal of integers is "+x+y+z);
        System.out.println("\nAverage of doubles are "+(var1+var2)/2);
        System.out.println("The flag value is: "+flag);
    }
    
}
