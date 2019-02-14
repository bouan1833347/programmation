package Personnage;
import Arme.Magique;
import Sort.Sort;
import Personnage.Personnage;

import java.util.Random;
public abstract class Magicien extends Personnage {
    protected Random rand = new Random();
    protected Magique arme;



    protected Sort tabSort[]=new Sort[2];

    public Magicien(int ptdevie,int ptdarmure,String nom,int ptdemagie){super (ptdevie, ptdarmure, nom,ptdemagie);}



   public abstract void Attaque(Personnage attaque,Personnage attaquant);







}
