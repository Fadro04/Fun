package Schule;

public abstract class Menschen {

    private String name;
    private int alter;
    private int iq;
    private int hunger;

    public Menschen(String name, int alter, int iq, int hunger) {
        this.name = name;
        this.alter = alter;
        this.iq = iq;
        this.hunger = hunger;
    }

    void essen(){
        hunger++;
    }


    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
