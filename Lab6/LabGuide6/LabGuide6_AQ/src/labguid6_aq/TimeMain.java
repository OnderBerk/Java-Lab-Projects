
package labguid6_aq;

import java.util.Scanner;

public class TimeMain {

     public static void main(String[] args) {
        long miliseconds = System.currentTimeMillis();
        System.out.println("The number System.currentTimeMillis() method returns is " + miliseconds+"\n");
        Time t = new Time(miliseconds);
        t.displayTime();

        Scanner s = new Scanner (System.in);
        System.out.println("Add (a) or subtract (s) time?");
        String operation = s.next();
        s.skip("\n");
        System.out.println("Enter the amount of hours: ");
        int h = s.nextInt();
        System.out.println("Enter the amount of minutes: ");
        int m = s.nextInt();
        System.out.println("Enter the amount of seconds: ");
        int sec = s.nextInt();
        
        Time t2 = new Time(h,m,sec);
        t.changeTime(t2, operation);
        t.displayTime();

    }
    
}
