public class MagicienNoir extends Magicien {
    protected int aleatoire;


    public MagicienNoir() {super(60, 1,"Magicien Noir",50);this.tabSort = new Sort[]{new Picdeglace(),new Bouledefeu()};

    }
    //initié variable vie et armure dans magicien

    public void Attaque(Personnage attaque,Personnage attaquant)
    {aleatoire =rand.nextInt(2);
    tabSort[aleatoire].LancerSort(attaque,attaquant);
        attaquant.setPtdemagie(tabSort[aleatoire].getCout());


    }
}
