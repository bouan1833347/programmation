package Personnage;
import Arme.*;

import java.util.Scanner;

import Personnage.Guerrier;

public class Barbare extends Guerrier {


    Scanner sc=new Scanner(System.in);
    private int ptdeforce=10;
    private int ptdarmure=3;
    protected int ajout;
    protected Contondant arme;


    public Barbare(Contondant arme){super(10,100,3,"Barbare",1);this.arme=arme  ; }

    public void setArme(Contondant arme){this.arme=arme;}

    public void Attaque(Personnage attaque,Personnage attaquant)
    {

        super.Attaque(attaque, attaquant);
        arme.Frapper(attaque,attaquant,this.arme);
    }






}
