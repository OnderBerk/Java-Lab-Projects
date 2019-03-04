
package labguide5_2;

public class ExamMain {

    public static void main(String[] args) {
        Exam exam1 = new Exam("487Midterm", 20, "20/02/2019", 21, "LAB", 135);
        Exam exam2 = new Exam("359Quiz1", 10, "25/03/2019", 25, "ESSAY", 120);
        
        exam1.display();
        exam2.display();
        
        exam1.changePercentage();
        exam1.display();
        exam2.increaseDuration();
        exam2.display();
    }
    
}
