package koe;
import java.util.ArrayList;
import java.io.*;

public class Program {
    public static void main(String[] args) {
        // Kutsutaan metodia
		tallennaOlio();
	}

    // Tallennus metodi
	private static void tallennaOlio() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("kynatdsto.txt");
			oos=new ObjectOutputStream(fos);

            // Luodaan lista
			
			ArrayList<LyijyKyna> lista=new ArrayList<>();

		    LyijyKyna k1=new LyijyKyna();
            k1.setHinta(32);
            k1.setVari("Punainen");
            k1.setKovuus("HB");
            lista.add(k1); 
    
            LyijyKyna k2=new LyijyKyna();
            k2.setHinta(4);
            k2.setVari("Keltainen");
            k2.setKovuus("B2");
            lista.add(k2);

            // Tehdaan siita tiedosto

			oos.writeObject(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
