-- Création de la table Enseignant

CREATE TABLE Enseignant (
    id_Enseignant INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(10) NOT NULL,
    nom VARCHAR(40) NOT NULL,
    date_naissance DATE,
    address VARCHAR(30),
    email VARCHAR(30),
    tel_number VARCHAR(15),
    statut VARCHAR(50)
);

