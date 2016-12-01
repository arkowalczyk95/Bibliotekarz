public class Silnik extends Komponent {
    private double maxObroty;
    private double obroty = 0;
    private boolean par;
    private boolean par2;

    public Silnik(String nazwa, double waga, double cena, String producent, double maxObroty) {
        super(nazwa, waga, cena, producent);
        this.maxObroty = maxObroty;
    }

    public void uruchom() {
        obroty = 800; //bieg jałowy
        System.out.println("silnik uruchomiony.");
        //System.out.println("obroty = " + obroty);
    }

    public void zatrzymaj() {
        obroty = 0; //stop
        System.out.println("silnik zatrzymany.");
        //System.out.println("obroty = " + obroty);
    }

    public double zwiekszObroty(double n) {
        obroty = obroty + n;
        if (obroty > maxObroty) {
            obroty = maxObroty;
            par = true;
        }
        return obroty;
        //System.out.println("obroty = " + obroty);
    }

    public double zmniejszObroty(double m) {
        obroty = obroty - m;
        if (obroty < 800) {
            obroty = 800;
            par2 = true;
        }
        return obroty;
        //System.out.println("obroty = " + obroty);
    }

    public void spadekObrotow() {
        obroty = 800;
    }

    public void wzrostObrotow() {
        obroty = obroty + 500;
    }

    public void setObroty(double obroty) {
        this.obroty = obroty;
    }

    public double getObroty() {
        return obroty;
    }

    public boolean isPar2() {
        return par2;
    }

    public boolean isPar() {
        return par;
    }
}