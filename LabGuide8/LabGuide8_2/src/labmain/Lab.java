
package labmain;

public class Lab {
    

    private String labname;
    private String[] pcList;
    private int size;
    private int numOfPC;
    private static int numberOfLabs = 0;

    public Lab(String labname, int size) {
        pcList = new String[size];
        this.size = size;
        this.labname = labname;
        numOfPC = 0;
        numberOfLabs++;
    }
    public boolean addPC(String pcNumber) {
        if (numOfPC >= size) {
            return false;
        }
        pcList[numOfPC] = pcNumber;
        numOfPC++;
        return true;
    }

    public String getLabName() {
        return labname;
    }
    
    public String[] getPcList() {
        return pcList;
    }

    public int getNumberOfPcs() {
        return numOfPC;
    }

    public static int getNumberOfLabs() {
        return numberOfLabs;
    }

    public String toString() {
        String result = "Number of pcs in "
                + labname + ": " + numOfPC + "\n";

        for (int i = 0; i < numOfPC; i++) {
            result += pcList[i] + "\n";
        }

        return result;
    }

}
