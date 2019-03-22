
package filemain;


public class File {
    protected String name;
    protected String size;
    protected String extension;

    public File(String name, String size, String extension) {
        this.name = name;
        this.size = size;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "\nName=" + name + "\nSize=" + size + "\nExtension=" + extension ;
    }
    
    
    
}
