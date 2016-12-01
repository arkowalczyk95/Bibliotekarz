import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016-11-03.
 */
public class SamochodGUI implements Listener {
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

    public SamochodGUI() {

        final Samochod s = new Samochod("srebrny", "KR0001", "punto", "fiat", 190,
                new Silnik("silnik", 250, 1500, "fiat", 6000),
                new SkrzyniaBiegow("skrzynia", 100, 2500, "fiat", 5),
                new Kolo("koło", 10.0, 400.0, "Pirelli", 0.6));

        włączButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.wlacz();
                textField1.setText(Double.toString(s.getSil().getObroty()));
                s.getSkrzynia().setAktualnyBieg(0);
                textField2.setText(Integer.toString(s.getSkrzynia().getAktualnyBieg()));
                s.getKola().setPredkoscLiniowa(0.0);
                textField3.setText(Double.toString(s.getKola().getPredkoscLiniowa()));
            }
        });
        wyłączButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.wylacz();
                textField1.setText(Double.toString(s.getSil().getObroty()));
                s.getSkrzynia().setAktualnyBieg(0);
                textField2.setText(Integer.toString(s.getSkrzynia().getAktualnyBieg()));
                s.getKola().setPredkoscLiniowa(0.0);
                textField3.setText(Double.toString(s.getKola().getPredkoscLiniowa()));
            }
        });
        zwiększButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.przyspiesz();
                textField1.setText(Double.toString(s.getSil().getObroty()));
                textField3.setText(Double.toString(s.getKola().getPredkoscLiniowa()));
            }
        });
        zmniejszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.zwolnij();
                textField1.setText(Double.toString(s.getSil().getObroty()));
                textField3.setText(Double.toString(s.getKola().getPredkoscLiniowa()));
            }
        });

        zwiększButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.biegPlus();
                textField2.setText(Integer.toString(s.getSkrzynia().getAktualnyBieg()));
                textField1.setText(Double.toString(s.getSil().getObroty()));
            }
        });
        zmniejszButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s.biegMinus();
                textField2.setText(Integer.toString(s.getSkrzynia().getAktualnyBieg()));
                textField1.setText(Double.toString(s.getSil().getObroty()));

            }
        });
        s.start();
    }

    public void zmiana()    {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SamochodGUI");
        frame.setContentPane(new SamochodGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


