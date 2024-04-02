package Swing;

import core.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ContactListWindow {
    public ContactListWindow() {
        // Création de la fenêtre pour afficher la liste des contacts
        JFrame contactListFrame = new JFrame("Liste des contacts");
        contactListFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        contactListFrame.setSize(400, 300);
        contactListFrame.setLayout(new BorderLayout());

        // Modèle de tableau pour afficher les contacts
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        tableModel.addColumn("Nom");
        tableModel.addColumn("Email");

        // Ajout des contacts au tableau
        for (Contact contact : repertoire.getContacts()) {
            Object[] row = {contact.getNom(), contact.getEmail()};
            tableModel.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        contactListFrame.add(scrollPane, BorderLayout.CENTER);

        // Affichage de la fenêtre pour afficher la liste des contacts
        contactListFrame.setVisible(true);
    }
}
