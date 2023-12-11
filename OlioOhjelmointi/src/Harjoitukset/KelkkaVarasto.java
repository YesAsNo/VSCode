package Harjoitukset;

public class KelkkaVarasto {
        public static void main(String[] args) {
            
            Potkukelkka pk1 = new Potkukelkka();

            pk1.setLeveys(24);
            pk1.setPituus(42);
            pk1.setValmistaja("HAMK Kelkat");
            pk1.setVari("Punainen");

            System.out.println("Potkukelkan Leveys = " + pk1.getLeveys() + ", Pituus = " + pk1.getPituus() + ", Valmistaja = "
            + pk1.getValmistaja() + ", Vari = " + pk1.getVari());
        }
}
