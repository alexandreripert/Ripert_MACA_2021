package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.List;

public class GroupeClient implements PrePostVisitable, Visitable {

    private String name;
    private List<Client> clients;

    public GroupeClient(String name){
        this.name = name;
    }

    public void addClient(Client c){

    }

    public void addCommande(String s, Commande c){

    }

    public void addLigne(String s, String st, Ligne c){

    }

    @Override
    public void accept(PrePostVisitor p){

    }

    @Override
    public void accept(Visitor v){

    }
}
