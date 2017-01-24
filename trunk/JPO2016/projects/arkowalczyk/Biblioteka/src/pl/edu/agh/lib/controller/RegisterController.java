package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.Employee;
import pl.edu.agh.lib.model.database.EmployeeDatabase;
import pl.edu.agh.lib.view.RegisterGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Arek on 2017-01-18.
 */
public class RegisterController implements ActionListener {
    private RegisterGUI registerGUI;
    private EmployeeDatabase employeeDatabase;

    public RegisterController(RegisterGUI registerGUI, EmployeeDatabase employeeDatabase) {
        this.registerGUI = registerGUI;
        this.employeeDatabase = employeeDatabase;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (registerGUI.getRegLoginField().getText().isEmpty() || registerGUI.getRegPassField().getText().isEmpty() || registerGUI.getRegPassAgainField().getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Wypełnij wszystkie pola!");
            return;
        } else {
            Employee employee = null;
            employee = new Employee(registerGUI.getRegLoginField().getText(), registerGUI.getRegPassField().getText());
            if (!(registerGUI.getRegPassField().getText().equals(registerGUI.getRegPassAgainField().getText()))) {
                JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Niepoprawne hasło!");
                return;
            }
            if (!(employeeDatabase.getEmployeeList().isEmpty())) {
                List<Employee> employeeData = employeeDatabase.getEmployeeList();
                if (employeeData.contains(employee)) {
                    JOptionPane.showMessageDialog(new JFrame("Błąd!"), "Login zajęty!");
                    return;
                }
            }
            employeeDatabase.addEmployee(employee);
            JOptionPane.showMessageDialog(new JFrame("OK!"), "Rejestracja udana!");
            registerGUI.eraseTextFields();
        }
    }
}
