package metier;

import java.util.*;

public class Famille {

    /* propriétés privées */
    private int idFamille;
    private String libFamille;

    /* getters et setters */

    public void setIdFamille(int idFamille) {
        this.idFamille = idFamille;
    }

    public int getIdFamille() {
        return idFamille;
    }

    public void setLibFamille(String libFamille) {
        this.libFamille = libFamille;
    }

    public String getLibFamille() {
        return libFamille;
    }

    public Famille(int idFamille,
                   String libFamille) {
        /* Affectations */
        setIdFamille(idFamille);
        setLibFamille(libFamille);
    }



}
