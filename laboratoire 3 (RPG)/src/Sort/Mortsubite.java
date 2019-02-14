package Sort;

import Personnage.Personnage;
import Sort.Sort;

import java.util.Random;
public class Mortsubite extends Sort {
    public Mortsubite(){super(10);}
    Random rand = new Random();
    private int chance;



    public void LancerSort(Personnage attaque, Personnage attaquant)
    {
        if(attaquant.getPtdemagie()>=10)
        {
            chance = rand.nextInt(10);
            System.out.println("le" + attaquant.getNom() + "attaque");
            if (chance == 2) {
                System.out.println("le" + attaquant + "lance l'attaque Mort Subite,ce qui lui coute 10 point de magie. il lui reste "+(attaquant.getPtdemagie()-10)+" et elle............RÉUSSI le" + attaque + "est donc mort");
                attaque.setPtdevie(0);
            } else {
                System.out.println("le " + attaquant + " lance l'attaque mort subite et elle ...........échoue." + attaque + " ne prend pas de degats il lui reste donc " + attaque.getPtdevie());

            }
        }
        else{System.out.println("vous vous élancer pour lancer votre sort mais il ne vous reste malheureusement plus de jus.vous ne faite donc aucun dégat.");}





    }



}
