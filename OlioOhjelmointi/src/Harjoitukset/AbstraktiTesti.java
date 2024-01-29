package Harjoitukset;

public class AbstraktiTesti {

	public static void main(String[] args) {
		
		Tasokuvio kolmio=new Kolmio();
		kolmio.setKorkeus(3);
		kolmio.setLeveys(4);
		
		Tasokuvio suoraKaide=new Suorakaide();
		suoraKaide.setKorkeus(5);
		suoraKaide.setLeveys(6);

        Tasokuvio ellipsi=new Ellipsi();
        ellipsi.setKorkeus(4);
        ellipsi.setLeveys(3);
		
		System.out.println("Kolmion pinta-ala="+kolmio.getPintaAla());
		System.out.println("Suorakaiteen pinta-ala="+suoraKaide.getPintaAla());
        System.out.println("Ellipsin pinta-ala="+ellipsi.getPintaAla());
	}

}
