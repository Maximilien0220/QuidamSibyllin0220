package core;

import java.util.Date;

public class Contact {
    private String code;
    private String nom;
    private Date dateNaissance;
    private String address;
    private String email;
    private String telNumber;

    public Contact(String code, String nom, Date dateNaissance, String address, String email, String telNumber) {
        this.code = code;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.address = address;
        this.email = email;
        this.telNumber = telNumber;
    }

    public Contact(String name, String email) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
}
