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
        switch (aktualnyBieg) {
            case 0:
                aktualnePrzelozenie = 0.0;
                break;
            case 1:
                aktualnePrzelozenie = 2.2;
                break;
            case 2:
                aktualnePrzelozenie = 1.7;
                break;
            case 3:
                aktualnePrzelozenie = 1.2;
                break;
            case 4:
                aktualnePrzelozenie = 0.9;
                break;
            case 5:
                aktualnePrzelozenie = 0.7;
                break;
        }
    }

    public double getAktualnePrzelozenie() {
        return aktualnePrzelozenie;
    }
}
