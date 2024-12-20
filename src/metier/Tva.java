package metier;

import java.util.*;

public class Tva {

    /* propriétés privées */

    private int idTva;
    private Double tauxTva;

    public Tva(int idTva,
               double tauxTva) {
        /* Affectations */
        setIdTva(idTva);
        setTauxTva(tauxTva);
    }

    /* getters et setters */

    public void setIdTva(int idTva) {
        this.idTva = idTva;
    }

    public int getIdTva() {
        return idTva;
    }

    public void setTauxTva(Double tauxTva) {
        this.tauxTva = tauxTva;
    }

    public Double getTauxTva() {
        return tauxTva;
    }
}
