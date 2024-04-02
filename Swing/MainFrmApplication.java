package Swing;

import core.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrmApplication {
    private static Repertoire repertoire = new Repertoire();

    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame mainFrame = new JFrame("Gestionnaire de Contacts");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new FlowLayout());

        // Boutons pour accéder aux différentes fonctionnalités
        JButton createContactButton = new JButton("Créer un contact");
        JButton displayContactListButton = new JButton("Afficher la liste des contacts");

        // Action à effectuer lorsqu'on clique sur le bouton "Créer un contact"
        createContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateContactWindow createContactWindow = new CreateContactWindow();
            }
        });

        // Action à effectuer lorsqu'on clique sur le bouton "Afficher la liste des contacts"
        displayContactListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ContactListWindow contactListWindow = new ContactListWindow();
            }
        });

        // Ajout des boutons à la fenêtre principale
        mainFrame.add(createContactButton);
        mainFrame.add(displayContactListButton);

        // Affichage de la fenêtre principale
        mainFrame.setVisible(true);
    }
}
