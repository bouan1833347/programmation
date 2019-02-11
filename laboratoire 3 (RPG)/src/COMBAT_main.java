import java.util.Scanner;
import java.util.Random;

public class COMBAT_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int choixjoueur1,choixjoueur2,balek;
        Personnage tabJoueur[]=new Personnage[2];





        System.out.println("bienvenue dans RPG simulator");

        System.out.println("veuillez choisir le premier personnage\n1. barbare\n2. paladin\n3. magicien noir\n4.magicien rouge");
        choixjoueur1=sc.nextInt();
        if(choixjoueur1==1){tabJoueur[0]=new Barbare();tabJoueur[0].setNom("barbare");} else if(choixjoueur1==2){tabJoueur[0]=new Paladin();tabJoueur[0].setNom("paladin");}else if(choixjoueur1==3){tabJoueur[0]=new MagicienNoir();tabJoueur[0].setNom("magicien noir");}else if(choixjoueur1==4){tabJoueur[0]=new MagicienRouge();tabJoueur[0].setNom("magicien rouge");}
        System.out.println("veuillez choisir le second personnage\n1. barbare\n2. paladin\n3. magicien noir\n4.magicien rouge");
        choixjoueur2=sc.nextInt();
        if(choixjoueur2==1){tabJoueur[1]= new Barbare();tabJoueur[1].setNom("barbare");} else if(choixjoueur2==2){tabJoueur[1]= new Paladin();tabJoueur[1].setNom("paladin");}else if(choixjoueur2==3){tabJoueur[1]= new MagicienNoir();tabJoueur[1].setNom("magicien noir");}else if(choixjoueur2==4){tabJoueur[1]= new MagicienRouge();tabJoueur[1].setNom("magicien rouge");}




        while(tabJoueur[0].getPtdevie()>0&&tabJoueur[1].getPtdevie()>0&&(tabJoueur[0].getPtdemagie()+tabJoueur[1].getPtdemagie())>0)//tant que pointde vie de joueur 1 !=0 ou que point de vie de joueur 2 !=0
        {
            tabJoueur[0].Attaque(tabJoueur[1],tabJoueur[0]);
            balek=sc.nextInt();


            tabJoueur[1].Attaque(tabJoueur[0],tabJoueur[1]);
            balek=sc.nextInt();


        }
        if(tabJoueur[0].getPtdevie()<=0){System.out.println("le joueur 2 a gagné. Félicitation!");}
        else if(tabJoueur[1].getPtdevie()<=0){System.out.println("le joueur 1 a gagné.Félicitation!");}







    }
}
