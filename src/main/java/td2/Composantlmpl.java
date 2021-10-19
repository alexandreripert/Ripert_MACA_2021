package td2;

public abstract class Composantlmpl implements Composant {

    private String name; //voir pour le final plus tard
    private Owner owner;
    Composantlmpl(String name, Owner owner){
        this.name = name;
        this.owner = owner;
    }

    public String getName(){
        return this.name;
    }

    public Owner getOwner(){
        return this.owner;
    }

    public void stOwner(Owner owner, boolean recursive){

    }

    public boolean equals(Object o){
        return false;
    }

    public int hashCode(){
        return 1;
    }
}
