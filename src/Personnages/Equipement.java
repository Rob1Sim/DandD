package Personnages;

public abstract class Equipement {
    protected String nom;

    public String getNom() {
        return nom;
    }
    protected abstract void utiliser();
}
