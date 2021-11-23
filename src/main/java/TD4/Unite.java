package TD4;

public class Unite {

    Attaque attaque;
    Deplacement deplacement;

    public Unite() {}

    public void setAttaque(Attaque atq){
        attaque = atq;
    }

    public void setDeplacement(Deplacement dp){
        deplacement = dp;
    }

    public void performAttaque(){
        attaque.attaquer();
    }

    public void performDeplacement(){

        deplacement.deplacer();
    }

    public void seDeplacer(){
        System.out.println("Je me déplace");
    }

    public void display(){
        System.out.println("Unité au rapport");
    }

    public void afficheUnite(){
        display();
        performDeplacement();
        performAttaque();
        System.out.println("\n");
    }
}
