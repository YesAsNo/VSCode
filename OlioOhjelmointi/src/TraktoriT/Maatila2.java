package TraktoriT;

import java.util.Scanner;

public class Maatila2 {

    static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traktori [] taulu=new Traktori[3];

        for (int i=0; i<3; i++){
            taulu[i]=lueTraktorit();
        }

		// PRINT TRACTORS!!!!
        for (int i=0; i<3; i++){
		tulostaTraktori(taulu[i]);
        }
	}
    
    // READ TRACTORS!!!!!
	private static Traktori lueTraktorit() {
		String s;
        int id;
        String merkki;
        String malli;
        int teho;

            for (;;){
			System.out.print("Anna id: ");
		    s=sc.nextLine();
            if (!Traktori.checkId(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                id = Integer.parseInt(s);
                break;
            }
        }

            for (;;){
			System.out.print("Anna merkki: ");
		    s=sc.nextLine();
            if (!Traktori.checkMerkkiMalli(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                merkki = s;
                break;
            }
        }

			for (;;){
			System.out.print("Anna malli: ");
		    s=sc.nextLine();
            if (!Traktori.checkMerkkiMalli(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                malli = s;
                break;
            }
        }

			for (;;){
			System.out.print("Anna teho: ");
		    s=sc.nextLine();
            if (!Traktori.checkTeho(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                teho = Integer.parseInt(s);
                break;
            }
        }
        return new Traktori(id, merkki, malli, teho);
	}

	public static void tulostaTraktori(Traktori taulu) {
		System.out.println(taulu.toString());
	}

}
