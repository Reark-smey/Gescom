package metier;

import java.util.*;

public class Client {

    /* propriétés privées */
    private int idClient;
    private String raisonSociale;
    private Double caClient;
    private List<Commande> lesCommandes;
    private Categorie uneCategorie;
    /* getters et setters */

    public void setUneCategorie(Categorie uneCategorie) {
        this.uneCategorie = uneCategorie;
    }

    public Categorie getUneCategorie() {
        return uneCategorie;
    }

    public void setLesCommandes(List<Commande> commande) {
        this.lesCommandes = commande;
    }

    public List<Commande> getLesCommandes() {
        return lesCommandes;
    }

    public void setIdClient(int client) {
        this.idClient = client;
    }
    public int getIdClient() {
        return this.idClient;
    }
    public void setRaisonSociale(String rs) {
        this.raisonSociale = rs;
    }
    public String getRaisonSociale() {
        return this.raisonSociale;
    }

    public void setCaClient(Double caClient) {
        this.caClient = caClient;
    }

    public Double getCaClient() {
        return caClient;
    }

    public Client(int idClient,
                  String raisonSociale,
                  Categorie uneCategorie) {
        /* Affectations */
        setIdClient(idClient);
        setRaisonSociale(raisonSociale);
        setUneCategorie(uneCategorie);
    }

    /**
     * Ajoute une commande à la liste des commandes
     * du client. Prendre la précaution de vérifier
     * que la liste a bien été instanciée
     * @param uneCommande 
     */
    public void ajouterCommande(Commande uneCommande) {
        if (getLesCommandes() == null){
            setLesCommandes(new ArrayList<Commande>());
        }
        if (!getLesCommandes().contains(uneCommande)) {
            this.lesCommandes.add(uneCommande);
            this.cumulCA();
        }
    }

    /**
     * Affecte la somme des valorisations des commandes
     * au CA du client. Prendre la précaution de 
     * l'initialiser avant de commencer
     */
    public void cumulCA() {
        /* A compléter */
        double caclient = 0;
        for(Commande unecommande : lesCommandes){
            this.caClient = unecommande.valoriserCommande() + caclient;
        }


    }

    /**
     * Recherche une commande sur son numéro en 
     * parcourant la liste des commandes, Retourne
     * une Commande si trouvée, sinon retourne null
     * @param idCommande
     * @return Commande
     */
    public Commande getCommandeById(int idCommande) {
        /* A compléter */
        for(Commande unecommande : lesCommandes) {
            if(unecommande.equals(idCommande)){
                return unecommande;
            }
        }
        return null; /* A compléter */
    }

    /**
     * Retire une commande la liste des commandes.
     * Remarque : en supprimant une commande on supprime
     * aussi ses lignes (Composition)
     * @param uneCommande 
     */
    public void supprimerCommande(Commande uneCommande, List<Commande> lesCommandes) {
       /* A compléter */
        int indice = 0;
        for(Commande lacommande : lesCommandes) {
            if(lacommande.equals(uneCommande)) {
                lesCommandes.remove(indice);
                break;
            }indice++;
        }

    }


}
