package Swing;

import core.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateContactWindow {
    public CreateContactWindow() {
        // Création de la fenêtre pour créer un contact
        JFrame createContactFrame = new JFrame("Créer un contact");
        createContactFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createContactFrame.setSize(300, 200);
        createContactFrame.setLayout(new FlowLayout());

        // Champs de texte pour saisir les informations du contact
        JTextField nameTextField = new JTextField(20);
        JTextField emailTextField = new JTextField(20);
        JButton saveButton = new JButton("Enregistrer");

        // Action à effectuer lorsqu'on clique sur le bouton "Enregistrer"
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                // Ajouter le contact au répertoire
                Contact newContact = new Contact(name, email);
                repertoire.ajouterContact(newContact);
                // Afficher un message de confirmation
                JOptionPane.showMessageDialog(createContactFrame, "Contact enregistré avec succès !");
                // Effacer les champs de texte après l'enregistrement
                nameTextField.setText("");
                emailTextField.setText("");
            }
        });

        // Ajout des composants à la fenêtre
        createContactFrame.add(new JLabel("Nom: "));
        createContactFrame.add(nameTextField);
        createContactFrame.add(new JLabel("Email: "));
        createContactFrame.add(emailTextField);
        createContactFrame.add(saveButton);

        // Affichage de la fenêtre pour créer un contact
        createContactFrame.setVisible(true);
    }
}
