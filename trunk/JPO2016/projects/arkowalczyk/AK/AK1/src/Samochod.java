import javax.swing.*;
import java.lang.*;

public class Samochod {
    private String kolor;
    private String nrRejest;
    private String model;
    private String marka;
    private double predkoscMax;

    private Silnik sil;
    private SkrzyniaBiegow skrzynia;
    private Kolo kola;

    public Samochod(String kolor, String nrRejest, String model, String marka, double predkoscMax, Silnik sil, SkrzyniaBiegow skrzynia, Kolo kola) {
        this.kolor = kolor;
        this.nrRejest = nrRejest;
        this.model = model;
        this.marka = marka;
        this.predkoscMax = predkoscMax;
        this.sil = sil;
        this.skrzynia = skrzynia;
        this.kola = kola;
    }

    public void wlacz() {
        sil.uruchom();
    }

    public void wylacz() {
        sil.zatrzymaj();
    }

    public void przyspiesz() {
        sil.zwiekszObroty();
    }

    public void zwolnij() {
        sil.zmniejszObroty();
    }

    public Silnik getSil() {
        return sil;
    }

    public void biegPlus()  {
        skrzynia.zwieszBieg();
    }

    public void biegMinus() {
        skrzynia.zmniejszBieg();
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public void obliczWage() {

    }

    public void aktualnaPredkosc() {

    }

    public static void main(String[] args) {

        Samochod s = new Samochod("srebrny", "KR0001", "punto", "fiat", 190,
                new Silnik("silnik", 250, 1500, "fiat", 6000),
                new SkrzyniaBiegow("skrzynia", 100, 2500, "fiat", 6),
                new Kolo("koło", 10.0, 400.0, "Pirelli", 24));

       /* JFrame frame = new JFrame("SamochodGUI");
        frame.setContentPane(new SamochodGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/

    }
}
