import javax.swing.*;
import java.lang.*;
import java.util.Random;

public class Samochod extends Thread implements Observable  {
    private String kolor;
    private String nrRejest;
    private String model;
    private String marka;
    private double predkoscMax;

    Listener listener  = new Listener();

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

    public void run() {
        Random r = new Random();
        double obroty = sil.getObroty();
        while (true) {
            try {
                sil.zwiekszObroty(8* r.nextDouble() - 5);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //
            }
            System.out.print(".");
        }

    }

    @Override
    public void subscribe(Listener l) {
        listener = l;
    }

    @Override
    public void unsubscribe(Listener l) {

    }


    public void wlacz() {
        sil.uruchom();
    }

    public void wylacz() {
        sil.zatrzymaj();
    }

    public void przyspiesz() {
        skrzynia.obliczPrzelozenie();
        double przelozenie = skrzynia.getAktualnePrzelozenie();

        sil.zwiekszObroty(150.0);
        double obroty = sil.getObroty();
        double stala = 0.0006;
        double przyspieszenie = przelozenie * obroty * stala;
        if ((kola.getPredkoscLiniowa() < predkoscMax) & (sil.isPar() == false))
            kola.setPredkoscLiniowa(kola.getPredkoscLiniowa() + przyspieszenie);

    }

    public void zwolnij() {
        skrzynia.obliczPrzelozenie();
        double przelozenie = skrzynia.getAktualnePrzelozenie();
        sil.zmniejszObroty(150.0);
        double obroty = sil.getObroty();
        double stala = 0.0006;
        double przyspieszenie = przelozenie * obroty * stala;
        if ((kola.getPredkoscLiniowa() > 0.0) & (sil.isPar2() == false))
            kola.setPredkoscLiniowa(kola.getPredkoscLiniowa() - przyspieszenie);
        if (kola.getPredkoscLiniowa() < 0.0) kola.setPredkoscLiniowa(0.0);

    }

    public Silnik getSil() {
        return sil;
    }

    public void biegPlus() {
        skrzynia.zwieszBieg();
        sil.spadekObrotow();
    }

    public void biegMinus() {
        skrzynia.zmniejszBieg();
        sil.wzrostObrotow();
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public void obliczWage() {
    }

    public void aktualnaPredkosc() {
        kola.ustawObroty();
    }

    public Kolo getKola() {
        return kola;
    }

    public static void main(String[] args) {

        Samochod s = new Samochod("srebrny", "KR0001", "punto", "fiat", 190,
                new Silnik("silnik", 250, 1500, "fiat", 6000),
                new SkrzyniaBiegow("skrzynia", 100, 2500, "fiat", 5),
                new Kolo("koło", 10.0, 400.0, "Pirelli", 24));

        JFrame frame = new JFrame("SamochodGUI");
        frame.setContentPane(new SamochodGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
