/*
 * Created by JFormDesigner on Wed Jan 18 20:01:01 CET 2017
 */

package pl.edu.agh.lib.view;

import pl.edu.agh.lib.controller.RegisterController;
import pl.edu.agh.lib.model.database.EmployeeDatabase;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Arkadiusz Kowalczyk
 */
public class RegisterGUI extends JPanel {
    private EmployeeDatabase employeeDatabase;

    public RegisterGUI(EmployeeDatabase employeeDatabase) {
        initComponents();
        this.employeeDatabase = employeeDatabase;
        registerButton.addActionListener(new RegisterController(this, this.employeeDatabase));
    }

    public JTextField getRegLoginField() {
        return regLoginField;
    }

    public JTextField getRegPassField() {
        return regPassField;
    }

    public JTextField getRegPassAgainField() {
        return regPassAgainField;
    }

    public void eraseTextFields() {
        regLoginField.setText("");
        regPassField.setText("");
        regPassAgainField.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Arkadiusz Kowalczyk
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        regLoginField = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        registerButton = new JButton();
        regPassField = new JPasswordField();
        regPassAgainField = new JPasswordField();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //======== panel1 ========
        {

            //---- label1 ----
            label1.setText("Zarejestruj si\u0119");
            label1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));

            //---- label3 ----
            label3.setText("Login:");

            //---- label4 ----
            label4.setText("Has\u0142o:");

            //---- label5 ----
            label5.setText("Powt\u00f3rz has\u0142o:");

            //---- registerButton ----
            registerButton.setText("Zarejestruj");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(label1)
                                .addContainerGap(154, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(registerButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label3)
                            .addComponent(label4)
                            .addComponent(label5))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(regLoginField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(regPassField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regPassAgainField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(regLoginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(regPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(regPassAgainField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(registerButton)
                        .addContainerGap(38, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Arkadiusz Kowalczyk
    private JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JTextField regLoginField;
    private JLabel label4;
    private JLabel label5;
    private JButton registerButton;
    private JPasswordField regPassField;
    private JPasswordField regPassAgainField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
