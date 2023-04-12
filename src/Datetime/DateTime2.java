package Datetime;

public class DateTime2 {
    private String datetime;
    private String[] date_time;
    private Uhrzeit uhrzeit;
    private Datum datum;

    public DateTime2(String datum) {
        this.datetime = datum;
        this.date_time = datetime.split(" ");
        this.datum = new Datum(date_time[0]);
        this.uhrzeit = new Uhrzeit(date_time[1]);
    }

    public Uhrzeit getUhrzeit() {
        return uhrzeit;
    }

    public Datum getDatum() {
        return datum;
    }
}
