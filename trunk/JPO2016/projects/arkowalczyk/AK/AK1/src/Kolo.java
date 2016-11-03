public class Kolo extends Komponent {
    private int srednica;
    private int obroty = 0;

    public Kolo(String nazwa, double waga, double cena, String producent, int srednica) {
        super(nazwa, waga, cena, producent);
        this.srednica = srednica;
    }

    public void ustawObroty() {

    }


}
