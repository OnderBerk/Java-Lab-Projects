
package labguid6_aq;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time(long miliseconds) {
        second = miliseconds/1000;
        minute = second/60;
        hour = minute/60;
    }

    public Time(long hour, long minute, long sec) {
        this.hour = hour;
        this.minute = minute;
        this.second = sec;
    }

    public long getHour() {
        return hour;
    }

    public void setHour(long hour) {
        this.hour = hour;
    }

    public long getMinute() {
        return minute;
    }

    public void setMinute(long minute) {
        this.minute = minute;
    }

    public long getSecond() {
        return second;
    }

    public void setSecond(long second) {
        this.second = second;
    }
    
    public void changeTime(Time t2, String operation)
   {
        if(operation == "a")
        {
            this.hour += t2.hour;
            this.minute += t2.minute;
            this.second += t2.second;
        }
        else
        {
            this.hour -= t2.hour;
            this.minute -= t2.minute;
            this.second -= t2.second;
        }
        
        System.out.println("\nTime has changed.\n");
   }
    
   public void displayTime()
   {
       System.out.println(second + " seconds.\n" +  minute + " minutes.\n" + hour + " hours.\n");
   }

}
