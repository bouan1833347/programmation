public class Entreprise {
    private String nomEntreprise;
    private String adresseEnt;


    public void setEntreprise(String _nomEntreprise)
    {if(_nomEntreprise!=""){this.nomEntreprise=_nomEntreprise;}
    }

    public void setAdresseEnt(String _adresseEnt)
    {
        if(_adresseEnt!=""){this.adresseEnt=_adresseEnt;}
    }
    public void getnomEntreprise(){System.out.println(nomEntreprise);}
    public void get(){System.out.println(adresseEnt);}


    private String NumeroEnt;
    private String RueEnt;
    private String AppartementEnt;
    private String VilleEnt;
    private String ProvinceEnt;
    private String PaysEnt;




    public void setNumeroEnt(String _numero) {if(_numero!=""){this.NumeroEnt=_numero;}}
    public void setRueEnt(String _rue) {if(_rue!=""){this.RueEnt=_rue;}}
    public void setAppartementEnt(String _appart) {if(_appart!=""){this.AppartementEnt=_appart;}}
    public void setVilleEnt(String _ville) {if(_ville!=""){this.VilleEnt=_ville;}}
    public void setProvinceEnt(String _province) {if(_province!=""){this.ProvinceEnt=_province;}}
    public void setPaysEnt(String _pays){if(_pays!=""){this.PaysEnt=_pays;}}


    public void afficherNumeroEnt(){System.out.print(NumeroEnt)  ;}
    public void afficherrueEnt(){System.out.print(RueEnt);}
    public void afficherAppartementEnt(){System.out.print(AppartementEnt);}
    public void afficherVilleEnt(){System.out.print(VilleEnt) ;}
    public void afficherProvinceEnt(){System.out.print(ProvinceEnt);}
    public void afficherPaysEnt(){System.out.print(PaysEnt) ;}











}
