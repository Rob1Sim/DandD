package Personnages;

public abstract class Arme {
    protected String nom;
    protected String type;
    protected int dg;

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getDg() {
        return dg;
    }
}
