package metier;

import java.util.*;

public class Representant {

    /* propriétés privées */
    private int idRepresentant;
    private String nom;
    private String prenom;
    private Double caRepresentant;
    private List<Client> lesClient;

    public Representant(int idRepresentant,
                        String prenom,
                        String nom,
                        List<Client> lesClients) {
        /* Affectations */
        setIdRepresentant(idRepresentant);
        setPrenom(prenom);
        setNom(nom);
        setLesClient(lesClients);
    }

    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        /* A compléter */
        for(Client client : getLesClient()){
            if(client.getIdClient() == idClient)
                return client;
        }
        return null; /* A compléter */
    }

    /* getters et setters */

    public void setLesClient(List<Client> lesClient) {
        this.lesClient = lesClient;
    }

    public List<Client> getLesClient() {
        return lesClient;
    }

    public void setIdRepresentant(int idRepresentant) {
        this.idRepresentant = idRepresentant;
    }

    public int getIdRepresentant() {
        return idRepresentant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCaRepresentant(Double caRepresentant) {
        this.caRepresentant = caRepresentant;
    }

    public Double getCaRepresentant() {
        return caRepresentant;
    }

}
