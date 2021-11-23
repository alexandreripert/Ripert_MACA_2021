package TD4;

public class Helico extends Unite{
    Voler vo = new Voler();
    Missile mis = new Missile();

    public Helico(){
        setDeplacement(vo);
        setAttaque(mis);
    }
}
