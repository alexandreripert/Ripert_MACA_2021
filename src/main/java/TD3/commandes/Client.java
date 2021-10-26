package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.Map;

public class Client implements PrePostVisitable, Visitable {

    private String name;
    private Map<String, Commande> commandes;
    private Map<String, Ligne> lignes;

    public Client(String name){
        this.name = name;
    }

    public void addCommande(Commande c){
        commandes.put(c.getName(),c);
    }

    public void addLigne(String s, Ligne l){
        lignes.put(l.getName(), l);
    }

    @Override
    public void accept(PrePostVisitor v){
        v.preVisit(this);
        for(Commande c: commandes.values())
            c.accept(v);
        v.postVisit(this);
    }

    @Override
    public void accept(Visitor v){
        for(Commande c: commandes.values())
            c.accept(v);
        v.visit(this);

    }
}
