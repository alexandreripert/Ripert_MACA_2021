package td2;

import java.util.ArrayList;
import java.util.List;

public class Repertoire<T> extends Composantlmpl implements Composant, Composite {

    private final List<Composant> children;

    Repertoire(String name, Owner owner){
        super(name, owner);
        children = new ArrayList<>();
    }

    public void setOwner(Owner owner, boolean recursive){

    }

    @Override
    public int getSize(){
        return 1;
    }

    @Override
    public String getContent(){
        return "test";
    }

    @Override
    public void appendContent(String name){
        throw new UnsupportedOperationException("Cannot ...");
    }

   public List<Composant> getChildren(){
        return new ArrayList<>(this.children);
    }

    public void addChild(Composant composant){

    }

    public boolean removeChild(Composant composant){
        return false;
    }

    public boolean removeChildren(List<Composant> t){
        return false;
    }

    @Override
    public boolean isComposite(){
        return false;
    }

    @Override
    public String toString(){
        return "test";
    }
}
