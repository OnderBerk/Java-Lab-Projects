
package labguide5_1b;

public class CosmeticsMain {

    public static void main(String[] args) {
       Cosmetics cos = new Cosmetics();
       Cosmetics cos1 = new Cosmetics("Powder",121);
       Cosmetics cos2 = new Cosmetics("FoundationCream","2022","Clinic",150);
       
       cos.display();
       cos1.display();
       cos2.display();
       
       cos.name = "Tonic";
       cos.display();
    }
    
}
