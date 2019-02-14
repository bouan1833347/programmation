package Arme;
import Personnage.*;

public class Baguette extends Arme implements Magique {
    public void Lancer_sort(Personnage attaque,Personnage attaquant,Magique arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 5 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-5);}
}
