
package labmain;

public class LabMain {

    
    public static void main(String[] args) {
       Lab lab1 = new Lab("CTISL1", 24);
       Lab lab7 = new Lab("CTISL7", 28);

        lab1.addPC("LAB105");
        lab1.addPC("LAB109");
        lab1.addPC("LAB121");
        lab1.addPC("LAB110");
        lab1.addPC("LAB115");

        lab7.addPC("LAB701");
        lab7.addPC("LAB705");
        lab7.addPC("LAB719");
        lab7.addPC("LAB725");

        System.out.println("Number of labs: "
                + Lab.getNumberOfLabs()+ "\n");

        System.out.println("Number of PCs in CTISL1: "
                + lab1.getNumberOfPcs() + "\n");

        String[] pcArray = lab1.getPcList();
        for (int i = 0; i < lab1.getNumberOfPcs(); i++) {
            System.out.print(pcArray[i] + "\n");
        }
        System.out.println(lab7);
        System.out.println(lab1);
        
    }
    
}
