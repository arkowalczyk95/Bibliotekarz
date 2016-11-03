import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016-11-03.
 */
public class SamochodGUI {
    private JPanel panel1;
    private JButton zwiększButton;
    private JButton zmniejszButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton zwiększButton1;
    private JButton zmniejszButton1;
    private JButton włączButton;
    private JButton wyłączButton;

    public SamochodGUI() {
        włączButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Klik klak Włącz!");
                textField1.setText("Ruszam");
                textField2.setText("Jałowy");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SamochodGUI");
        frame.setContentPane(new SamochodGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

