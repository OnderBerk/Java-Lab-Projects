
package filemain;

public class Image extends File {
    private String color;
    private String effects;

    public Image(String name, String size, String extension,String Color, String Effects) {
        super(name, size, extension);
        this.color = Color;
        this.effects = Effects;
    }

    @Override
    public String toString() {
        return "\nImage File"+super.toString()+"\nColor=" + color + "\nEffects=" +effects;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String Effects) {
        this.effects = Effects;
    }
    
    
    
}
