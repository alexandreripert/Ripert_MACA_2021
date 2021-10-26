package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public interface PrePostVisitor extends AbstractVisitor {
    void preVisit(GroupeClient g);
    void preVisit(Client c);
    void preVisit(Commande c);
    void preVisit(Ligne l);
    void postVisit(GroupeClient g);
    void postVisit(Client c);
    void postVisit(Commande c);
    void postVisit(Ligne l);

}
