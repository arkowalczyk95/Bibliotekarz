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

    }

    public void wylacz() {

    }

    public void jazda() {

    }

    public void obliczWage() {

    }

    public void aktualnaPredkosc() {

    }

    public static void main(String[] args) {
        Samochod s = new Samochod("srebrny", "KR0001", "punto", "fiat", 190,
                new Silnik("silnik", 250, 1500, "fiat", 6000),
                new SkrzyniaBiegow("skrzynia", 100, 2500, "fiat", 7),
                new Kolo("koło", 10.0, 400.0, "Pirelli", 24));

        Samochod s2 = new Samochod("biały", "KRA007", "vectra", "opel", 260,
                new Silnik("silnik2", 300, 3000, "opel", 7000),
                new SkrzyniaBiegow("skrzynia2", 150, 4000, "opel", 7),
                new Kolo("koło2", 12, 500, "Debica", 26));
    }
}
