
package labguide6_1;

public class MuseumMain {
    public static void main(String[] args) {
        Museum m1 = new Museum("Cumhuriyet", 6.0, "FRIDAY", "ANKARA");
        Museum m2 = new Museum("Mevlana", 15.0, "MONDAY", "KONYA");
        Museum m3 = new Museum("Topkapi Sarayi", 25, "NONE", "İSTANBUL");
        Museum m4 = new Museum("Konuralp", 5.0, "TUESDAY", "DÜZCE");
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        
    }
    
}
