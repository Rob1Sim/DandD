package Personnages.Races;

import Personnages.Race;

public class Nain extends Race {
    public Nain(){
        this.nom = "Nain";
        this.descriptionPhysique = "Petit et fort";
    }

    public void voirDansLeNoir(String nom){
        System.out.println(nom+" voit dans le noir");
    }
}
