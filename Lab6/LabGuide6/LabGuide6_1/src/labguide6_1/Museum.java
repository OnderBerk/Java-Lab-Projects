
package labguide6_1;

import java.util.logging.Logger;

public class Museum {
    private int number;
    private String name;
    private double entrance_price;
    private String holiday;
    private String city;

    public Museum(String name, double entrance_price, String holiday, String city) {
        this.number = (int) (Math.random() * 20+1);;
        this.name = name;
        this.entrance_price = entrance_price;
        this.holiday = holiday;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public double getEntrance_price() {
        return entrance_price;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntrance_price(double entrance_price) {
        this.entrance_price = entrance_price;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "-----Museum-----" +"\nNumber="+number +"\nName=" + name + "\nEntrance_price=" + entrance_price + "\nHoliday=" + holiday + "\nCity=" + city ;
    }
   
    
    
    
}
