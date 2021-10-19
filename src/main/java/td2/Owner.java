package td2;

public class Owner {
    private String name;

    Owner(String name){
        this.name = name;
    }

    public boolean equals(Object o){
        return false;
    }

    public int hashCode(){
        return 1;
    }
}
