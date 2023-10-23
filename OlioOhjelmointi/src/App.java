public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Tämä on testi!");

        Henkilo h1=new Henkilo();
        Henkilo h2=new Henkilo();
        Henkilo h3=new Henkilo();

        h1.setId(100);
        h1.setNimi("Kalle");

        h2.setId(130);
        h2.setNimi("Liisa");

        h3.setId(98);
        h3.setNimi("Pekka");

        System.out.println("Henkilön 1 id on " + h1.getId() + " ja nimi on " + h1.getNimi() + ".");
        System.out.println("Henkilön 2 id on " + h2.getId() + " ja nimi on " + h2.getNimi() + ".");
        System.out.println("Henkilön 3 id on " + h3.getId() + " ja nimi on " + h3.getNimi() + ".");
    }
}
