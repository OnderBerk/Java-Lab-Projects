
package classroommain;

import java.util.Scanner;


public class ClassroomMain {

    public static void main(String[] args) {
       String name;
       int capacity, height,width;
       boolean projector;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter classroom name:");
       name = sc.next();
       
       while(!name.equalsIgnoreCase("stop"))
       {
           System.out.println("Enter "+name+" capacity:");
           capacity = sc.nextInt();
           
           System.out.println("Enter "+name+" height:");
           height = sc.nextInt();
           
           System.out.println("Enter "+name+" width:");
           width = sc.nextInt();
           
           System.out.println(name+ " has any projector:");
           projector = sc.nextBoolean();
           
           Classroom class1 = new Classroom(name, capacity, height, width, projector);
           
           System.out.println(class1);
           System.out.println("Area of "+ class1.getName());
           System.out.println(class1.calculateArea());
           System.out.println("Perimeter of "+ class1.getName());
           System.out.println(class1.calculatePerimeter());
           
           if(class1.calculatePerimeter() > Classroom.getMAX_HEIGHT())
               System.out.println("HUGE CLASSROOM");
           else
               System.out.println("NORMAL CLASSROOM");
           
           System.out.println("Enter classroom name:");
           name = sc.next();
       }
       System.out.println("Total number of classes are "+Classroom.getTotalClassroom());
    }
    
}
