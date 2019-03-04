
package labguide5_1b;

public class Cosmetics {
    String name;
    double price;
    String ingredients;
    String expire_date;
    String brand;
    int grammage;

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
        System.out.println("Expire DATE: "+expire_date);
        System.out.println("Brand: "+ brand);
        System.out.println("Grammage: "+grammage);
    } 
}
