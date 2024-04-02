package core;

import java.util.Date;

public class Enseignant extends Contact {
    private String statut;

    public Enseignant(String code, String nom, Date dateNaissance, String address, String email, String telNumber,
                      String statut) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.statut = statut;
    }

    // Getters
    public String getStatut() {
        return statut;
    }

    // Setters
    public void setStatut(String statut) {
        this.statut = statut;
    }
}
