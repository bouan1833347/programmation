import java.util.Scanner;
import java.util.Random;

public class jeu_alumettes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random ();

        boolean non = false;
        char decision;
        String decision2;
        int allumettes;




        while(non==false)
        while(non==false)
        {
            jeu();




            System.out.println("\n\n voulez vous jouer de nouveau (o/n)?");
           decision2=scan.nextLine();
           decision=decision2.charAt(0);
            if(decision=='n')
            {
                non=true;
                System.out.println("merci d'avoir jouer au jeu des allumettes et bonne journée");
            }



        }




    }

public static void jeu()
{  Scanner scan = new Scanner(System.in);
    Random rand = new Random ();

 int tabchoix1[]=new int [50];
    int tabchoix2[]=new int [50];
    String nom1,nom2;
    int allumettes=0,position,tour=0,choix1,choix2,position1=0,position2=0;
    allumettes=rand.nextInt(80)+20;

 System.out.println("quel est votre nom joueur 1?");
 nom1=scan.nextLine();
 System.out.println("quel est votre nom joueur 2?");
 nom2 = scan.nextLine();

 do
    {
        if(tour %2==0||tour==0)
        {
            System.out.println("il reste " + allumettes + " allumettes");
            System.out.println(nom1 + ", combien d'allumettes (entre 1 et 3) voulez-vous retirer");
            choix1=scan.nextInt();
            allumettes = allumettes-choix1;
            position1=position1+1;
            tabchoix1[tour/2]=choix1;
        }



        if(tour%2==1||tour==1)
        {
            System.out.println("il reste " + allumettes + " allumettes");
            System.out.println(nom2 + ", combien d'allumettes (entre 1 et 3) voulez-vous retirer");
            choix2=scan.nextInt();
            allumettes = allumettes-choix2;
            position2=position2+1;
            tabchoix2[tour/2]=choix2;
        }
        tour++;
    }while(allumettes>0);


 if(tour%2==0)
 {
     System.out.println("\n"+nom1+" a gagné\n");
 }
 if(tour%2==1)
 {
     System.out.println("\n"+nom2+" a gagné\n");
 }
 System.out.println(nom1+" a choisi");
 for(int r=0;r<position1;r++)
 {
     System.out.print(","+tabchoix1[r]);
 }

    System.out.println("\n\n"+nom2+" a choisi");
    for(int r=0;r<position2;r++)
    {
        System.out.print(","+tabchoix2[r]);
    }








}

}
