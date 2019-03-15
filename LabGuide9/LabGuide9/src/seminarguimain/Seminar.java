
package seminarguimain;

public class Seminar {
    
    private int id;
    private String title;
    private String speaker;
    private String date;
    private int duration;
    private String place;
    private static int lastUsedId = 500;

    public Seminar(String title, String speaker, String date, int duration, String place) {
        this.title = title;
        this.speaker = speaker;
        this.date = date;
        this.duration = duration;
        this.place = place;
        id = lastUsedId++;
    }

    public static int getLastUsedId() {
        return lastUsedId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return " \n\n----Seminar INFO----" + "\nId=" + id + "\nTitle=" + title + "\nSpeaker=" + speaker + "\nDate=" + date + "\nDuration=" + duration + "\nPlace=" + place;
    }

}
