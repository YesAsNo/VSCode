package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import tehtava.Kala;

public class listed {
    public static void main(String [] args){

	Scanner sc=new Scanner(System.in);

	ArrayList<Kala> list=new ArrayList<>();
	char addNew='e';
	do{
		Kala k=new Kala();                  // Creates new Kala
		askFishInfo(k, sc);                 // Ask info from keyboard
		list.add(k);                       // Add new entity to the arraylist
		addNew=AddNewFish(sc);     // Asks if user wants to submit more
	}while(addNew=='k');

	printFish(list);
	
//.....jotain koodia mahdollisesti
}


static int fishcount = 1;

public static char AddNewFish(Scanner sc){
	System.out.print("Add new fish? (k/e) ");
	String s=sc.nextLine();
	try{
		return s.charAt(0); //Jos käyttäjä antaa tyhjän, aiheuttaa s.charAt(0) poikkeuksen
	}
	catch(IndexOutOfBoundsException e){
		return 'e';
	}
}

private static void askFishInfo(Kala kala, Scanner sc){
    // Kysyy tiedot käyttäjältä
    
    System.out.println("------ Kalan "+fishcount+++" Tiedot ------");
    System.out.println("Anna Id");
    kala.setId(sc.nextLine());
    System.out.println("Anna Paino");
    kala.setPaino(sc.nextLine());
    System.out.println("Anna Laji");
    kala.setLaji(sc.nextLine());
}

public static void printFish(ArrayList<Kala> list){

	for (Kala kala:list){
	System.out.println("ID = " + kala.getId() + ", Paino = " + kala.getPaino() + ", Laji = " + kala.getLaji());
	}

}
}
