package Arme;
import Personnage.*;



public class Sceptre extends Arme implements Contondant,Magique {
    public void Frapper(Personnage attaque,Personnage attaquant,Contondant arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 3 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-3);}
    public void Lancer_sort(Personnage attaque,Personnage attaquant,Magique arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 6 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-6);}

}
