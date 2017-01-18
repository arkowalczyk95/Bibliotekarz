package pl.edu.agh.lib.app;

import pl.edu.agh.lib.model.Employee;
import pl.edu.agh.lib.model.database.EmployeeDatabase;
import pl.edu.agh.lib.view.StartWindowGUI;

import javax.swing.*;
import java.util.List;

/**
 * Created by Arek on 2017-01-15.
 */
public class App {

    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        SwingUtilities.invokeLater(() -> {
            StartWindowGUI gui = new StartWindowGUI(employeeDatabase);
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(gui);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
