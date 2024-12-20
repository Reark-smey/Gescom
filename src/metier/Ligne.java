package metier;

import java.util.*;

public class Ligne {
   /* propriétés privées */
   private int qteCommande;
   private Article unArticle;
   /* getters et setters */

    public void setUnArticle(Article unArticle) {
        this.unArticle = unArticle;
    }

    public Article getUnArticle() {
        return unArticle;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public Ligne (Article unArticle,
                  int qteCommande){
        /* Affectations */
        setUnArticle(unArticle);
        setQteCommande(qteCommande);
    }
}