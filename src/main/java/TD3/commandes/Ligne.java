package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {

    private String name;
    private int sum;

    public Ligne(String name){
        this.name = name;
    }

    public Ligne(String name, int sum){
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor p){

    }

    @Override
    public void accept(Visitor v){

    }

    public String getName()
    {
        return this.name;
    }
}
