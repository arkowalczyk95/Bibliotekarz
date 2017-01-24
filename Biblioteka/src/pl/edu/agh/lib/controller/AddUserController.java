package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.User;
import pl.edu.agh.lib.model.database.UserDatabase;
import pl.edu.agh.lib.view.LibraryGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


/**
 * Created by Arek on 2017-01-17.
 */
public class AddUserController implements ActionListener {
    private LibraryGUI libraryGUI;
    private UserDatabase userDatabase;

    public AddUserController(LibraryGUI libraryGUI, UserDatabase userDatabase) {
        this.libraryGUI = libraryGUI;
        this.userDatabase = userDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (libraryGUI.getUserIdTextField().getText().isEmpty() || libraryGUI.getUserNameTextField().getText().isEmpty() || libraryGUI.getUserSurnameTextField().getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Wypełnij wszystkie pola!");
            return;
        } else {
            User user = null;
            try {
                user = new User(Integer.parseInt(libraryGUI.getUserIdTextField().getText()), libraryGUI.getUserNameTextField().getText(), libraryGUI.getUserSurnameTextField().getText());
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Podano nieprawidłowe dane!");
                return;
            }
            List<User> userData = userDatabase.getUserList();

            if (userData.contains(user)) {
                JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Użytkownik z takim ID już istnieje!");
                return;
            }
            userDatabase.addUser(user);

        }

        libraryGUI.initComboBoxes();
        libraryGUI.eraseTextFields();
    }
}