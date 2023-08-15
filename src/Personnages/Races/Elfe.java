package Personnages.Races;

import Personnages.Race;

public class Elfe extends Race {
    public Elfe(){
        this.nom = "Elfe";
        this.descriptionPhysique = "Généralement grand avec des oreilles en pointe";
    }
    public void precisionAccru(String nom){
        System.out.println(nom+ " utilise sa précision accru !");
    }
}
