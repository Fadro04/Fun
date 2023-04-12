package Datetime;

public class Datetime {
    private String datetime;
    private String[] date_time;
    private String[] datum;
    private String[] uhrzeit;

    public Datetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getDatum() {
        date_time = datetime.split(" ");
        return date_time[0];
    }
    public String getUhrzeit() {
        date_time = datetime.split(" ");
        return date_time[1];
    }
    public int getSekunde() {
        date_time = datetime.split(" ");
        uhrzeit = date_time[1].split(":");
        int sekunde = Integer.parseInt(uhrzeit[2]);
        return sekunde;
    }
    public int getMinute() {
        date_time = datetime.split(" ");
        uhrzeit = date_time[1].split(":");
        int minute = Integer.parseInt(uhrzeit[1]);
        return minute;
    }
    public int getStunde() {
        date_time = datetime.split(" ");
        uhrzeit = date_time[1].split(":");
        int stunde = Integer.parseInt(uhrzeit[1]);
        return stunde;
    }
    public int getTag() {
        date_time = datetime.split(" ");
        uhrzeit = date_time[0].split("-");
        int tag = Integer.parseInt(uhrzeit[2]);
        return tag;
    }
    public int getMonat() {
        date_time = datetime.split(" ");
        uhrzeit = date_time[0].split("-");
        int monat = Integer.parseInt(uhrzeit[1]);
        return monat;
    }
    public int getJahr() {
        date_time = datetime.split(" ");
        uhrzeit = date_time[0].split("-");
        int jahr = Integer.parseInt(uhrzeit[0]);
        return jahr;
    }
}
