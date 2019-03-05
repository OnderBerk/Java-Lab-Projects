
package classroommain;


public class Classroom {
    private String name;
    private int capacity;
    private int height;
    private int width;
    private boolean projector;
    private static int totalClassroom=0;
    private final static int MAX_HEIGHT = 200;

    public Classroom(String name, int capacity, int height, int width, boolean projector) {
        this.name = name;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.projector = projector;
        totalClassroom++;
    }

    public double calculateArea()
    {
        return height * width;
    }
    
    public double calculatePerimeter()
    {
        return 2 * (height+width);
    }
    public static int getTotalClassroom() {
        return totalClassroom;
    }

    public String getName() {
        return name;
    }

    public static int getMAX_HEIGHT() {
        return MAX_HEIGHT;
    }

    @Override
    public String toString() {
        return "\nClassroom INFO" + "\nName=" + name + "\nCapacity=" + capacity + "\nHeight=" + height + "\nWidth=" + width + "\nProjector=" + projector ;
    }
      
    
}
