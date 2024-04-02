-- Création de la table Agent

CREATE TABLE Agent (
    id_Agent INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(10) NOT NULL,
    nom VARCHAR(40) NOT NULL,
    date_naissance DATE,
    address VARCHAR(30),
    email VARCHAR(30),
    tel_number VARCHAR(15),
    salaire DECIMAL(10, 2),
    statut VARCHAR(50),
    categorie VARCHAR(50),
    indice_salaire INT,
    occupation VARCHAR(100)
);