package Schule;

public class Lehrer extends Menschen{

    private String[] untterichtsfächer = new String[3];
    private int strengheit;
    private int engagement;

    public Lehrer(String name, int alter, int iq, int hunger, String[] untterichtsfächer, int strengheit, int engagement) {
        super(name, alter, iq, hunger);
        untterichtsfächer = untterichtsfächer;
        strengheit = strengheit;
        engagement = engagement;
    }

    void untterichten() {
        setHunger(getHunger()+1);
    }


    public String[] getUntterichtsfächer() {
        return untterichtsfächer;
    }

    public void setUntterichtsfächer(String[] untterichtsfächer) {
        untterichtsfächer = untterichtsfächer;
    }

    public int getStrengheit() {
        return strengheit;
    }

    public void setStrengheit(int strengheit) {
        strengheit = strengheit;
    }
}
