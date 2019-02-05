import java.util.Scanner;
import java.util.Random;
public class programme_main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choix=0;
        int place=0;
        int nbcontact=0;
        int choixinfo;
        contact tabContact[]=new contact [20];
        String choixtele;
        String variable;
        for(int i=0;i<19;i++){tabContact[i]=new contact();}


while(choix<4)
{
    affichermenu();
    choix = sc.nextInt();

    if (choix == 1) {
        if (nbcontact==20)
        {System.out.println("vous ne pouvez pas ajouter de nouveau contact.veuillez modifier d'ancien contact.");}
        else
        {

            System.out.println("veuillez entrez les information suivante sur votre contact :");
            System.out.println("prénom :");
            variable=sc.nextLine();tabContact[nbcontact].setPrénom(variable);
            System.out.println("Nom :");
            variable=sc.nextLine();tabContact[nbcontact].setNom(variable);
            System.out.println("Adresse :\n    Numéro de porte :");
            variable=sc.nextLine();tabContact[nbcontact].adresse.setNumero(variable);
            System.out.println("Rue");
            variable=sc.nextLine();tabContact[nbcontact].adresse.setRue(variable);
            System.out.println("Appartement");
            variable=sc.nextLine();tabContact[nbcontact].adresse.setAppartement(variable);
            System.out.println("Ville");
            variable=sc.nextLine();tabContact[nbcontact].adresse.setVille(variable);
            System.out.println("Province ");
            variable=sc.nextLine();tabContact[nbcontact].adresse.setProvince(variable);
            System.out.println("Pays");
            variable=sc.nextLine();tabContact[nbcontact].adresse.setPays(variable);
            System.out.println("Occupation");
            System.out.println("Poste");
            variable=sc.nextLine();tabContact[nbcontact].occupation.setPoste(variable);
            System.out.println("Entreprise");
            System.out.println("Nom");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setEntreprise(variable);
            System.out.println("Adresse");
            System.out.println("Numéro de porte");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setNumeroEnt(variable);
            System.out.println("Rue");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setRueEnt(variable);
            System.out.println("Appartement");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setAppartementEnt(variable);
            System.out.println("Ville");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setVilleEnt(variable);
            System.out.println("Province");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setProvinceEnt(variable);
            System.out.println("Pays");
            variable=sc.nextLine();tabContact[nbcontact].occupation.entreprise.setPaysEnt(variable);
            System.out.println("entrer un numéro de téléphone  (o/n)");
            choixtele=sc.nextLine();
                    if (choixtele=="o")
                    {
                        System.out.println("a quoi correspond ce numéro?(cellulaire, maison, travail...)");
                         variable=sc.nextLine();tabContact[nbcontact].téléphone.setInfo(0,variable);
                        System.out.println("quel est ce numéro?");
                         variable=sc.nextLine();tabContact[nbcontact].téléphone.setNumero(0,variable);
                        System.out.println("votre contact a été rentré avec succes");
                                nbcontact=nbcontact+1;
                    }
                    else{ System.out.println("votre contact a été rentrer avec succes");
            nbcontact=nbcontact+1;}


        }

    }
    else if (choix == 2) {
        System.out.println("quel est le numéro du contact que vous voulez modifier");
        place=sc.nextInt();
        System.out.println("écrivez les nouvelles information,laissez vide si correct");
        System.out.print("Prénom (");tabContact[place-1].afficherPrénom();System.out.print("):");
        variable=sc.nextLine();tabContact[place-1].setPrénom(variable);
        System.out.print("\nNom (");tabContact[place-1].afficherNom();System.out.print("):");
        variable=sc.nextLine();tabContact[place-1].setNom(variable);
        System.out.println("Adresse :\n    Numéro de porte (");tabContact[place-1].adresse.afficherNumero();System.out.print("):");
        variable=sc.nextLine();tabContact[place-1].adresse.setNumero(variable);
        System.out.println("Rue");
        variable=sc.nextLine();tabContact[place-1].adresse.setRue(variable);
        System.out.println("Appartement");
        variable=sc.nextLine();tabContact[place-1].adresse.setAppartement(variable);
        System.out.println("Ville");
        variable=sc.nextLine();tabContact[place-1].adresse.setVille(variable);
        System.out.println("Province ");
        variable=sc.nextLine();tabContact[place-1].adresse.setProvince(variable);
        System.out.println("Pays");
        variable=sc.nextLine();tabContact[place-1].adresse.setPays(variable);
        System.out.println("Occupation");
        System.out.println("Poste");
        variable=sc.nextLine();tabContact[place-1].occupation.setPoste(variable);
        System.out.println("Entreprise");
        System.out.println("Nom");
        variable=sc.nextLine();tabContact[place-1].occupation.entreprise.setEntreprise(variable);
        System.out.println("Adresse");
        System.out.println("Numéro de porte");
        variable=sc.nextLine();tabContact[place-1].occupation.entreprise.setNumeroEnt(variable);
        System.out.println("Rue");
        variable=sc.nextLine();tabContact[place-1].occupation.entreprise.setRueEnt(variable);
        System.out.println("Appartement");
        variable=sc.nextLine(); tabContact[place-1].occupation.entreprise.setAppartementEnt(variable);
        System.out.println("Ville");
        variable=sc.nextLine();tabContact[place-1].occupation.entreprise.setVilleEnt(variable);
        System.out.println("Province");
        variable=sc.nextLine(); tabContact[place-1].occupation.entreprise.setProvinceEnt(variable);;
        System.out.println("Pays");
        variable=sc.nextLine(); tabContact[place-1].occupation.entreprise.setPaysEnt(variable);
            System.out.println("voulez vous modifiez un numéro  (o/n)");
                    choixtele=sc.nextLine();
            if(choixtele=="o")
                tabContact[place-1].téléphone.afficherNum();
                System.out.println("quel numero voulez-vous modifiez?");
            choixinfo=sc.nextInt();
            System.out.println("enregistrer vos nouvelles données.laisser vide si vous ne voulez rien changez.");
            System.out.println("quelle est la nouvelle information?");
            variable=sc.nextLine();
            tabContact[place-1].téléphone.setInfo(choixinfo,variable);
        System.out.println("quelle est le nouveau numéro?");
        variable=sc.nextLine();
        tabContact[place-1].téléphone.setNumero(choixinfo,variable);

        System.out.println("contact modifié");






    }
    else if (choix == 3) {

        for(int i=0;i<nbcontact;i++)
        {
            System.out.println("prénom");
            tabContact[i].afficherPrénom();
            System.out.println("nom");
            tabContact[i].afficherNom();
            System.out.println("adress\nnuméro de porte");
            tabContact[i].adresse.afficherNumero();
            System.out.println("rue");
            tabContact[i].adresse.afficherrue();
            System.out.println("appartement");
            tabContact[i].adresse.afficherAppartement();
            System.out.println("ville");
            tabContact[i].adresse.afficherVille();
            System.out.println("province");
            tabContact[i].adresse.afficherProvince();
            System.out.println("pays");
            tabContact[i].adresse.afficherPays();
            System.out.println("occupation\nposte");
            tabContact[i].occupation.afficherposte();
            System.out.println("nom de l'entreprise");
            tabContact[i].occupation.entreprise.getnomEntreprise();
            System.out.println("numéro de porte de l'entreprise");
            tabContact[i].occupation.entreprise.afficherNumeroEnt();
            System.out.println("rue de l'entreprise");
            tabContact[i].occupation.entreprise.afficherrueEnt();
            System.out.println("appartement de l'entreprise");
            tabContact[i].occupation.entreprise.afficherAppartementEnt();
            System.out.println("ville de l'entreprise");
            tabContact[i].occupation.entreprise.afficherVilleEnt();
            System.out.println("province de l'entreprise");
            tabContact[i].occupation.entreprise.afficherProvinceEnt();
            System.out.println("pays de l'entreprise");
            tabContact[i].occupation.entreprise.afficherPaysEnt();

        }




    }








    else if (choix == 4) {
        System.out.println("au revoir");

    }
    else {
        System.out.println("veuillez entrez un chiffre entre 1 et 4");
    }
}







    }


    public static void affichermenu()
    {
        System.out.println("que voulez vous faire?\n1.  ajouter un contact\n2.   modifier un contact\n3.  afficher les contacts\n4.   quitter");
    }
}
