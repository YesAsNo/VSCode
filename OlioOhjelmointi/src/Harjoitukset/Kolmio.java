package Harjoitukset;

public class Kolmio extends Tasokuvio {

	@Override
	public double getPintaAla() {
		return super.getLeveys()*super.getKorkeus()/2;
	}
}
