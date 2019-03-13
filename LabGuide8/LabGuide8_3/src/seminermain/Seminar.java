package seminermain;

import java.util.Scanner;

public class Seminar {

    private int id;
    private String title;
    private String speaker;
    private String date;
    private int duration;
    private String place;
    private static int lastUsedId = 500;

    public Seminar() {
        id = lastUsedId++;

    }

    public Seminar(String title, String speaker, String date, int duration, String place) {
        this.title = title;
        this.speaker = speaker;
        this.date = date;
        this.duration = duration;
        this.place = place;
        id = lastUsedId++;

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

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter Spekear: ");
        speaker = sc.nextLine();
        System.out.print("Enter Date: ");
        date = sc.next();
        System.out.print("Enter Duration: ");
        sc.skip("\n");
        duration = sc.nextInt();
        System.out.print("Enter Place: ");
        place = sc.next();
    }

    @Override
    public String toString() {
        return " \n----Seminar INFO----" + "\nId=" + id + "\nTitle=" + title + "\nSpeaker=" + speaker + "\nDate=" + date + "\nDuration=" + duration + "\nPlace=" + place;
    }

}
