package metier;

import java.util.*;

public class Article {
    /* propriétés privées */
    private int idArticle;
    private String designation;
    private Double caArticle;
    private int qteStock;
    private Double prix;
    private Tva unTva ;
    private Famille uneFamille;

    /* getters et setters */

    public void setUnTva(Tva unTva) {
        this.unTva = unTva;
    }

    public Tva getUnTva() {
        return unTva;
    }

    public void setUneFamille(Famille uneFamille) {
        this.uneFamille = uneFamille;
    }

    public Famille getUneFamille() {
        return uneFamille;
    }

    public void setIdArticle(int id ){
        this.idArticle = id;
    }
    public int getIdArticle() {
        return this.idArticle;
    }
    public void setDesignation(String d ){
        this.designation = d;
    }
    public String getIDesignatino() {
        return this.designation;
        }

    public void setIcaArticle(Double ca ){
        this.caArticle = ca;
    }
    public Double getCaArticle() {
        return this.caArticle;
    }
    public void setQteStock(int stock ){
        this.qteStock = stock;
    }
    public int getQteStock() {
        return this.qteStock;
    }
    public void setprix(Double pr ){
        this.prix = pr;
    }
    public Double getprix() {
        return this.prix;
    }






    public Article(int idArticle,
                   String designation,
                   int qteStock,
                   double prix,
                   Tva uneTva,
                   Famille uneFamille) {
        /* Affectations */
        setIdArticle(idArticle);
        setDesignation(designation);
        setQteStock(qteStock);
        setprix(prix);
        setUnTva(uneTva);
        setUneFamille(uneFamille);
    }

}

