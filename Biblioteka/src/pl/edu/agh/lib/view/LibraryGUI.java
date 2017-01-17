/*
 * Created by JFormDesigner on Wed Jan 11 23:48:07 CET 2017
 */

package pl.edu.agh.lib.view;

import pl.edu.agh.lib.controller.*;
import pl.edu.agh.lib.model.Component;
import pl.edu.agh.lib.model.User;
import pl.edu.agh.lib.model.database.ComponentDatabase;
import pl.edu.agh.lib.model.database.UserDatabase;

import javax.swing.*;
import javax.swing.GroupLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arkadiusz Kowalczyk
 */
public class LibraryGUI extends JPanel {
    private UserDatabase userDatabase;
    private ComponentDatabase componentDatabase;
    private LoanedController loanedController;

    public LibraryGUI(UserDatabase userDatabase, ComponentDatabase componentDatabase) {
        initComponents();
        loanButton.addActionListener(new LoanController(this, this.userDatabase, this.componentDatabase));
        returnButton.addActionListener(new ReturnController(this, this.userDatabase, this.componentDatabase));
        returnUserComboBox.addActionListener(new OwnController(this, this.userDatabase, this.componentDatabase));
        this.userDatabase = userDatabase;
        this.componentDatabase = componentDatabase;
        this.loanedController = new LoanedController(this.componentDatabase);
        initComboBoxes();
    }

    public Component getSelectedBookInLoan() {
        return (Component) loanBookComboBox.getSelectedItem();
    }

    public User getSelectedUserInLoan() {
        return (User) loanUserComboBox.getSelectedItem();
    }

    public User getSelectedUserInReturn() {
        return (User) returnUserComboBox.getSelectedItem();
    }

    public Component getSelectedBookInReturn() {
        return (Component) returnBookComboBox.getSelectedItem();
    }

    public void setReturnUserModel(List<User> owners){
        returnUserComboBox.setModel(new DefaultComboBoxModel<>(owners.toArray()));
    }
    public void setReturnBookModel(List<Component> owned) {
        returnBookComboBox.setModel(new DefaultComboBoxModel<>(owned.toArray()));
    }


    public void initComboBoxes() {
        loanUserComboBox.setModel(new DefaultComboBoxModel<>(userDatabase.getUserList().toArray()));
        loanBookComboBox.setModel(new DefaultComboBoxModel<>(loanedController.getAvailableComponents().toArray()));
        returnUserComboBox.setModel(new DefaultComboBoxModel<>(userDatabase.getUserList().toArray()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Arkadiusz Kowalczyk
        label1 = new JLabel();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        label2 = new JLabel();
        label3 = new JLabel();
        loanButton = new JButton();
        loanBookComboBox = new JComboBox<>();
        loanUserComboBox = new JComboBox<>();
        panel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        returnButton = new JButton();
        returnUserComboBox = new JComboBox<>();
        returnBookComboBox = new JComboBox<>();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });


        //---- label1 ----
        label1.setText("LIBRARY");

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {

                //---- label2 ----
                label2.setText("Lista ksi\u0105\u017cek w blibliotece");

                //---- label3 ----
                label3.setText("Lista u\u017cytkownik\u00f3w");

                //---- loanButton ----
                loanButton.setText("Wypo\u017cycz!");

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 236, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addContainerGap(140, Short.MAX_VALUE)
                                        .addComponent(loanButton)
                                        .addGap(185, 185, 185))
                                .addGroup(panel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(loanBookComboBox, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                        .addGroup(panel1Layout.createParallelGroup()
                                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                                        .addContainerGap(257, Short.MAX_VALUE))))
                                .addGroup(panel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(loanUserComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                        .addContainerGap())
                );
                panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(loanBookComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(label3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(loanUserComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(loanButton)
                                        .addGap(628, 628, 628)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("WYPO\u017bYCZENIA", panel1);

            //======== panel2 ========
            {

                //---- label4 ----
                label4.setText("U\u017cytkownicy");

                //---- label5 ----
                label5.setText("Wypo\u017cyczone ksi\u0105\u017cki");

                //---- returnButton ----
                returnButton.setText("Zwr\u00f3\u0107!");

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addContainerGap(162, Short.MAX_VALUE)
                                        .addComponent(returnButton)
                                        .addGap(183, 183, 183))
                                .addGroup(panel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel2Layout.createParallelGroup()
                                                .addGroup(panel2Layout.createSequentialGroup()
                                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 279, Short.MAX_VALUE))
                                                .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGroup(panel2Layout.createParallelGroup()
                                                                .addComponent(returnUserComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                                                .addGroup(panel2Layout.createSequentialGroup()
                                                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 299, Short.MAX_VALUE))
                                                                .addComponent(returnBookComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                                                        .addContainerGap())))
                );
                panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnUserComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(label5)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnBookComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(returnButton)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("ZWROTY", panel2);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(tabbedPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(label1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Arkadiusz Kowalczyk
    private JLabel label1;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JLabel label2;
    private JLabel label3;
    private JButton loanButton;
    private JComboBox<Object> loanBookComboBox;
    private JComboBox<Object> loanUserComboBox;
    private JPanel panel2;
    private JLabel label4;
    private JLabel label5;
    private JButton returnButton;
    private JComboBox<Object> returnUserComboBox;
    private JComboBox<Object> returnBookComboBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
