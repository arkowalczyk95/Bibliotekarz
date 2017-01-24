package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.database.ComponentDatabase;
import pl.edu.agh.lib.view.LibraryGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arek on 2017-01-18.
 */
public class DeleteBookController implements ActionListener {
    private LibraryGUI libraryGUI;
    private ComponentDatabase componentDatabase;

    public DeleteBookController(LibraryGUI libraryGUI, ComponentDatabase componentDatabase) {
        this.libraryGUI = libraryGUI;
        this.componentDatabase = componentDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        componentDatabase.getDatabase().remove(libraryGUI.getSelectedBookInDelete());
        libraryGUI.initComboBoxes();
    }
}
