package client;
import proxy.Bank;
import proxy.BanqueService;
import proxy.Compte ;

import java.util.ArrayList;
import java.util.List;
public class Client {
    public static void main(String[] args) {
BanqueService proxy = new Bank().getBanqueServicePort();
double a=8;
        System.out.printf("la valeur %.2f euro = %.2f Dh \n",a,proxy.conversion(a),"c");
        System.out.println("-------------------------------------------");
int code=1;
        System.out.println("le client numero "+code +"\n");
        Compte compte = proxy.getcompte(1);
        System.out.println("la date de creation  :"+compte.getDatecreation());
        System.out.println("le solde du compte : "+compte.getSolde()+"  dh");
        List<Compte> list =proxy.getlistcompte();
        for(Compte c : list){
            System.out.println("code : "+c.getCode());
            System.out.println("date de creation : "+c.getDatecreation());
            System.out.println("solde :  "+c.getSolde());
            System.out.println("--------------------------");
        }
    }
}
