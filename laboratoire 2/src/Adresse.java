public class Adresse {



    private String Numéro;
    private String Rue;
    private String Appartement;
    private String Ville;
    private String Province;
    private String Pays;




    public void setNumero(String _numero) {if(_numero!=""){this.Numéro=_numero;}}
    public void setRue(String _rue) {if(_rue!=""){this.Rue=_rue;}}
    public void setAppartement(String _appart) {if(_appart!=""){this.Appartement=_appart;}}
    public void setVille(String _ville) {if(_ville!=""){this.Ville=_ville;}}
    public void setProvince(String _province) {if(_province!=""){this.Province=_province;}}
    public void setPays(String _pays){if(_pays!=""){this.Pays=_pays;}}


    public void afficherNumero(){System.out.print(Numéro)  ;}
    public void afficherrue(){System.out.print(Rue);}
    public void afficherAppartement(){System.out.print(Appartement);}
    public void afficherVille(){System.out.print(Ville) ;}
    public void afficherProvince(){System.out.print(Province);}
    public void afficherPays(){System.out.print(Pays) ;}












































}
