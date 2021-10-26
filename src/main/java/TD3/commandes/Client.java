package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Client implements PrePostVisitable, Visitable {

    private String name;

    public Client(String name){
        this.name = name;
    }

    public void addCommande(Commande c){

    }

    public void addLigne(String s, Ligne l){

    }

    public void accept(PrePostVisitor v){

    }

    public void accept(Visitor v){

    }
}
