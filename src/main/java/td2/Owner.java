package td2;

public class Owner {
    private String name;

    Owner(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public int hashCode(){
        return 1;
    }
}
