
package labguide5_1;

public class Cosmetics {
    String name;
    double price;
    String ingredients;
    String expire_date;
    String brand;
    int grammage;
    
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
