package tehtava;
import java.util.Scanner;

public class KalaTaulu {

	public static void main(String[] args) {
		// Luo taulun johon mahtuu 3 kalaa
        Kala [] taulu=new Kala[3];
        Scanner in = new Scanner(System.in);

        for (int i=0;i<taulu.length;i++){
            taulu[i]=new Kala();
            lueKalanTiedot(taulu[i], in);
        }

        tulostaKalat(taulu);
        in.close();
	}

    private static int kalacount = 1;

	private static void tulostaKalat(Kala[] taulu) {
		for (int i=0;i<taulu.length;i++) {
			System.out.println(taulu[i]);
		}
    }

    private static void lueKalanTiedot(Kala taulu, Scanner in){
        // Kysyy tiedot käyttäjältä
        
        System.out.println("------ Kalan "+kalacount+++" Tiedot ------");
        System.out.println("Anna Id");
		taulu.setId(in.nextLine());
        System.out.println("Anna Paino");
		taulu.setPaino(in.nextLine());
        System.out.println("Anna Laji");
		taulu.setLaji(in.nextLine());
}
}