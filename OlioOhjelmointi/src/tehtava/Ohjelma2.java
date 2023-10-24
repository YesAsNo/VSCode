package tehtava;
import java.util.Scanner;
public class Ohjelma2 {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("----Tiskikoneet----");

        Tiskikone t1=new Tiskikone();
        Tiskikone t2=new Tiskikone();

        Scanner in = new Scanner(System.in);

        System.out.println("Lisää tiskikoneen tiedot.");

        System.out.println("ID?");
        t1.setId(in.nextInt());
        in.nextLine();

        System.out.println("Merkki?");
        t1.setMerkki(in.nextLine());

        System.out.println("Malli?");
        t1.setMalli(in.nextLine());

        System.out.println("Pesuohjelma?");
        t1.setPesuohjelma(in.nextLine());

        System.out.println(" ");
        System.out.println("----Tiskikone 1----");
		tulosta(t1);
        System.out.println(" ");

        System.out.println("Lisätäänkö toinen tiskikone? (joo/ei)");

        String Vastaus;

        Vastaus = in.nextLine();

        System.out.println(" ");

        if (Vastaus.equals("joo")) {

            System.out.println("Lisää tiskikoneen tiedot.");

            System.out.println("ID?");
            t2.setId(in.nextInt());
            in.nextLine();

            System.out.println("Merkki?");
            t2.setMerkki(in.nextLine());

            System.out.println("Malli?");
            t2.setMalli(in.nextLine());

            System.out.println("Pesuohjelma?");
            t2.setPesuohjelma(in.nextLine());

            System.out.println(" ");
            System.out.println("Tiivistelmä");
            System.out.println(" ");
            System.out.println("----Tiskikone 1----");
            tulosta(t1);
            System.out.println(" ");
            System.out.println("----Tiskikone 2----");
            tulosta(t2);
            System.out.println(" ");

        }

        else if (Vastaus.equals("ei"))
        {
            System.out.println(" ");
            System.out.println("Toista tiskikonetta ei lisätty");
            System.out.println("Tiivistelmä");
            System.out.println(" ");
            System.out.println("----Tiskikone 1----");
            tulosta(t1);
            System.out.println(" ");
        }

        else
        {
            System.out.println("Vastaus jotain muuta. Yritä uudelleen");
        }

        in.close();

    }
	private static void tulosta(Tiskikone Tiskikone) {
		System.out.println("ID = "+Tiskikone.getId());
		System.out.println("MERKKI = "+Tiskikone.getMerkki());
		System.out.println("MALLI = "+Tiskikone.getMalli());
		System.out.println("PESUOHJELMA = "+Tiskikone.getPesuohjelma());
	}
}


