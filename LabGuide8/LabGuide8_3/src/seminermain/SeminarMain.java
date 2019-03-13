
package seminermain;

import java.util.Scanner;

public class SeminarMain {

    public static void main(String[] args) {
  
       Scanner input1 = new Scanner(System.in);
       
        SeminarList.addSeminar();
        
        System.out.println("-----------------");
        System.out.println("Here is a list of the seminars: ");
        SeminarList.display();
        System.out.println("\n------------------");
        System.out.println("\nWhich Seminar would you like to delete? ");
        if (!SeminarList.removeSeminar(input1.nextLine())) {
            System.out.println("That Seminar doesn't exist!");
        }

        SeminarList.display();
        System.out.println("------------------");
        System.out.println("Which seminar would you like to search? ");
        Seminar s = SeminarList.getSeminar(input1.nextLine());
        if (s != null) {
            System.out.println("Here is the Seminar you were looking for...\n" + s.toString());
        }
        else{
            System.out.println("There is no such seminar in the list");
        }

        Seminar max = SeminarList.getMaximumDuration();

        System.out.println("-----------------");

        System.out.println(max.getTitle()+ " has the maximum duration of " + max.getDuration());
    }
    
}
