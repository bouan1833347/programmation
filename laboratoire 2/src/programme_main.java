import java.util.Scanner;
import java.util.Random;
public class programme_main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choix=0;



        affichermenu();
        choix=sc.nextInt();

        if (choix==1)
        {
            System.out.println();

        }
        else if(choix==2)
        {System.out.println("quel est le numéro du contact que vous voulez modifier");


        }
        else if(choix==3)
        {

        }
        else if(choix==4)
        {

        }
        else
        {
            System.out.println("veuillez entrez un chiffre entre 1 et 4");
        }








    }


    public static void affichermenu()
    {
        System.out.println("que voulez vous faire?\n1.  ajouter un contact\n2.   modifier un contact\n3.  afficher les contacts\n4.   quitter");
    }
}
