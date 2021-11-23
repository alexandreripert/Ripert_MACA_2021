package TD4;

public class Char extends Unite{

    Rouler ro = new Rouler();
    Canon ca = new Canon();

    public Char(){
        setDeplacement(ro);
        setAttaque(ca);
    }
}
