public class contact {

    private String prénom;
    private String Nom_De_Famille;




    public void setPrénom(String _Prénom){this.prénom=_Prénom;}
    public void setNom(String _Nom){this.Nom_De_Famille=_Nom;}

    public void  afficherPrénom(){System.out.print(prénom);}
    public void afficherNom(){System.out.print(Nom_De_Famille);}

    Adresse adresse=new Adresse();
    Occupation occupation=new Occupation();
    Téléphone téléphone=new Téléphone();


}
