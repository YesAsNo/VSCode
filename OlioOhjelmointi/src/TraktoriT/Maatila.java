package TraktoriT;

import java.util.Scanner;

public class Maatila {

    static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traktori [] taulu=new Traktori[3];

        for (int i=0; i<3; i++){
            taulu[i]=new Traktori();
            lueTraktorit(taulu[i]);
        }

		// PRINT TRACTORS!!!!
        for (int i=0; i<3; i++){
		tulostaTraktori(taulu[i]);
        }
	}
    
    // READ TRACTORS!!!!!
	private static void lueTraktorit(Traktori traktori) {
		String s;

            for (;;){
			System.out.print("Anna id: ");
		    s=sc.nextLine();
            if (!traktori.setId(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                break;
            }
        }

            for (;;){
			System.out.print("Anna merkki: ");
		    s=sc.nextLine();
            if (!traktori.setMerkki(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                break;
            }
        }

			for (;;){
			System.out.print("Anna malli: ");
		    s=sc.nextLine();
            if (!traktori.setMalli(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                break;
            }
        }

			for (;;){
			System.out.print("Anna teho: ");
		    s=sc.nextLine();
            if (!traktori.setTeho(s)) {
            System.out.println("Pystyt parempaan!!!");
            }
            else {
                break;
            }
        }
	}

	public static void tulostaTraktori(Traktori taulu) {
		System.out.println(taulu.toString());
	}

}
