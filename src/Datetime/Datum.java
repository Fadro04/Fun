package Datetime;

public class Datum {

    private String datum;
    private int tag;
    private int monat;
    private int jahr;

    public Datum(String datum) {
        this.datum = datum;
        String[] date = datum.split("-");
        this.jahr = Integer.parseInt(date[0]);
        this.monat = Integer.parseInt(date[1]);
        this.tag = Integer.parseInt(date[2]);
    }

    public String getString() {
        return datum;
    }

    public int getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

}
