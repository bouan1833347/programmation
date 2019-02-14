package Arme;

import Personnage.*;
public class Épée extends Arme implements Tranchant{



   public void Trancher(Personnage attaque,Personnage attaquant,Tranchant arme){System.out.println("losrqu'il a attaqué, le "+attaquant+" était équipé de "+arme+" .Il inflige donc 5 points de dégats suplémentaire");attaque.setPtdevie(attaque.getPtdevie()-5);}
}
