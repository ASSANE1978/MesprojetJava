package presenttion;

import controler.ITransfert;
import controler.TransfertImpl;
import entities.Transfert;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ITransfert itrs = new TransfertImpl();
        List<Transfert> trs =itrs.liste();
        itrs.affichage(trs);
        // itrs.affichage(itrs.liste());


    }
}
