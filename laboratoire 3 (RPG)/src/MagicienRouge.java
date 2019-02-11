public class MagicienRouge extends Magicien {
    protected int aleatoire;

    public MagicienRouge() {super(60, 1,"Magicien Rouge",40);this.tabSort = new Sort[]{new Picdeglace(),new Bouledefeu()};

    }
    //initié variable vie et armure dans magicien

    public void Attaque(Personnage attaque,Personnage attaquant)
    {
        aleatoire =rand.nextInt(2);
        tabSort[aleatoire].LancerSort(attaque,attaquant);
        attaquant.setPtdemagie(tabSort[aleatoire].getCout());
    }
}


