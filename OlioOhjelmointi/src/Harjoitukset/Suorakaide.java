package Harjoitukset;

public class Suorakaide extends Tasokuvio{

	@Override
	public double getPintaAla() {
		return super.getLeveys()*super.getKorkeus();
	}

}
