
package cargomain;

import java.util.Scanner;

public class Cargo {
    private String name;
    private String website;
    private String phone;
    private int numOfBranch;
    private static int totalnumOfCargoBranch=0;

    public Cargo() {
       this("null","null","null", 0);
    }

    
    public Cargo(String name, String website, String phone, int numOfBranch) {
        this.name = name;
        this.website = website;
        this.phone = phone;
        this.numOfBranch = numOfBranch;
        totalnumOfCargoBranch += numOfBranch;
    }

    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cargo Name:");
        name = sc.nextLine();
        System.out.println("Enter Website:");
        website = sc.next();
        System.out.println("Enter Phone: ");
        phone = sc.next();
        System.out.println("Enter Number of Branch:");
        numOfBranch = sc.nextInt();
        totalnumOfCargoBranch += numOfBranch;
        
    }

    public static int getTotalnumOfCargoBranch() {
        return totalnumOfCargoBranch;
    }
    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumOfBranch() {
        return numOfBranch;
    }
    
}
