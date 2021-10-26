package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Commande implements PrePostVisitable, Visitable {
    private String name;

    public Commande(String name){
        this.name = name;
    }

    public void addLigne(Ligne l){

    }

    public void accept(PrePostVisitor v){

    }

    public void accept(Visitor v){

    }

}
