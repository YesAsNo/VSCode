package lisatehtava;

public class Tiskikone {
	private int id;
	private String merkki;
	private String malli;
	private int pesuohjelma;
	
	public Tiskikone() {}
	
	public Tiskikone(int id, String merkki, String malli, int po) {
		this.id=id;
		this.merkki=merkki;
		this.malli=malli;
		this.pesuohjelma=po;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMerkki() {
		return merkki;
	}
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	public String getMalli() {
		return malli;
	}
	public void setMalli(String malli) {
		this.malli = malli;
	}
	public int getPesuohjelma() {
		return pesuohjelma;
	}
	public void setPesuohjelma(int pesuohjelma) {
		this.pesuohjelma = pesuohjelma;
	}

	@Override
	public String toString() {
		return "Tiskikone [id=" + id + ", merkki=" + merkki + ", malli=" + malli + ", pesuohjelma=" + pesuohjelma + "]";
	}
}
