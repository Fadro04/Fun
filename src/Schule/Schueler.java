package Schule;

public class Schueler extends Menschen {

    private int klasse;
    private int aufmerksamkeit;
    private int bewertung;

    public Schueler(String name, int alter, int iq, int hunger, int klasse, int aufmerksamkeit, int bewertung) {
        super(name, alter, iq, hunger);
        this.klasse = klasse;
        this.aufmerksamkeit = aufmerksamkeit;
        this.bewertung = bewertung;
    }

    void chillen() {
        setIq(getIq() - 1);
        aufmerksamkeit++;
    }

    void unttericht() {
        setIq(getIq() + 1);
        aufmerksamkeit--;
    }

    void lernen() {
        setHunger(getHunger() + 1);
        setIq(getIq() + 2);
        aufmerksamkeit--;
    }

    void streichSpielen(Lehrer lehrer) {
        bewertung -= (2 * lehrer.getStrengheit());
        lehrer.setStrengheit(lehrer.getStrengheit()+1);
    }

    void werteAusgeben() {
        System.out.println("Name = " + getName());
        System.out.println("Alter = " + getAlter());
        System.out.println("Iq = " + getIq());
        System.out.println("Klasse = " + klasse);
        System.out.println("Hunger = " + getHunger());
        System.out.println("Aufmerksamkeit = " + aufmerksamkeit);
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public int getAufmerksamkeit() {
        return aufmerksamkeit;
    }

    public void setAufmerksamkeit(int aufmerksamkeit) {
        this.aufmerksamkeit = aufmerksamkeit;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }
}
