package Arme;
import Personnage.*;



public class Masamune extends Arme implements Magique,Contondant,Tranchant {


    public void Lancer_sort(Personnage attaque,Personnage attaquant,Magique arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 6 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-6);}
    public void Trancher(Personnage attaque,Personnage attaquant,Tranchant arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 6 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-6) ;}
    public void Frapper(Personnage attaque,Personnage attaquant,Contondant arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 5 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-5);}

}
