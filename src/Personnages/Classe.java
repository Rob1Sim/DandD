package Personnages;

public class Classe {
    private String nom;
    private String description;
    private String habilite;

    public Classe(String nom, String description, String habilite){
        this.nom = nom;
        this.description = description;
        this.habilite = habilite;
    }
    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getHabilite() {
        return habilite;
    }
}
