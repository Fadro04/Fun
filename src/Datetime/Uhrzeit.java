package Datetime;

public class Uhrzeit {

    private String uhrzeit;
    private int sekunde;
    private int minute;
    private int stunde;

    public Uhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
        String[] time = uhrzeit.split(":");
        this.stunde = Integer.parseInt(time[0]);
        this.minute = Integer.parseInt(time[1]);
        this.sekunde = Integer.parseInt(time[2]);
    }

    public String getString() {
        return uhrzeit;
    }

    public int getSekunde() {
        return sekunde;
    }

    public int getMinute() {
        return minute;
    }

    public int getStunde() {
        return stunde;
    }


}
