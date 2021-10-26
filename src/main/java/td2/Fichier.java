package td2;

public class Fichier extends Composantlmpl implements Composant{
    private StringBuilder content;

    Fichier(String name, Owner owner){
        super(name, owner);
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
    public void appendContent(String content){

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
