import core.*;

public class MainApplication {
    public static void main(String[] args) {
        // Création d'un répertoire
        Repertoire repertoire = new Repertoire();

        // Création de quelques contacts pour les tester
        Contact contact1 = new Contact("Code1", "nom1", null, "adresse1", "nom1@gmail.com", "6XXXXXXXX");
        Contact contact2 = new Contact("Code2", "nom2", null, "adresse2", "nom2@gmail.com", "6XXXXXXXX");

        // Ajout des contacts au répertoire
        repertoire.ajouterContact(contact1);
        repertoire.ajouterContact(contact2);
        
        // Affichage des contacts du répertoire
        System.out.println("Liste des contacts dans le répertoire :");
        for (Contact contact : repertoire.getContacts()) {
            System.out.println(contact);
        }

        // Suppression d'un contact (par exemple, le premier contact ajouté)
        repertoire.supprimerContact(contact1);
        System.out.println("Contact supprimé.");

        // Affichage mis à jour des contacts du répertoire
        System.out.println("Liste des contacts après suppression :");
        for (Contact contact : repertoire.getContacts()) {
            System.out.println(contact);
        }

        // Recherche d'un contact par code (par exemple, un contact qui n'existe plus après suppression)
        Contact contactRecherche = repertoire.rechercherContact("Code1");
        if (contactRecherche != null) {
            System.out.println("Contact trouvé : " + contactRecherche);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
