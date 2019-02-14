package Personnage;
import Arme.*;

import Personnage.Guerrier;

public class Paladin extends Guerrier {
    protected Tranchant arme;


    public Paladin(Tranchant arme)
    {super(5,80,5,"Paladin",1);this.arme= arme;}


    public void Attaque(Personnage attaque,Personnage attaquant)
    {

        super.Attaque(attaque, attaquant);
        arme.Trancher(attaque,attaquant,this.arme);
    }
    public void setArmeTranchante(Tranchant arme){this.arme= arme;}







}
