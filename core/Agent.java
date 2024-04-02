package core;

import java.util.Date;

public class Agent extends Contact {
    private double salaire;
    private String categorie;
    private int indiceSalaire;
    private String occupation;

    public Agent(String code, String nom, Date dateNaissance, String address, String email, String telNumber,
                 double salaire, String categorie, int indiceSalaire, String occupation) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.salaire = salaire;
        this.categorie = categorie;
        this.indiceSalaire = indiceSalaire;
        this.occupation = occupation;
    }

    // Getters
    public double getSalaire() {
        return salaire;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getIndiceSalaire() {
        return indiceSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    // Setters
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setIndiceSalaire(int indiceSalaire) {
        this.indiceSalaire = indiceSalaire;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
