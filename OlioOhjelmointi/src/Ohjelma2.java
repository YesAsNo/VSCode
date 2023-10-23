import java.util.Scanner;
public class Ohjelma2 {
    
    public static void main(String[] args) throws Exception {

        System.out.println("Tiskikoneet");

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

        System.out.println("Tiskikoneen 1 ID = " + t1.getId() + ", Merkki = " + t1.getMerkki()
        + ", Malli = " + t1.getMalli() + ", Pesuohjelma = " + t1.getPesuohjelma() + ".");

        System.out.println("Tiskikoneen 2 ID = " + t2.getId() + ", Merkki = " + t2.getMerkki()
        + ", Malli = " + t2.getMalli() + ", Pesuohjelma = " + t2.getPesuohjelma() + ".");
    }
}

