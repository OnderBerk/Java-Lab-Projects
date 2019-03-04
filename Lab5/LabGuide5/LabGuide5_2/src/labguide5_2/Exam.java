
package labguide5_2;

public class Exam {
    private String name;
    private int percentage;
    private String date;
    private int numOfQuestion;
    private String type;
    private int duration;

    public Exam() {
        name = "No Name";
        percentage = 0;
        date = "NULL";  
        numOfQuestion = 0;
        type = "NULL";
        duration =0;
    }
    
    public Exam(String name, int percentage, String date, int numOfQuestion,String type,int duration) {
        this.name = name;
        this.percentage = percentage;
        this.date = date;
        this.numOfQuestion = numOfQuestion;
        this.type = type;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getPercentage() {
        return percentage;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfQuestion() {
        return numOfQuestion;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public void setNumOfQuestion(int numOfQuestion) {
        this.numOfQuestion = numOfQuestion;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void display()
    {
        System.out.println("------EXAM INFO------");
        System.out.println("Name: "+ name);
        System.out.println("Percentage: "+ percentage);
        System.out.println("Date: "+ date);
        System.out.println("Number of Question: "+numOfQuestion);
        System.out.println("Type: "+ type);
        System.out.println("Duration: "+duration);
    }
    
    public void changePercentage()
    {
        if(type.equalsIgnoreCase("LAB"))
            percentage += 10;
        else if(type.equalsIgnoreCase("ESSAY"))
            percentage += 5;
    }
    
    public void increaseDuration()
    {
        if(numOfQuestion > 30)
            duration += 15;
        else if(numOfQuestion > 20)
            duration += 10;    
    }
}
