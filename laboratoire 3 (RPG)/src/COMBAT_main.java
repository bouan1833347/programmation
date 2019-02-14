import Personnage.*;
import Arme.*;


import java.util.Scanner;
import java.util.Random;

public class COMBAT_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int choixjoueur1,choixjoueur2,choixarme1,choixarme2;
        String balek;
        char rejouer='o';

        Personnage tabJoueur[]=new Personnage[2];
        Arme tabJoueurArme[]=new Arme[2];



while(rejouer=='o')
{

        System.out.println("bienvenue dans RPG simulator");

        System.out.println("veuillez choisir le premier personnage\n1. barbare\n2. paladin\n3. magicien noir\n4.magicien rouge");
        choixjoueur1=sc.nextInt();
        if(choixjoueur1==1){AfficherContandant();} else if(choixjoueur1==2){AfficherTranchant();}else if(choixjoueur1==3){AfficherMagique();}else if(choixjoueur1==4){AfficherMagique();}
        choixarme1=sc.nextInt();
    if(choixjoueur1==1&&choixarme1==1){tabJoueur[0]=new Barbare(new Masse());}     if(choixjoueur1==1&&choixarme1==2){tabJoueur[0]=new Barbare(new Épée_lourde());}   if(choixjoueur1==1&&choixarme1==3){tabJoueur[0]=new Barbare(new Sceptre());}           else if(choixjoueur1==2&&choixarme1==1){tabJoueur[0]=new Paladin(new Épée());}     else if(choixjoueur1==2&&choixarme1==2){tabJoueur[0]=new Paladin(new Épée_magique());}   else if(choixjoueur1==2&&choixarme1==3){tabJoueur[0]=new Paladin(new Épée_lourde());}   else if(choixjoueur1==3&&choixarme1==1){tabJoueur[0]=new MagicienNoir(new Baguette());}       else if(choixjoueur1==3&&choixarme1==2){tabJoueur[0]=new MagicienNoir(new Épée_magique());}   else if(choixjoueur1==3&&choixarme1==3){tabJoueur[0]=new MagicienNoir(new Sceptre());}   else if(choixjoueur1==4&&choixarme1==1){tabJoueur[0]=new MagicienRouge(new Baguette());}    else if(choixjoueur1==4&&choixarme1==2){tabJoueur[0]=new MagicienRouge(new Épée_magique());}     else if(choixjoueur1==4&&choixarme1==3){tabJoueur[0]=new MagicienRouge(new Sceptre());}


    System.out.println("veuillez choisir le second personnage\n1. barbare\n2. paladin\n3. magicien noir\n4.magicien rouge");
        choixjoueur2=sc.nextInt();
        if(choixjoueur2==1){AfficherContandant();} else if(choixjoueur2==2){AfficherTranchant();}else if(choixjoueur2==3){AfficherMagique();}else if(choixjoueur2==4){AfficherMagique();}
choixarme2=sc.nextInt();
    if(choixjoueur2==1&&choixarme2==1){tabJoueur[1]=new Barbare(new Masse());}     if(choixjoueur2==1&&choixarme2==2){tabJoueur[1]=new Barbare(new Épée_lourde());}   if(choixjoueur2==1&&choixarme2==3){tabJoueur[1]=new Barbare(new Sceptre());}           else if(choixjoueur2==2&&choixarme2==1){tabJoueur[1]=new Paladin(new Épée());}     else if(choixjoueur2==2&&choixarme2==2){tabJoueur[1]=new Paladin(new Épée_magique());}   else if(choixjoueur2==2&&choixarme2==3){tabJoueur[1]=new Paladin(new Épée_lourde());}   else if(choixjoueur2==3&&choixarme2==1){tabJoueur[1]=new MagicienNoir(new Baguette());}       else if(choixjoueur2==3&&choixarme2==2){tabJoueur[1]=new MagicienNoir(new Épée_magique());}   else if(choixjoueur2==3&&choixarme2==3){tabJoueur[1]=new MagicienNoir(new Sceptre());}   else if(choixjoueur2==4&&choixarme2==1){tabJoueur[1]=new MagicienRouge(new Baguette());}    else if(choixjoueur2==4&&choixarme2==2){tabJoueur[1]=new MagicienRouge(new Épée_magique());}     else if(choixjoueur2==4&&choixarme2==3){tabJoueur[1]=new MagicienRouge(new Sceptre());}



        while(tabJoueur[0].getPtdevie()>0&&tabJoueur[1].getPtdevie()>0&&(tabJoueur[0].getPtdemagie()+tabJoueur[1].getPtdemagie())>0)//tant que pointde vie de joueur 1 !=0 ou que point de vie de joueur 2 !=0
        {
            tabJoueur[0].Attaque(tabJoueur[1],tabJoueur[0]);
            balek=sc.nextLine();


            tabJoueur[1].Attaque(tabJoueur[0],tabJoueur[1]);
            balek=sc.nextLine();


        }
        if(tabJoueur[0].getPtdevie()<=0){System.out.println("le joueur 2 a gagné. Félicitation!");}
        else if(tabJoueur[1].getPtdevie()<=0){System.out.println("le joueur 1 a gagné. Félicitation!");}

        System.out.println("voulez vous rejouer ? (o/n)");
        balek=sc.nextLine();
        rejouer=balek.charAt(0);




}











    }


    public static void AfficherTranchant()
    { System.out.println("choisissé l'arme que vous voulez équipe a votre personnage\n1.Épée\n2.Épée magique\n3.Épée lourde"); }
    public static void AfficherContandant()
    {System.out.println("choisissé l'arme que vous voulez équipe a votre personnage\n1.Masse\n2.Épée lourde\n3.Sceptre");}
    public static void AfficherMagique()
    {System.out.println("choisissé l'arme que vous voulez équipe a votre personnage\n1.Baguette\n2.Épée magique\n3.Sceptre");}




}
