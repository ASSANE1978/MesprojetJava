package controler;

import entities.Transfert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TransfertImpl implements ITransfert {
    @Override
    public List<Transfert> liste() {

         Scanner scan = new Scanner(System.in);
         String rep = null;
        List<Transfert> liste = new ArrayList<Transfert>();
         do{

             Transfert transfert = new Transfert();
             System.out.println("Entrer l'ID ");
             int id = Integer.parseInt(scan.nextLine());
             transfert.setId(id);

             System.out.println("Entrer le libelle ");
             String lib = scan.nextLine();
             transfert.setLib(lib);

             System.out.println("Entrer le montant ");
             double montant = Double.parseDouble(scan.nextLine());
             transfert.setMontant(montant);

             //System.out.println("Entre la date :dd/MM/yyyy ");
            // String date = scan.nextLine();
            // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
             Date date = null;

             try {
                 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                 System.out.println("Entre la date :dd/MM/yyyy");
                 transfert.setDate(sdf.parse(scan.nextLine()));

             }catch (Exception ex) {
                 ex.printStackTrace();
             }

             liste.add(transfert);
             System.out.println("Voulez vous continuer !!!");
             rep = scan.nextLine();
         }while (rep.equalsIgnoreCase("oui"));



        return liste;
    }

    @Override
    public void affichage(List<Transfert> transferts) {
        for(Transfert trs:transferts){
            String date;
            System.out.println("IDENTIFIANT :" + trs.getId());
            System.out.println("LIBELLE :" + trs.getLib());
            System.out.println("MONTANT :" + trs.getMontant());
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

                System.out.println("DATE :" + sdf.format(trs.getDate()));
            }catch (Exception ex) {
                ex.printStackTrace();
            }


        }


    }
}
