public class Silnik extends Komponent {
    private double maxObroty;
    private double obroty = 0;

    public Silnik(String nazwa, double waga, double cena, String producent, double maxObroty) {
        super(nazwa, waga, cena, producent);
        this.maxObroty = maxObroty;
    }

    public void uruchom() {
        obroty = 800; //bieg jałowy
        System.out.println("silnik uruchomiony.");
        System.out.println("obroty = " + obroty);
    }

    public void zatrzymaj() {
        obroty = 0; //stop
        System.out.println("silnik zatrzymany.");
        System.out.println("obroty = " + obroty);
    }

    public void zwiekszObroty() {
        obroty = obroty + 100;
        if (obroty > maxObroty) obroty = maxObroty;
        System.out.println("obroty = " + obroty);
    }

    public void zmniejszObroty() {
        obroty = obroty - 100;
        if (obroty < 800) obroty = 800;
        System.out.println("obroty = " + obroty);
    }

    public double getObroty() {
        return obroty;
    }
}