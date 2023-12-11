package Harjoitukset;

public class Leipa {

    private int id;
    private String tyyppi;
    private int hinta;
    private String valmistusaineet;

    public Leipa (){}

    public Leipa (int id, String tyyppi, int hinta, String valmistusaineet) {
        this.id = id;
        this.tyyppi = tyyppi;
        this.hinta = hinta;
        this.valmistusaineet = valmistusaineet;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTyyppi() {
        return tyyppi;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public int getHinta() {
        return hinta;
    }
    public void setHinta(int hinta) {
        this.hinta = hinta;
    }

    public String getValmistusaineet() {
        return valmistusaineet;
    }
    public void setValmistusaineet(String valmistusaineet) {
        this.valmistusaineet = valmistusaineet;
    }
}
