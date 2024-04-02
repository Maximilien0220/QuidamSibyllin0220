-- Création de la table Etudiant

CREATE TABLE Etudiant (
    id_Etudiant INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(10) NOT NULL,
    nom VARCHAR(40) NOT NULL,
    date_naissance DATE,
    address VARCHAR(30),
    email VARCHAR(30),
    tel_number VARCHAR(15),
    cycle VARCHAR(15),
    niveau VARCHAR(5)
);