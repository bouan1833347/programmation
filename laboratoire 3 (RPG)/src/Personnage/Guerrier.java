package Personnage;
import Arme.*;

import Personnage.Personnage;

public abstract class Guerrier extends Personnage {
   protected int ptdeforce;

    public Guerrier(int ptdeforce,int ptdevie,int ptdarmure,String nom,int ptdemagie){super( ptdevie, ptdarmure, nom,ptdemagie);this.ptdeforce=ptdeforce;}

    public int getPtdeforce(){return ptdeforce;}

    public void Attaque(Personnage attaque,Personnage attaquant)
    {
        System.out.println("le "+attaquant.getNom()+" attaque");
        System.out.println("le "+attaque.getNom()+" subis "+((ptdeforce*2)-attaque.getPtdarmure())+" de dégats. Il lui reste "+(attaque.getPtdevie()-((ptdeforce*2)-attaque.getPtdarmure()))+" point de vie" );
        //appliquer ce model de System.out a barbare,paladin et tous les sorts

        attaque.setPtdevie(attaque.getPtdevie()-((ptdeforce*2)-attaque.getPtdarmure()));
    }










}
