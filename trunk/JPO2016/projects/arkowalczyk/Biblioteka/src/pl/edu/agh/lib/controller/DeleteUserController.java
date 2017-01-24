package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.database.UserDatabase;
import pl.edu.agh.lib.view.LibraryGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arek on 2017-01-18.
 */
public class DeleteUserController implements ActionListener {
    private LibraryGUI libraryGUI;
    private UserDatabase userDatabase;

    public DeleteUserController(LibraryGUI libraryGUI, UserDatabase userDatabase) {
        this.libraryGUI = libraryGUI;
        this.userDatabase = userDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userDatabase.getUserList().remove(libraryGUI.getSelectedUserInDelete());
        libraryGUI.initComboBoxes();
    }

}
