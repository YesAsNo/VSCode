package koe;

public class Lumikola {
    private String merkki;
    private int paino;
    private int leveys;

    public Lumikola (){}

    public Lumikola (int paino, int leveys, String merkki) {
        this.merkki = merkki;
        this.paino = paino;
        this.leveys = leveys;
    }
    
        public Lumikola (int paino, int leveys) {
        this.paino = paino;
        this.leveys = leveys;
        this.merkki = "None";
    }

        public Lumikola (int leveys, String merkki) {
        this.merkki = merkki;
        this.paino = 0;
        this.leveys = leveys;
    }

        public Lumikola (String merkki, int paino, int leveys) {
        this.paino = paino;
        this.leveys = leveys;
        this.merkki = merkki;
    }

        public Lumikola (String merkki, String paino, String leveys) {
        this.paino = (Integer.parseInt(paino));
        this.leveys = (Integer.parseInt(leveys));
        this.merkki = merkki;
    }

    public String getMerkki() {
        return merkki;
    }
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

        public int getPaino() {
        return paino;
    }
    public void setPaino(int paino) {
        this.paino = paino;
    }

        public int getLeveys() {
        return leveys;
    }
    public void setLeveys(int leveys) {
        this.leveys = leveys;
    }
}
