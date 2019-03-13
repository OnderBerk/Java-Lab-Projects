
package cargomain;

import java.util.Scanner;


public class CargoMain {
    
    public static void display(Cargo c1[])
    {
        for (int i = 0; i < c1.length; i++) {
            System.out.println("****CARGO "+(i+1)+" INFORMATION*****");
            System.out.println("Name: "+ c1[i].getName());
            System.out.println("Website: "+c1[i].getWebsite());
            System.out.println("Phone: "+c1[i].getPhone());
            System.out.println("Number of Branch: "+c1[i].getNumOfBranch());
            System.out.println("Gr: "+c1[i].getGr());
            System.out.println("Price:"+ c1[i].getPrice());  
        }  
    }

    public static void calculatePrice(Cargo c1[])
    {
        for (int i = 0; i < c1.length; i++) {
             if(c1[i].getNumOfBranch() > 20)
                c1[i].setPrice(c1[i].getGr()* 5);
            else
                c1[i].setPrice(c1[i].getGr() * 3.5);
            
        }
           
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n;

        System.out.println("Enter how many cargo info is entered:");
        n = sc.nextInt();
        Cargo [] arr= new Cargo[n];
        for (int i = 0; i < n; i++) {
            Cargo c1 = new Cargo();
            c1.getInput();
            arr[i] = c1;
           
        }
        calculatePrice(arr);
        display(arr);  
    }
    
}
