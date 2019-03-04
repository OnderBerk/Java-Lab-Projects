
package labguide5_1c;

public class Cosmetics {
    private String name;
    private double price;
    private String ingredients;
    private String expire_date;
    private String brand;
    private int grammage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public Cosmetics() {
        this.name = "Vaseline";
        this.price = 2.0;
        this.ingredients = "Aqua, Glyccerin, SLS";
        this.brand = "Unilever";
        this.expire_date = "2020";
        this.grammage = 100;
    }

    public Cosmetics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Cosmetics(String name, String expire_date, String brand, int grammage) {
        this.name = name;
        this.expire_date = expire_date;
        this.brand = brand;
        this.grammage = grammage;
    }
     
    public void display()
    {
        System.out.println("****COSMETICS INFO ******");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Ingredients: "+ingredients);
        System.out.println("Exprire DATE: "+expire_date);
        System.out.println("Brand: "+ brand);
        System.out.println("Grammage: "+grammage);
    } 
}
