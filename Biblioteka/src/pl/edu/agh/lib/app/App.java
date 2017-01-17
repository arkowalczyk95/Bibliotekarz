package pl.edu.agh.lib.app;

import pl.edu.agh.lib.model.Component;
import pl.edu.agh.lib.model.User;
import pl.edu.agh.lib.model.database.ComponentDatabase;
import pl.edu.agh.lib.model.database.UserDatabase;
import pl.edu.agh.lib.view.LibraryGUI;

import javax.swing.*;

/**
 * Created by Arek on 2017-01-15.
 */
public class App {

    public static void main(String[] args) {
        //dodanie userów i books
        UserDatabase userDatabase = new UserDatabase();
        userDatabase.addUser(new User(1, "Adam", "Kowalski"));
        userDatabase.addUser(new User(2, "Jan", "Nowak"));
        userDatabase.addUser(new User(3, "Maria", "Krawczyk"));
        userDatabase.addUser(new User(4, "Piotr", "Nowacki"));
        userDatabase.addUser(new User(5, "Iga", "Tomczyk"));
        ComponentDatabase componentDatabase = new ComponentDatabase();
        componentDatabase.addComponent(new Component(1, "Potop", "H. Sienkiewicz"));
        componentDatabase.addComponent(new Component(2, "Iliada", "Homer"));
        componentDatabase.addComponent(new Component(3, "Władca Piercieni", "J. Tolkien"));
        componentDatabase.addComponent(new Component(4, "Harry Potter", "J. Rowling"));
        componentDatabase.addComponent(new Component(5, "Wesele", "S. Wyspiański"));


        SwingUtilities.invokeLater(() -> {
            LibraryGUI gui = new LibraryGUI(userDatabase, componentDatabase);
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(gui);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
