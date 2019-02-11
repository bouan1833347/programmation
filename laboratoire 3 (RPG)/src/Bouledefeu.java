public class Bouledefeu extends Sort {

    public Bouledefeu(){super(5);}


    public void LancerSort(Personnage attaque,Personnage attaquant)
    {
        if(attaquant.getPtdemagie()>=5)
        {
            System.out.println("le"+attaquant+"attaque");
            System.out.println("le"+attaquant+"lance le sort boule de feu,ce qui lui coute 5 point de magie. il lui reste "+(attaquant.getPtdemagie()-5)+" et inflige 5 dégat a "+attaque+"et il lui reste "+(attaque.getPtdevie()-5));
            attaque.setPtdevie(attaque.getPtdevie()-5);
        }
        else{System.out.println("vous vous élancer pour lancer votre sort mais il ne vous reste malheureusement plus de jus.vous ne faite donc aucun dégat.");}
    }
}
