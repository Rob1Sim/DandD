package Jeu;

import Jeu.Error.DeIncorrect;
import Personnages.Personnages;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Class qui gère les jets de dé
 */
public class Jet {
    /**
     * Simule le lancement d'un dé de la valeur passé en paramètre
     * @param value La valeur du dé a être lancé (4, 6, 10, 20, 100)
     * @return Valeur aléatoire compris entre 0 et la valeur
     */
    public static int d(int value){
        Set<Integer> dPossible = new HashSet<>();
        dPossible.add(4);
        dPossible.add(6);
        dPossible.add(10);
        dPossible.add(20);
        dPossible.add(100);
        if (!dPossible.contains(value)){
            throw new DeIncorrect("La valeur du dé entré est incorrecte (4, 6, 10, 20, 100)");
        }
        return new Random().nextInt((value-1)+1) +1;
    }

    /**
     * Simule un jet de compétence contre un Seuil de difficulté
     * @param joueur Le joueur
     * @param comp La compétence
     * @param sd Le seuil de diffuculté
     * @return True si le joueur réussi
     */
    public static boolean jetContreSD(@NotNull Personnages joueur, String comp, int sd){
        return joueur.jetCompetence(comp) > sd;
    }

    /**
     * Simule un jet de compétence entre 2 joueurs
     * @param j1 Joueur 1
     * @param j2 Joueur 2
     * @param comp Compétence à testé
     * @return True si le joueurs 1 l'emporte false sinon
     */
    public static boolean jetJoueurContreJoueur(@NotNull Personnages j1, @NotNull Personnages j2, String comp){
        return j1.jetCompetence(comp) > j2.jetCompetence(comp);
    }
}
