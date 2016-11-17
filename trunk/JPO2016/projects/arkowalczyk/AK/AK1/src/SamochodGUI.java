import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016-11-03.
 */
public class SamochodGUI {
    public JPanel panel1;
    private JButton zwiększButton;
    private JButton zmniejszButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton zwiększButton1;
    private JButton zmniejszButton1;
    private JButton włączButton;
    private JButton wyłączButton;

    private Samochod samochod;

    public SamochodGUI() {

        Samochod s = new Samochod("srebrny", "KR0001", "punto", "fiat", 190,
                new Silnik("silnik", 250, 1500, "fiat", 6000),
                new SkrzyniaBiegow("skrzynia", 100, 2500, "fiat", 6),
                new Kolo("koło", 10.0, 400.0, "Pirelli", 24));

        włączButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.wlacz();
                textField1.setText(Double.toString(s.getSil().getObroty()));
            }
        });
        wyłączButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.wylacz();
                textField1.setText(Double.toString(s.getSil().getObroty()));
            }
        });
        zwiększButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.przyspiesz();
                textField1.setText(Double.toString(s.getSil().getObroty()));
            }
        });
        zmniejszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.zwolnij();
                textField1.setText(Double.toString(s.getSil().getObroty()));
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


