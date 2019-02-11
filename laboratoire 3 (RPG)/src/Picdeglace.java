public class Picdeglace extends Sort {
    protected int cout=5;
    public Picdeglace(){super(5);}


    public void LancerSort(Personnage attaque,Personnage attaquant)
    {
        if(attaquant.getPtdemagie()>=5)
        {
            System.out.println("le"+attaquant+"attaque");
            System.out.println("Le"+attaquant+"lance pic de glace,ce qui lui coute 5 point de magie. il lui reste "+(attaquant.getPtdemagie()-5)+" et inflige"+(7-attaque.getPtdarmure())+"il lui reste "+(attaque.getPtdevie()-(7-attaque.getPtdarmure())));
            attaque.setPtdevie(attaque.getPtdevie()-(7-attaque.getPtdarmure()));
        }
        else{System.out.println("vous vous élancer pour lancer votre sort mais il ne vous reste malheureusement plus de jus.vous ne faite donc aucun dégat.");}

    }
}
