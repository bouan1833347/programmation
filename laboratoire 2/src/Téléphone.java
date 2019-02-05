public class Téléphone {

private String tabnuméro[]=new String[10];
private String tabinformation[]=new String[10];



    public void setNumero(int place,String numero)
    {if( numero!="" &&place>0)
        {this.tabnuméro[place]=numero;}



    }

    public void setInfo(int place,String info)
    {this.tabinformation[place]=info; }


    public void afficherNum(){ System.out.println("1."+tabinformation[0]+tabnuméro[0]+"2."+tabinformation[1]+tabnuméro[1]+"3."+tabinformation[2]+tabnuméro[2]+"4."+tabinformation[3]+tabnuméro[3]+"5."+tabinformation[4]+tabnuméro[4]+"6."+tabinformation[5]+tabnuméro[5]+"7."+tabinformation[6]+tabnuméro[6]+"8."+tabinformation[7]+tabnuméro[7]+"9."+tabinformation[8]+tabnuméro[8]+"10."+tabinformation[9]+tabnuméro[9]);}











}
