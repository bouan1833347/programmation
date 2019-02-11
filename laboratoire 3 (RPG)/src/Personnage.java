public abstract class Personnage {
    protected int Ptdemagie;
    protected int ptdevie;
    protected int ptdarmure;
    protected String nom;


    public Personnage(int ptdevie,int ptdarmure,String nom,int ptdemagie)
    {
        this.ptdevie=ptdevie;
        this.nom=nom;
        this.ptdarmure=ptdarmure;

    }



    public String getNom() {return nom;}

    public int getPtdevie(){return ptdevie;}

    public int getPtdarmure(){return ptdarmure;}

    public int getPtdemagie(){return Ptdemagie;}


    public void setPtdevie(int _ptdevie){this.ptdevie=_ptdevie;}

    public void setNom(String _Nom){this.nom=_Nom;}

    public void setPtdemagie(int cout){this.Ptdemagie=Ptdemagie-cout;}



    public abstract void Attaque(Personnage attaque,Personnage attaquant);






}
