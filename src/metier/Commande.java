package metier;

import dao.BdD;
import java.util.*;

public class Commande {

    /* propriétés privées */
    private int idCommande;
    private Date dateCommande;
    private List<Ligne> lesLignes;
    /* getters et setters */

    public void setLesLignes(List<Ligne> lesLignes) {
        this.lesLignes = lesLignes;
    }

    public List<Ligne> getLesLignes() {
        return lesLignes;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }


    public Commande (int idCommande,
                     Date dateCommande){
        /* Affectations */
        setIdCommande(idCommande);
        setDateCommande(dateCommande);
    }
    
    /**
     * Ajoute une ligne à une commande.
     * Si la liste des lignes n'est pas instanciée,
     * l'instancier
     * Si l'article n'est pas dans la liste des
     * lignes, créer la ligne et l'ajouter à la liste
     * @param unArticle
     * @param qteCde 
     */
    public void ajouterLigne(Article unArticle, int qteCde) {
        if (getLesLignes() == null) {
            setLesLignes(new ArrayList<Ligne>());
        }
        Ligne uneLigne = new Ligne(unArticle, qteCde);
        this.lesLignes.add(uneLigne);
    }

    /**
     * Supprime la ligne passée en paramètre
     * @param ligneASupprimer Ligne à supprimer
     */
    public void supprimerLigne(Ligne ligneASupprimer, List<Ligne> lesLignes) {
        /* A compléter */
        int indice = 0;
        for(Ligne uneLigne : lesLignes) {
            if(uneLigne.equals(ligneASupprimer)) {
                lesLignes.remove(indice);
                break;
            }indice++;
        }
    }
    
    /**
     * Recherche la ligne contenant l'article ayant
     * l'id passé en paramètre. 
     * Utiliser la méthode equals() pour comparer deux objets.
     * @param idArticle identifiant de l'article à chercher
     * @param bdd objet Base de Données contenant la liste des articles
     */    
    public Ligne chercherLigne(int idArticle, BdD bdd) {
        /* A compléter */

        Article articleATrouver = bdd.getArticleBdD(idArticle);
        for(Ligne uneligne : lesLignes){
            if(uneligne.getUnArticle().equals(articleATrouver)){
                return uneligne;
            }
        }
        return null;

    }

    /**
     * Calcule le montant total HT de la commande 
     * à partir du prix des articles présents dans
     * les lignes de commande
     * @return Montant total HT de la commande
     */
    public double valoriserCommande() {
        /* A compléter */
        double prixTotal = 0;
        for(Ligne laligne : lesLignes) {
            prixTotal = prixTotal + laligne.getQteCommande() * laligne.getUnArticle().getprix();
        }
        return prixTotal;/* A compléter */
    }


}
