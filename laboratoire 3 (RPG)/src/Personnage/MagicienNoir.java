package Personnage;

import Personnage.Personnage;
import Sort.*;
import Arme.*;


public class MagicienNoir extends Magicien {
    protected int aleatoire;


    public MagicienNoir(Magique arme) {super(60, 1,"Magicien Noir",50);this.tabSort = new Sort[]{new Picdeglace(),new Bouledefeu()};this.arme=arme;


    }
    //initié variable vie et armure dans magicien

    public void Attaque(Personnage attaque, Personnage attaquant)
    {aleatoire =rand.nextInt(2);
    tabSort[aleatoire].LancerSort(attaque,attaquant);
        attaquant.setPtdemagie(tabSort[aleatoire].getCout());


    }
    public void setArme(Magique arme){this.arme=arme;}
}
