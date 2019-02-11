public class Empoisonnement extends Sort {
    protected int degat;
    public Empoisonnement(){super(2);}

    public void LancerSort(Personnage attaque,Personnage attaquant)
    {
        if(attaquant.getPtdemagie()>=2)
        {
            System.out.println("le"+attaquant.getNom()+"attaque");
            System.out.println("le"+attaquant+"lance Empoisonement,ce qui lui coute 2 point de magie. il lui reste "+(attaquant.getPtdemagie()-2)+" et inflige"+(2+degat)+". il lui reste"+(attaque.getPtdevie()-(2+degat)));
            attaque.setPtdevie(attaque.getPtdevie()-(2+degat));
            degat=degat+2;

        }
        else{System.out.println("vous vous élancer pour lancer votre sort mais il ne vous reste malheureusement plus de jus.vous ne faite donc aucun dégat.");}
    }

}
