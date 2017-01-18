/*
 * Created by JFormDesigner on Wed Jan 11 23:48:07 CET 2017
 */

package pl.edu.agh.lib.view;

import java.awt.*;

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
        this.userDatabase = userDatabase;
        this.componentDatabase = componentDatabase;
        this.loanedController = new LoanedController(this.componentDatabase);
        loanButton.addActionListener(new LoanController(this, this.userDatabase, this.componentDatabase));
        returnButton.addActionListener(new ReturnController(this, this.userDatabase, this.componentDatabase));
        returnUserComboBox.addActionListener(new OwnController(this, this.userDatabase, this.componentDatabase));
        addUserButton.addActionListener(new AddUserController(this, this.userDatabase));
        addBookButton.addActionListener(new AddBookController(this, this.componentDatabase));
        deleteBookButton.addActionListener(new DeleteBookController(this, this.componentDatabase));
        deleteUserButton.addActionListener(new DeleteUserController(this, this.userDatabase));
        initComboBoxes();
    }

    //Metody obsługi wypożyczeń i zwrotów
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

    public User getSelectedUserInDelete()   {return (User) deleteUserComboBox.getSelectedItem();}

    public Component getSelectedBookInDelete()   {return (Component) deleteBookComboBox.getSelectedItem();}

    public void setReturnBookModel(List<Component> owned) {
        returnBookComboBox.setModel(new DefaultComboBoxModel<>(owned.toArray()));
    }

    public void initComboBoxes() {
        loanUserComboBox.setModel(new DefaultComboBoxModel<>(userDatabase.getUserList().toArray()));
        loanBookComboBox.setModel(new DefaultComboBoxModel<>(loanedController.getAvailableComponents().toArray()));
        returnUserComboBox.setModel(new DefaultComboBoxModel<>(userDatabase.getUserList().toArray()));
        deleteUserComboBox.setModel(new DefaultComboBoxModel<>(userDatabase.getUserList().toArray()));
        deleteBookComboBox.setModel(new DefaultComboBoxModel<>(componentDatabase.getDatabase().toArray()));
    }

    //Metody dodawania userów
    public JTextField getUserIdTextField() {
        return userIdTextField;
    }

    public JTextField getUserNameTextField() {
        return userNameTextField;
    }

    public JTextField getUserSurnameTextField() {
        return userSurnameTextField;
    }

    //Metody dodawania userów i książek
    public JTextField getBookIdTextField() {
        return bookIdTextField;
    }

    public JTextField getBookAuthorTextField() {
        return bookAuthorTextField;
    }

    public JTextField getBookTitleTextField() {
        return bookTitleTextField;
    }

    public void eraseTextFields()   {
        userIdTextField.setText("");
        userNameTextField.setText("");
        userSurnameTextField.setText("");
        bookIdTextField.setText("");
        bookAuthorTextField.setText("");
        bookTitleTextField.setText("");
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
        loanBookComboBox = new JComboBox();
        loanUserComboBox = new JComboBox();
        panel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        returnButton = new JButton();
        returnUserComboBox = new JComboBox();
        returnBookComboBox = new JComboBox();
        panel3 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        userIdTextField = new JTextField();
        userNameTextField = new JTextField();
        userSurnameTextField = new JTextField();
        addUserButton = new JButton();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        bookIdTextField = new JTextField();
        bookAuthorTextField = new JTextField();
        bookTitleTextField = new JTextField();
        addBookButton = new JButton();
        panel4 = new JPanel();
        label14 = new JLabel();
        deleteBookComboBox = new JComboBox();
        label15 = new JLabel();
        deleteUserComboBox = new JComboBox();
        deleteBookButton = new JButton();
        deleteUserButton = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- label1 ----
        label1.setText("SYSTEM OBS\u0141UGI BIBLIOTEKI PUBLICZNEJ");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {

                //---- label2 ----
                label2.setText("Wybierz dost\u0119pn\u0105 ksi\u0105\u017ck\u0119:");

                //---- label3 ----
                label3.setText("Wybierz u\u017cytkownika:");

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
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(198, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(loanUserComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(loanBookComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
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
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(loanUserComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
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
                label4.setText("Wybierz u\u017cytkownika:");

                //---- label5 ----
                label5.setText("Wybierz ksi\u0105\u017ck\u0119 do zwrotu:");

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
                                .addComponent(returnUserComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addComponent(returnBookComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 232, Short.MAX_VALUE)))
                            .addContainerGap())
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

            //======== panel3 ========
            {

                //---- label6 ----
                label6.setText("Dodaj u\u017cytkownika:");

                //---- label7 ----
                label7.setText("- ID:");

                //---- label8 ----
                label8.setText("- Imi\u0119:");

                //---- label9 ----
                label9.setText("- Nazwisko:");

                //---- addUserButton ----
                addUserButton.setText("Dodaj!");

                //---- label10 ----
                label10.setText("Dodaj ksi\u0105\u017ck\u0119:");

                //---- label11 ----
                label11.setText("- ID:");

                //---- label12 ----
                label12.setText("- Autor:");

                //---- label13 ----
                label13.setText("- Tytu\u0142:");

                //---- addBookButton ----
                addBookButton.setText("Dodaj!");

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel3Layout.createParallelGroup()
                                .addComponent(label6)
                                .addComponent(label10)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(panel3Layout.createParallelGroup()
                                        .addComponent(label8)
                                        .addComponent(label11)
                                        .addComponent(label12)
                                        .addComponent(label13)
                                        .addComponent(label7)
                                        .addComponent(label9))
                                    .addGap(35, 35, 35)
                                    .addGroup(panel3Layout.createParallelGroup()
                                        .addGroup(panel3Layout.createSequentialGroup()
                                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(bookTitleTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(bookAuthorTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(bookIdTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(userNameTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(userSurnameTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                            .addGap(50, 50, 50)
                                            .addGroup(panel3Layout.createParallelGroup()
                                                .addComponent(addUserButton)
                                                .addComponent(addBookButton)))
                                        .addComponent(userIdTextField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(59, Short.MAX_VALUE))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7)
                                .addComponent(userIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label8)
                                .addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(addUserButton))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(userSurnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9))
                            .addGap(48, 48, 48)
                            .addComponent(label10)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label11)
                                .addComponent(bookIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(bookAuthorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label12)
                                .addComponent(addBookButton))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addComponent(bookTitleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label13))
                            .addContainerGap(16, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("DODAJ ELEMENT", panel3);

            //======== panel4 ========
            {

                //---- label14 ----
                label14.setText("Wybierz dost\u0119pn\u0105 ksi\u0105\u017ck\u0119:");

                //---- label15 ----
                label15.setText("Wybierz u\u017cytkownika:");

                //---- deleteBookButton ----
                deleteBookButton.setText("Usu\u0144 ksi\u0105\u017ck\u0119!");

                //---- deleteUserButton ----
                deleteUserButton.setText("Usu\u0144 u\u017cytkownika!");

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(GroupLayout.Alignment.LEADING, panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(deleteBookButton)
                                            .addGap(67, 67, 67)
                                            .addComponent(deleteUserButton)))
                                    .addGap(0, 84, Short.MAX_VALUE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(deleteUserComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel4Layout.createSequentialGroup()
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(deleteBookComboBox, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))))
                            .addContainerGap())
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label14)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteBookComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(label15)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteUserComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteBookButton)
                                .addComponent(deleteUserButton))
                            .addContainerGap(70, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("USU\u0143 ELEMENT", panel4);
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
    private JComboBox loanBookComboBox;
    private JComboBox loanUserComboBox;
    private JPanel panel2;
    private JLabel label4;
    private JLabel label5;
    private JButton returnButton;
    private JComboBox returnUserComboBox;
    private JComboBox returnBookComboBox;
    private JPanel panel3;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField userIdTextField;
    private JTextField userNameTextField;
    private JTextField userSurnameTextField;
    private JButton addUserButton;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JTextField bookIdTextField;
    private JTextField bookAuthorTextField;
    private JTextField bookTitleTextField;
    private JButton addBookButton;
    private JPanel panel4;
    private JLabel label14;
    private JComboBox deleteBookComboBox;
    private JLabel label15;
    private JComboBox deleteUserComboBox;
    private JButton deleteBookButton;
    private JButton deleteUserButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
