package TD4;



public class Main {

    public static void main(String args[]){

        Courir co = new Courir();
        Rouler ro = new Rouler();
        Voler vo = new Voler();

        Canon ca = new Canon();
        LanceFlamme lf = new LanceFlamme();
        Missile mis = new Missile();
        Mitraillette mit = new Mitraillette();

        Unite u = new Unite();

        u.setDeplacement(co);
        u.setAttaque(lf);

        u.display();
        u.performDeplacement();
        u.performAttaque();
    }
}
