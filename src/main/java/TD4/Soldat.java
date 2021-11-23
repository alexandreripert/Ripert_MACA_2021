package TD4;

public class Soldat extends Unite{

    Courir co = new Courir();
    Mitraillette mit = new Mitraillette();

    public Soldat(){
        setDeplacement(co);
        setAttaque(mit);
    }

}
