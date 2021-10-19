package td2;

import java.util.List;

public class Repertoire<T> extends Composantlmpl implements Composant, Composite {

    String name;
    Owner owner;

    Repertoire(String name, Owner owner){
        super(name, owner);
    }

    public void setOwner(Owner owner, boolean recursive){

    }

    public int getSize(){
        return 1;
    }

    public String getContent(){
        return "test";
    }

    public void appendContent(String name){

    }

   public List<Composant> getChildren(){
        return getChildren();
    }

    public void addChild(Composant composant){

    }

    public boolean removeChild(Composant composant){
        return false;
    }

    public boolean removeChildren(List<Composant> t){
        return false;
    }

    public boolean isComposite(){
        return false;
    }

    public String toString(){
        return "test";
    }
}
