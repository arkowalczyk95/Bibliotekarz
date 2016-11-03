public abstract class Komponent {

    private String nazwa;
    private double waga;
    private double cena;
    private String producent;

    public Komponent(String nazwa, double waga, double cena, String producent) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
        this.producent = producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public double getCena() {
        return cena;
    }

    public String getProducent() {
        return producent;
    }
}

