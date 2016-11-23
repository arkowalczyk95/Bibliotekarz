public class Kolo extends Komponent {
    private double srednica;
    private double predkoscLiniowa;
    private double obroty = 0;

    //srednia w m, predkosc liniowa kola v=pi*srednica*obroty/60
//RPM=60*Hz
//pr liniowa w m/s*3,6=km/h
    public Kolo(String nazwa, double waga, double cena, String producent, double srednica) {
        super(nazwa, waga, cena, producent);
        this.srednica = srednica;
    }

    public void ustawObroty() {
        obroty = 7.32; //w Hz
        predkoscLiniowa = (3.6 * 3.14 * srednica * obroty);// w km/h
    }

    public void przyspiesz()    {
        predkoscLiniowa = predkoscLiniowa + 2.0;
    }

    public void zwolnij()   {   predkoscLiniowa = predkoscLiniowa - 2.0;}

    public void setPredkoscLiniowa(double predkoscLiniowa) {
        this.predkoscLiniowa = predkoscLiniowa;
    }

    public double getObroty() {
        return obroty;
    }

    public double getPredkoscLiniowa() {
        return predkoscLiniowa;
    }
}
