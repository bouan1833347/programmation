package Arme;
import Personnage.*;



public class Masse extends Arme implements Contondant {
    public void Frapper(Personnage attaque,Personnage attaquant,Contondant arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 5 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-5);}

}
