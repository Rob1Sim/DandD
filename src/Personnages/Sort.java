package Personnages;

public abstract class Sort {
    protected String nom;

    protected abstract void lancerUnSort();
    public String getNom() {
        return nom;
    }
}
