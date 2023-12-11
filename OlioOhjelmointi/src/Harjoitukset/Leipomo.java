package Harjoitukset;

public class Leipomo {
    public static void main(String[] args) {
        
        Leipa l1 = new Leipa(13, "reikäleipä", 4, "hiiva, vehnäjauho, suola");
        Leipa l2 = new Leipa(4, "ruisleipä", 3, "maito, ruisjauho, sokeri");

        tulosta(l1);
        tulosta(l2);
    }

    public static void tulosta(Leipa l) {
        System.out.println("------- Leivän tiedot -------");
        System.out.println("Id = "+l.getId());
        System.out.println("Tyyppi = "+l.getTyyppi());
        System.out.println("Hinta = "+l.getHinta()+" EUR");
        System.out.println("Valmistusaineet = "+l.getValmistusaineet());
    }
}
