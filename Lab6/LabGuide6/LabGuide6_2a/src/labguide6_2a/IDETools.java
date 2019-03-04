
package labguide6_2a;

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
