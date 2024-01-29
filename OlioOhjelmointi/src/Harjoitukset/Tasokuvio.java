package Harjoitukset;

public abstract class Tasokuvio {
	private int leveys;
	private int korkeus;

	public int getLeveys() {
		return leveys;
	}
	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}
	
	public int getKorkeus() {
		return korkeus;
	}
	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
	}
	public abstract double getPintaAla();
}
