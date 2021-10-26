package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient g);
    void visit(Client c);
    void visit(Commande c);
    void visit(Ligne l);
}
