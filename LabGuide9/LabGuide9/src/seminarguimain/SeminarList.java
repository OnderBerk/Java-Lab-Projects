
package seminarguimain;



public class SeminarList {
    

    public static final int MAX_SIZE = 3;
    private static Seminar seminars[] = new Seminar[MAX_SIZE];
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    
    public static boolean addSeminar(String title,String speaker, String date, int duration, String place) {
        if (count < MAX_SIZE) {
            Seminar s = new Seminar(title, speaker, date, duration, place);
            seminars[count++] = s;
            return true;
        } else {
            return false;
        }
    }

    public static boolean removeSeminar(String str) {
        int id = Integer.parseInt(str);

        for (int i = 0; i < count; i++) {
            if (id == seminars[i].getId()) {
                System.out.println(seminars[i].getTitle() + " is removed.");
                seminars[i] = seminars[--count];
                return true;
            }
        }
        return false;
    }

    public static Seminar getSeminar(String title) {
        for (int i = 0; i < count; i++) {
            if (title.equalsIgnoreCase(seminars[i].getTitle())) {
                return seminars[i];
            }
        }
        return null;

    }

    public static Seminar[] getAll() {
        return seminars;
    }

    public static Seminar getMaximumDuration() {
        int indexOfMax = 0;

        for (int i = 1; i < count; i++) {
            if (seminars[i].getDuration()> seminars[indexOfMax].getDuration()) {
                indexOfMax = i;
            }
        }
        return seminars[indexOfMax];
    }

    public static String display() {
        String output = "";

        for (int i = 0; i < count; i++) {
            output += seminars[i].toString();

        }
        return output;

    }

    @Override
    public String toString() {
        String output = "\nSeminarList\n\n";
        for (int i = 0; i < count; i++) {
            output += seminars[i].toString();
        }
        return output;
    }

}
