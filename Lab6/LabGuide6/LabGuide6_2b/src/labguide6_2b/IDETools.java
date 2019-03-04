
package labguide6_2b;

import java.util.Scanner;

public class IDETools {
    private String name;
    private double version;
    private String supportedLanguages;
    private String drawbacks;

    public IDETools(String name, double version, String supportedLanguages, String drawbacks) {
        this.name = name;
        this.version = version;
        this.supportedLanguages = supportedLanguages;
        this.drawbacks = drawbacks;
    }

    public IDETools() {
    }
    
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter IDE name:\n");
        name = sc.next();
        System.out.println("Enter version:");
        version = sc.nextDouble();
        System.out.println("Enter Supported Languages:");
        sc.skip("\n");
        supportedLanguages = sc.nextLine();
        System.out.println("Enter Drawbacks:");
        drawbacks = sc.nextLine();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getSupportedLanguages() {
        return supportedLanguages;
    }

    public void setSupportedLanguages(String supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    public String getDrawbacks() {
        return drawbacks;
    }

    public void setDrawbacks(String drawbacks) {
        this.drawbacks = drawbacks;
    }

    @Override
    public String toString() {
        return "\nIDETools\n" + "Name=" + name + "\nVersion=" + version + "\nSupportedLanguages=" + supportedLanguages + "\nDrawbacks=" + drawbacks;
    }
    
    
    
}
