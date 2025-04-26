public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxMiejsc;
    private int dostMiejsc;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        setNazwa(nazwa);
        setCena(cena);
        miejsce = "Online";
        maxMiejsc = 100;
        dostMiejsc = 0;
        data = "01.01.2000";

    }
    public Wydarzenie(String nazwa, double cena, String data) {
        setNazwa(nazwa);
        setCena(cena);
        setData(data);
        miejsce = "Online";
        maxMiejsc = 100;
        dostMiejsc = 0;

    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        setNazwa(nazwa);
        setCena(cena);
        setData(data);
        setMiejsce(miejsce);
        maxMiejsc = 100;
        dostMiejsc = 0;

    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxMiejsc() {
        return maxMiejsc;
    }
    public void setMaxMiejsc(int maxMiejsc) {
        this.maxMiejsc = maxMiejsc;
    }

    public int getDostMiejsc() {
        return dostMiejsc;
    }
    public void setDostMiejsc(int dostMiejsc) {
        this.dostMiejsc = dostMiejsc;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString() {
        return "Wydarzenie{" +
                "nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", miejsce='" + miejsce + '\'' +
                ", maxMiejsc=" + maxMiejsc +
                ", dostMiejsc=" + dostMiejsc +
                ", cena=" + cena +
                '}';
    }

    public void zarezerwujMiejsce() {
        dostMiejsc--;
    }

}
