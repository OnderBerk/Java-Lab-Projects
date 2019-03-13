
package seminermain;

import java.util.Scanner;

public class SeminarList {
    

    public static final int MAX_SIZE = 3;
    private static Seminar seminars[] = new Seminar[MAX_SIZE];
    private static int count = 0;

    public static void addSeminar()
    {
        Scanner input = new Scanner(System.in);
        boolean userStatus = true;
        String userOpp = "";
       
        do{
            if(count < MAX_SIZE)
            {
                System.out.println("Seminar no. " + (count + 1) + ": ");
                seminars[count] = new Seminar();
                seminars[count].getInput();
               
                System.out.println(seminars[count].getTitle() + " is added to the list");
                
                 count++;
                 System.out.println("Do you want to continue (Y/N)?");
                userOpp = input.next();
                if(userOpp.equalsIgnoreCase("N"))
                    userStatus = false;
            }
            else{
                System.out.println("Error: Max size is reached! Cannot add any more seminars");
                userStatus = false;
            }
               
        }while(userStatus);
    }
    public static boolean removeSeminar(String str) {
        int id = Integer.parseInt(str);

        for (int i = 0; i < count; i++) {
            if (id == seminars[i].getId()) {
                System.out.println(seminars[i].getTitle() + " is removed.");
                seminars[i] = seminars[--count];
                
                
                return true;
            }
        }
        return false;
    }

    public static Seminar getSeminar(String title) {
        for (int i = 0; i < count; i++) {
            if (title.equalsIgnoreCase(seminars[i].getTitle())) {
                return seminars[i];
            }
        }
        return null;

    }

    public static Seminar[] getAll() {
        return seminars;
    }

    public static Seminar getMaximumDuration() {
        int indexOfMax = 0;

        for (int i = 1; i < count; i++) {
            if (seminars[i].getDuration()> seminars[indexOfMax].getDuration()) {
                indexOfMax = i;
            }
        }
        return seminars[indexOfMax];
    }

    public static void display() {
        String output = "";

        for (int i = 0; i < count; i++) {
            output += seminars[i].toString();

        }
        System.out.print(output);

    }

}
