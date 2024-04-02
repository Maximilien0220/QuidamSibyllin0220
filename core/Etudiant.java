package core;

import java.util.Date;

public class Etudiant extends Contact {
    private String cycle;
    private String niveau;

    public Etudiant(String code, String nom, Date dateNaissance, String address, String email, String telNumber,
                    String cycle, String niveau) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }

    // Getters
    public String getCycle() {
        return cycle;
    }

    public String getNiveau() {
        return niveau;
    }

    // Setters
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
