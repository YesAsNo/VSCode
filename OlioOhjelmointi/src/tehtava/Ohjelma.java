package tehtava;

public class Ohjelma {
    
    public static void main(String[] args) throws Exception {

        System.out.println("Etsitään tiskikoneiden tiedot...");
        System.out.println();

        Tiskikone t1=new Tiskikone();
        Tiskikone t2=new Tiskikone();

        t1.setId(13);
        t1.setMerkki("HamkTiskit Oy");
        t1.setMalli("RP2304");
        t1.setPesuohjelma("Hellävarainen Ohjelma");

        t2.setId(15);
        t2.setMerkki("Tähtikone");
        t2.setMalli("HyperWash 342");
        t2.setPesuohjelma("Hyper Ohjelma");

        System.out.println("----Tiskikone 1----");
		tulosta(t1);

        System.out.println();

        System.out.println("----Tiskikone 2----");
		tulosta(t2);
    }

	private static void tulosta(Tiskikone Tiskikone) {
		System.out.println("ID = "+Tiskikone.getId());
		System.out.println("MERKKI = "+Tiskikone.getMerkki());
		System.out.println("MALLI = "+Tiskikone.getMalli());
		System.out.println("PESUOHJELMA = "+Tiskikone.getPesuohjelma());
	}
}