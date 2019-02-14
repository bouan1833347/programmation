package Arme;
import Personnage.*;
public class Épée_magique extends Arme implements Tranchant, Magique {



    public void Trancher(Personnage attaque,Personnage attaquant,Tranchant arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 6 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-6);}
    public void Lancer_sort(Personnage attaque,Personnage attaquant,Magique arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 3 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-3);}

}
