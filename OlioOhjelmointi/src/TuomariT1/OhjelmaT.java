package TuomariT1;

public class OhjelmaT {
    public static void main(String[] args) throws Exception {

        Tuomari t1=new Tuomari();
        t1.setId(13);
        t1.setNimi("Matti");
        t1.setMaa("Suomi");

        int tuomariid=23;
        String tuomarinimi="Viktor";
        String tuomarimaa="Venäjä";
        Tuomari t2=new Tuomari(tuomariid, tuomarinimi, tuomarimaa);

        tulosta(t1);
        tulosta(t2);
}

	private static void tulosta(Tuomari Tuomari) {
        System.out.println("---- Tuomarin tiedot ----");
		System.out.println("ID = "+Tuomari.getId());
		System.out.println("NIMI = "+Tuomari.getNimi());
		System.out.println("MAA = "+Tuomari.getMaa());
	}
}
