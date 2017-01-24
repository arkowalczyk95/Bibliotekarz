package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.Component;
import pl.edu.agh.lib.model.database.ComponentDatabase;
import pl.edu.agh.lib.view.LibraryGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Arek on 2017-01-17.
 */
public class AddBookController implements ActionListener {
    private LibraryGUI libraryGUI;
    private ComponentDatabase componentDatabase;

    public AddBookController(LibraryGUI libraryGUI, ComponentDatabase componentDatabase) {
        this.libraryGUI = libraryGUI;
        this.componentDatabase = componentDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (libraryGUI.getBookIdTextField().getText().isEmpty() || libraryGUI.getBookAuthorTextField().getText().isEmpty() || libraryGUI.getBookTitleTextField().getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Wypełnij wszystkie pola!");
            return;
        } else {
            Component component = null;
            try {
                component = new Component(Integer.parseInt(libraryGUI.getBookIdTextField().getText()), libraryGUI.getBookTitleTextField().getText(), libraryGUI.getBookAuthorTextField().getText());
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Podano nieprawidłowe dane!");
                return;
            }
            List<Component> bookData = componentDatabase.getDatabase();
            if(bookData.contains(component))    {
                JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Książka z takim ID już istnieje!");
                return;
            }
            componentDatabase.addComponent(component);
        }
        libraryGUI.initComboBoxes();
        libraryGUI.eraseTextFields();
    }
}
