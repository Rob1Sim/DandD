package Personnages;

import Jeu.Jet;
import Personnages.Error.CompetenceNotFound;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Class abstraite représantant des personnages
 */
public abstract class Personnages {
    protected int pv;
    protected String nom;
    protected int CA;
    protected int force;
    protected int dexterite;
    protected int constitution;
    protected int intelligence;
    protected int sagesse;
    protected int charisme;
    protected Race race;
    protected Equipement[] equipements;
    protected Sort[] sorts;



    /**
     * Effectue un jet de compétence pour une compétence donnée
     * @param competence Une des compétence du personnage elle doit faire partie de celle-ci : "for","dex","const","int","sag","cha"
     * @return Le jet final
     */
    public int jetCompetence(String competence){

        Set<String> competenceValid = new HashSet<>();
        competenceValid.add("for");
        competenceValid.add("dex");
        competenceValid.add("const");
        competenceValid.add("int");
        competenceValid.add("sag");
        competenceValid.add("cha");

        if (!competenceValid.contains(competence.toLowerCase())){
            throw new CompetenceNotFound("La compétence fournise n'est pas correcte");
        }

        int d = Jet.d(20);
        return switch (competence) {
            case "for" -> getForce() + d;
            case "dex" -> getDexterite() + d;
            case "const" -> getConstitution() + d;
            case "int" -> getIntelligence() + d;
            case "sag" -> getSagesse() + d;
            case "cha" -> getCharisme() + d;
            default -> -1;
        };

    }
    public Race getRace() {
        return race;
    }
    public Equipement[] getEquipements() {
        return equipements;
    }

    public Sort[] getSorts() {
        return sorts;
    }

    public int getPv() {
        return pv;
    }

    public String getNom() {
        return nom;
    }

    public int getCA() {
        return CA;
    }

    public int getForce() {
        return force;
    }

    public int getDexterite() {
        return dexterite;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSagesse() {
        return sagesse;
    }

    public int getCharisme() {
        return charisme;
    }

}
