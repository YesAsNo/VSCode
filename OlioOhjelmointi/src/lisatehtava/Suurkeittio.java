package lisatehtava;

import java.util.Scanner;

public class Suurkeittio {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiskikone tk1=new Tiskikone();
		lueTiskikone(tk1);
		Tiskikone tk2=new Tiskikone();
		lueTiskikone(tk2);
		tulosta(tk1);
		tulosta(tk2);
		
		Tiskikone tk3=new Tiskikone(103, "Bosch", "Iso", 100);
		tulosta(tk3);
		
	}

	
	private static void lueTiskikone(Tiskikone tiskikone) {
		String s;
		int i = 0;
		boolean done=false;

		do {
			System.out.print("Anna id: ");
			s=sc.nextLine();
			try {
				i=Integer.parseInt(s);
				done=true;
			}
			catch(NumberFormatException e) {
				System.out.println("Anna kokonaisluku!");
				continue;
			}
		}while (!done);

		tiskikone.setId(i);


		do {
			System.out.print("Anna merkki: ");
			s=sc.nextLine();
			if (!(s.length()>=3)) {
				System.out.println("Anna ainakin 3 merkkiä.");
			}

			else {
				break;
			}

		}while (true);
			tiskikone.setMerkki(s);

		do {
			System.out.print("Anna malli: ");
			s=sc.nextLine();

			if (!(s.length()>=3)) {
				System.out.println("Anna ainakin 3 merkkiä.");
			}

			else {
				break;
			}

		}while (true);
		tiskikone.setMalli(s);

		done=false;

		do {
			System.out.print("Anna pesuohjelma: ");
			s=sc.nextLine();
			try {
				i=Integer.parseInt(s);
				done=true;
			}
			catch(NumberFormatException e) {
				System.out.println("Anna kokonaisluku!");
				continue;
			}
		}while (!done);

		tiskikone.setPesuohjelma(i);
	}


	private static void tulosta(Tiskikone tk) {
		System.out.println(tk);
	}


}

