package controler;

import entities.Transfert;

import java.util.List;

public interface ITransfert {
   public List<Transfert> liste();
   public  void affichage( List<Transfert> transferts);
}
