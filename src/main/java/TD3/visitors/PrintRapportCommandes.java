package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class PrintRapportCommandes implements Visitor {

    public PrintRapportCommandes(){
    }

    @Override
    public void visit(GroupeClient g){

    }

    @Override
    public void visit(Client c){

    }

    @Override
    public void visit(Commande c){

    }

    @Override
    public void visit(Ligne l){

    }

}
