
package labmaintenanceformmain;

import java.util.Scanner;

public class LabMaintenanceFormMain {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       LabMaintenanceForm[] forms = new LabMaintenanceForm[4];
       StringBuffer strbuf;
       int indx;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + ". string:");
            String str = input.nextLine();

            String delimiter = "\\*"; //split() solution
            String[] newStr = str.split(delimiter);
            strbuf = new StringBuffer(newStr[2]); //reverse
            strbuf.insert(0, "CTIS_");
            //strbuf.reverse();
            //strbuf.append("10");
            //ALSO YOU CAN TRY TO CONVERT BACK TO STRING IN THIS WAY
            //newStr[3] = new String(strbuf);
            newStr[2] = strbuf.toString();
            forms[i] = new LabMaintenanceForm(Integer.parseInt(newStr[0]), newStr[1], newStr[2],newStr[3]);

        }

        for (int i = 0; i < 3; i++) {
            System.out.println(forms[i]);
            //indexof
            indx = forms[i].toString().indexOf(forms[i].getProblem_type());
            if (indx == -1) {
                System.out.println("no such problem!..");
            } else {
                System.out.println("Problem's position is at " + indx);
            }
        }
        
    }
    
}
