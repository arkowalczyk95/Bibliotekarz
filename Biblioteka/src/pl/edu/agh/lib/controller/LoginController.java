package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.Component;
import pl.edu.agh.lib.model.Employee;
import pl.edu.agh.lib.model.User;
import pl.edu.agh.lib.model.database.ComponentDatabase;
import pl.edu.agh.lib.model.database.EmployeeDatabase;
import pl.edu.agh.lib.model.database.UserDatabase;
import pl.edu.agh.lib.view.LibraryGUI;
import pl.edu.agh.lib.view.LoginGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Arek on 2017-01-18.
 */
public class LoginController implements ActionListener {
    private LoginGUI loginGUI;
    private EmployeeDatabase employeeDatabase;

    public LoginController(LoginGUI loginGUI, EmployeeDatabase employeeDatabase) {
        this.loginGUI = loginGUI;
        this.employeeDatabase = employeeDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (loginGUI.getLogLoginField().getText().isEmpty() || loginGUI.getLogPassField().getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Wypełnij wszystkie pola!");
            return;
        } else {
            Employee employee = new Employee(loginGUI.getLogLoginField().getText(), loginGUI.getLogPassField().getText());
            if (!(employeeDatabase.getEmployeeList().isEmpty())) {
                List<Employee> employeeData = employeeDatabase.getEmployeeList();
                if (!(employeeData.contains(employee))) {
                    JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Niepoprawne hasło!");
                    return;
                } else {
                    JOptionPane.showMessageDialog(new JFrame("Ok!"), "Logowanie udane!");

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
                        JFrame frame = new JFrame("Biblioteka");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.getContentPane().add(gui);
                        frame.pack();
                        frame.setVisible(true);
                    });
                }
            }   else    {
                JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Błąd logowania! Spróbuj ponownie lub zarejestruj się!");
            }

        }
    }
}