public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg = 0;
    private int iloscBiegow;
    private double aktualnePrzelozenie;

    public SkrzyniaBiegow(String nazwa, double waga, double cena, String producent, int iloscBiegow) {
        super(nazwa, waga, cena, producent);
        this.iloscBiegow = iloscBiegow;
    }

    public void zwieszBieg() {
        aktualnyBieg = aktualnyBieg + 1;
        if (aktualnyBieg > iloscBiegow) aktualnyBieg = iloscBiegow;
    }

    public void zmniejszBieg() {
        aktualnyBieg = aktualnyBieg - 1;
        if (aktualnyBieg < 0) aktualnyBieg = 0;
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public void setAktualnyBieg(int aktualnyBieg) {
        this.aktualnyBieg = aktualnyBieg;
    }

    public void obliczPrzelozenie() {

    }
}
