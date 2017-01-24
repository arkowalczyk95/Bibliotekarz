/*
 * Created by JFormDesigner on Wed Jan 18 19:25:27 CET 2017
 */

package pl.edu.agh.lib.view;


import pl.edu.agh.lib.model.database.EmployeeDatabase;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Arkadiusz Kowalczyk
 */
public class StartWindowGUI extends JPanel {

    private EmployeeDatabase employeeDatabase;
    public StartWindowGUI(EmployeeDatabase employeeDatabase) {
        initComponents();
        this.employeeDatabase = employeeDatabase;
    }


    private void startLoginButtonActionPerformed(ActionEvent e) {
        LoginGUI gui = new LoginGUI(employeeDatabase);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(gui);
        frame.pack();
        frame.setVisible(true);
    }

    private void startRegisterButtonActionPerformed(ActionEvent e) {
        RegisterGUI gui = new RegisterGUI(employeeDatabase);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(gui);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Arkadiusz Kowalczyk
        panel1 = new JPanel();
        label1 = new JLabel();
        startLoginButton = new JButton();
        startRegisterButton = new JButton();

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
            label1.setText("Witaj w pracy!");
            label1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));

            //---- startLoginButton ----
            startLoginButton.setText("Zaloguj si\u0119 ");
            startLoginButton.addActionListener(e -> startLoginButtonActionPerformed(e));

            //---- startRegisterButton ----
            startRegisterButton.setText("Zarejestruj si\u0119");
            startRegisterButton.addActionListener(e -> startRegisterButtonActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(label1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(startLoginButton)
                                    .addComponent(startRegisterButton))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startLoginButton)
                        .addGap(18, 18, 18)
                        .addComponent(startRegisterButton)
                        .addContainerGap(21, Short.MAX_VALUE))
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
    private JButton startLoginButton;
    private JButton startRegisterButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
