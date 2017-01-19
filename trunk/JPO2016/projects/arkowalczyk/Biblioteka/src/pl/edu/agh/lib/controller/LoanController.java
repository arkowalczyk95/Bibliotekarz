package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.database.ComponentDatabase;
import pl.edu.agh.lib.model.database.UserDatabase;
import pl.edu.agh.lib.view.LibraryGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arek on 2017-01-15.
 */
public class LoanController implements ActionListener {
    private LibraryGUI libraryGUI;
    private UserDatabase userDatabase;
    private ComponentDatabase componentDatabase;

    public LoanController(LibraryGUI libraryGUI, UserDatabase userDatabase, ComponentDatabase componentDatabase) {
        this.libraryGUI = libraryGUI;
        this.userDatabase = userDatabase;
        this.componentDatabase = componentDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        libraryGUI.getSelectedBookInLoan().setAvailable(false);
        libraryGUI.getSelectedUserInLoan().addLoanedComponent(libraryGUI.getSelectedBookInLoan());
        libraryGUI.initComboBoxes();
    }
}
